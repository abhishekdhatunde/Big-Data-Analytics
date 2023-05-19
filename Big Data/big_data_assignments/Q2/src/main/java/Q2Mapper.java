import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class Q2Mapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    Text letterWr = new Text();
    IntWritable countWr = new IntWritable();

    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
            throws IOException, InterruptedException {
        String line = value.toString();
        String[] letters = line.split("");
        for(String letter:letters) {
            letterWr.set(letter);
            countWr.set(1);
            context.write(letterWr, countWr);
        }
    }
}
