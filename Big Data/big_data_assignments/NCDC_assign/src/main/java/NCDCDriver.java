import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class NCDCDriver extends Configured implements Tool {
    public static void main(String[] args) {
        try {
            GenericOptionsParser parser = new GenericOptionsParser(args);
            Configuration conf = parser.getConfiguration();

            NCDCDriver driver = new NCDCDriver();
            int ret = ToolRunner.run(conf, driver, args);
            System.exit(ret);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int run(String[] strings) throws Exception {
        Configuration conf = this.getConf();
        Job job = Job.getInstance(conf);

        job.setJarByClass(NCDCDriver.class);

        job.setMapperClass(NCDCMapper.class);
        job.setMapOutputKeyClass(IntWritable.class);
        job.setMapOutputValueClass(DoubleWritable.class);

        job.setReducerClass(NCDCReducer.class);
        job.setOutputKeyClass(IntWritable.class);
        job.setOutputValueClass(DoubleWritable.class);

        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputFormatClass(TextOutputFormat.class);

        TextInputFormat.setInputPaths(job, strings[0]);
        TextOutputFormat.setOutputPath(job, new Path(strings[1]));

        job.submit();
        boolean success = job.waitForCompletion(true);
        int ret = success ? 0 : 1;
        return ret;
    }
}
