package p1;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class StateMapper extends Mapper<LongWritable, Text, Text, Text> {
    Text stateWr = new Text();
    Text recordWr = new Text();

    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, Text>.Context context)
            throws IOException, InterruptedException {
        try {
            String line = value.toString();
            String[] parts = line.split(",");
            String state = parts[0];
            try {
                int Confirmed = Integer.parseInt(parts[1]);
                String records = parts[1] + "-" + parts[2] + "-" + parts[3] + "-" + parts[4] ;
                stateWr.set(state);
                recordWr.set(records);
                context.write(stateWr, recordWr);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
