import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class Q1Reducer extends Reducer<Text, IntWritable, Text, IntWritable> {
    private IntWritable totalCountWr = new IntWritable();
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
        int totalCount = 0;
        for (IntWritable countWr: values) {
            int count = countWr.get();
            totalCount += count;
        }
        totalCountWr.set(totalCount);
        context.write(key, totalCountWr);
    }
}
