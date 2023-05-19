package p1;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
public class StateDriver extends Configured implements Tool {
    public static void main(String[] args) {
        try {
            GenericOptionsParser parser = new GenericOptionsParser(args);
            Configuration conf = parser.getConfiguration();

            StateDriver driver = new StateDriver();
            int ret = ToolRunner.run(conf, driver, args);
            System.exit(ret);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int run(String[] strings) throws Exception {
        if(strings.length != 2) {
            System.exit(1);
        }
        Configuration conf = this.getConf();
        Job job = Job.getInstance(conf);

        job.setJarByClass(StateDriver.class);
        job.setMapperClass(StateMapper.class);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(Text.class);

        job.setNumReduceTasks(0);

//        job.setReducerClass(EmpReducer.class);
//        job.setOutputKeyClass(Text.class);
//        job.setOutputValueClass(Text.class);

        // give input format and output format
        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputFormatClass(TextOutputFormat.class);
        // give input & output dir path (of hdfs)

        TextInputFormat.setInputPaths(job, strings[0]);
        TextOutputFormat.setOutputPath(job, new Path(strings[1]));
        // submit job to cluster and wait for its completion
        job.submit();
        boolean success = job.waitForCompletion(true);
        int ret = success ? 0 : 1;
        return ret;
    }
}

