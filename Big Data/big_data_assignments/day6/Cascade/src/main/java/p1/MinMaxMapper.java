package p1;

import org.apache.hadoop.io.MapWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MinMaxMapper extends Mapper<Text, Text, NullWritable, Text> {
    NullWritable nullWr = NullWritable.get();
    Text yearTempWr = new Text();
    @Override
    protected void map(Text key, Text value, Mapper<Text, Text, NullWritable, Text>.Context context)
            throws IOException, InterruptedException {
        String yearTemp = key.toString() + "," + value.toString();
        yearTempWr.set(yearTemp);
        context.write(nullWr, yearTempWr);
    }
}
