import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import java.io.IOException;

public class EmpDriver {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {

        Configuration conf = new Configuration();

        Job job = Job.getInstance(conf);

        job.setJarByClass(EmpDriver.class);

        job.setMapperClass(EmpMapper.class);
        job.setMapOutputKeyClass(IntWritable.class);
        job.setOutputValueClass(DoubleWritable.class);

        job.setReducerClass(EmpReducer.class);
        job.setOutputKeyClass(IntWritable.class);
        job.setOutputValueClass(DoubleWritable.class);

        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputValueClass(TextInputFormat.class);

        TextInputFormat.setInputPaths(job,"/classwork/input");
        TextOutputFormat.setOutputPath(job, new Path("/classwork/output1"));

        job.submit();
        boolean success = job.waitForCompletion(true);
        int ret = success ? 0 : 1;
        System.exit(ret);
    }
}
