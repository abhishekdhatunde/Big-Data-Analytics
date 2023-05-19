import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class EmpReducer extends Reducer<IntWritable, DoubleWritable, IntWritable, DoubleWritable> {
    private DoubleWritable totalSalWr = new DoubleWritable();

    @Override
    protected void reduce(IntWritable key, Iterable<DoubleWritable> values, Reducer<IntWritable, DoubleWritable, IntWritable, DoubleWritable>.Context context)
            throws IOException, InterruptedException {
        double total = 0.0;

        for (DoubleWritable salWr :values) {
            double sal = salWr.get();
            total += sal;
        }

        totalSalWr.set(total);
        context.write(key, totalSalWr);
    }
}
