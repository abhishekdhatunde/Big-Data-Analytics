import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class Q1Mapper extends Mapper<LongWritable, Text, Text, IntWritable> {
//    private Text wordWr = new Text();
    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
            throws IOException, InterruptedException {
        IntWritable countWr = new IntWritable(1);

        String line = value.toString();

        String[] words = line.split(" ");
        for (String word: words) {
//            wordWr.set(word);
//            countWr.set(1);
            Text wordWr = new Text(word);
            context.write(wordWr,countWr);
        }
    }
}
