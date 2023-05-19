package p1;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.Arrays;

public class NCDCYearlyAvgMapper extends Mapper<LongWritable, Text, IntWritable, DoubleWritable> {
    static final int INVALID_TEMP = 9999;
    static final int[] VALID_QUALITIES = {0, 1, 2, 4, 5, 9};
    IntWritable yearWr = new IntWritable();
    DoubleWritable tempWr = new DoubleWritable();

    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, IntWritable, DoubleWritable>.Context context)
            throws IOException, InterruptedException {
        String line = value.toString();

        try {
            int year = Integer.parseInt(line.substring(15,19));
            double temperature = Double.parseDouble(line.substring(87, 92));
            int quality = Integer.parseInt(line.substring(92,93));
            if(Arrays.binarySearch(VALID_QUALITIES, 0, VALID_QUALITIES.length, quality) != -1
                    && (int)temperature != INVALID_TEMP) {
                context.getCounter(NCDCJobCounters.VALID_READING).increment(1);
                yearWr.set(year);
                tempWr.set(temperature);
                context.write(yearWr, tempWr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
