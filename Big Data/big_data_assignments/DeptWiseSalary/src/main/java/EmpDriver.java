import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class EmpDriver extends Configured implements Tool {
    public static void main(String[] args) {
        try {
            GenericOptionsParser parser = new GenericOptionsParser(args);
            Configuration conf = parser.getConfiguration();

            EmpDriver driver = new EmpDriver();
            int ret = ToolRunner.run(conf, driver, args);

            System.exit(ret);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int run(String[] args) throws Exception {
        Configuration conf = this.getConf();

        Job job = Job.getInstance(conf, "DeptTotalSal");

        job.setJarByClass(EmpDriver.class);

        job.setMapperClass(EmpMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(DoubleWritable.class);

        job.setReducerClass(EmpReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(DoubleWritable.class);

        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputFormatClass(TextOutputFormat.class);

        TextInputFormat.setInputPaths(job, args[0]);
        TextOutputFormat.setOutputPath(job, new Path(args[1]));

        job.submit();
        boolean success = job.waitForCompletion(true);
        int ret = success ? 0 : 1;
        return ret;
    }
}
