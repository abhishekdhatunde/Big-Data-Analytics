
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class Q2Driver extends Configured implements Tool {
    public static void main(String[] args) {
        try {
            GenericOptionsParser parser = new GenericOptionsParser(args);
            Configuration conf = parser.getConfiguration();

            Q2Driver driver = new Q2Driver();
            int ret = ToolRunner.run(conf, driver, args);
            System.exit(ret);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int run(String[] args) throws Exception {
        // create a new MR job and assign name
        Configuration conf = this.getConf();
        Job job = Job.getInstance(conf);
        // mention jar in which mapper and reducer class is available
        job.setJarByClass(Q2Driver.class);
        // give mapper class and its output key/value type
        job.setMapperClass(Q2Mapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);
        // give reducer class and its output key/value type
        job.setReducerClass(Q2Reducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        // give input format and output format
        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputFormatClass(TextOutputFormat.class);
        // give input & output dir path (of hdfs)
        TextInputFormat.setInputPaths(job, args[0]);
        TextOutputFormat.setOutputPath(job, new Path(args[1]));
        // submit job to cluster and wait for its completion
        job.submit();
        boolean success = job.waitForCompletion(true);
        int ret = success ? 0 : 1;
        return ret;
    }
}