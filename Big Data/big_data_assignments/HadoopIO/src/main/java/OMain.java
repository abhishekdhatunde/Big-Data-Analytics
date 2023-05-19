import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DistributedFileSystem;

import java.io.PrintStream;

public class OMain {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://localhost:9000");
        try(DistributedFileSystem dfs = (DistributedFileSystem) FileSystem.get(conf)) {
            try(FSDataOutputStream dos = dfs.create(new Path("/user/niranjan/tmp2.txt"))) {
                try(PrintStream out = new PrintStream(dos)) {
                    out.println("vegwr");
                    out.println("vegwr487");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
