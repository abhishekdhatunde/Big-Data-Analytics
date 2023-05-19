package p1;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class MinMaxReducer extends Reducer<NullWritable, Text, Text, Text> {
    Text yearWr = new Text();
    Text tempWr = new Text();

    @Override
    protected void reduce(NullWritable key, Iterable<Text> values, Reducer<NullWritable, Text, Text, Text>.Context context)
            throws IOException, InterruptedException {

        double maxTemp = -Double.MAX_VALUE;
        double minTemp = Double.MAX_VALUE;

        int maxTempYear = 0;
        int minTempYear = 0;

        for(Text yearTempWr : values) {

            String yearTemp = yearTempWr.toString();
            String[] parts = yearTemp.split(",");
            int year = Integer.parseInt(parts[0]);
            double temp = Double.parseDouble(parts[1]);

            if(temp > maxTemp) {
                maxTemp = temp;
                maxTempYear = year;
            }

            if(temp < minTemp) {
                minTemp = temp;
                minTempYear = year;
            }
        }
        String years = minTempYear + "/" + maxTempYear;
        yearWr.set(years);

        String temps = minTemp + "/" + maxTemp;
        tempWr.set(temps);

        context.write(yearWr, tempWr);
    }
}
