package p1;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Q3Mapper extends Mapper<LongWritable, Text, IntWritable, IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, IntWritable, IntWritable>.Context context)
            throws IOException, InterruptedException {
        String line = value.toString();
        String[] numbersString = line.split(",");
//        Arrays.stream(numbers).map(Integer.parseInt).collect(Collectors.toList());
//        int number = Integer.parseInt(Arrays.toString(line.split(",")));
        ArrayList<Integer> numbers = new ArrayList<>();

        for (String number : numbersString) {
            numbers.add(Integer.parseInt(number));
        }


    }
}
