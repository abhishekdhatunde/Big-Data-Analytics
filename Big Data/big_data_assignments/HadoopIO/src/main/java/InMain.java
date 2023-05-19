import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DistributedFileSystem;

import java.util.Scanner;

public class InMain {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://localhost:9000");
        try(DistributedFileSystem dfs = (DistributedFileSystem) FileSystem.get(conf)) {
            try(FSDataInputStream dis = dfs.open(new Path("/user/niranjan/tmp.txt"))) {
                try(Scanner sc = new Scanner(dis)) {
                    while (sc.hasNextLine()) {
                        System.out.println(sc.nextLine());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
