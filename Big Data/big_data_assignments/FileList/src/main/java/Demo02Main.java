import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DistributedFileSystem;

import java.util.Scanner;

public class Demo02Main {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://localhost:9000");
        try(DistributedFileSystem dfs = (DistributedFileSystem) FileSystem.get(conf)){
            try(FSDataInputStream fsdis = dfs.open(new Path("/user/niranjan/f.txt"))){
                try(Scanner sc = new Scanner(fsdis)) {
                    while (sc.hasNext()) {
                        System.out.println(sc.next());
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
