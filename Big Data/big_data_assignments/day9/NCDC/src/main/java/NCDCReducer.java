import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class NCDCReducer extends Reducer<IntWritable, DoubleWritable, IntWritable, DoubleWritable> {
    DoubleWritable avgTempWr = new DoubleWritable();

    @Override
    protected void reduce(IntWritable key, Iterable<DoubleWritable> values,
                          Reducer<IntWritable, DoubleWritable, IntWritable, DoubleWritable>.Context context)
            throws IOException, InterruptedException {
        double total = 0.0;
        int count = 0;

        for(DoubleWritable tempWr:values) {
            double temp = tempWr.get();
            total += temp;
            count++;
        }
        double avgTemp = total / count;
        avgTempWr.set(avgTemp);
        context.write(key, avgTempWr);
    }
}
