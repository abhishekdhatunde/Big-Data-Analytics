import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DistributedFileSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://localhost:9000");
        try(DistributedFileSystem dfs = (DistributedFileSystem) FileSystem.get(conf)) {
            Path path = new Path("/user/niranjan/emp/input/emp.csv");
            try(FSDataInputStream din = dfs.open(path)) {
                try(Scanner sc = new Scanner(din)) {
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
