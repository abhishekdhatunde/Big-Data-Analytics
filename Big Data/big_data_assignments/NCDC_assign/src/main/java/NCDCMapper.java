import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class NCDCMapper extends Mapper<LongWritable, Text, IntWritable, DoubleWritable> {
    IntWritable monthWr = new IntWritable();
    DoubleWritable tempWr = new DoubleWritable();

    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, IntWritable, DoubleWritable>.Context context)
            throws IOException, InterruptedException {

        String line = value.toString();

        int month = Integer.parseInt(line.substring(19,21));
        double temp = Double.parseDouble(line.substring(87,92));
        int quality = Integer.parseInt(line.substring(92,93));

        if((quality == 0 || quality == 1 || quality == 4 || quality == 5 || quality ==9) && ((int)temp != 9999)) {
            monthWr.set(month);
            tempWr.set(temp);
        }
        context.write(monthWr,tempWr);
    }
}
