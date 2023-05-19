import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DistributedFileSystem;

import java.io.PrintStream;

public class OutMain {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://localhost:9000");
        try(DistributedFileSystem dfs = (DistributedFileSystem) FileSystem.get(conf)) {
            try(FSDataOutputStream dos = dfs.create(new Path("/user/niranjan/tmp.txt"))) {
                try(PrintStream out = new PrintStream(dos)) {
                    out.println("vevdc");
                    out.println("vevdvef");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
