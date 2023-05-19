import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DistributedFileSystem;

public class Status {
    public static void main(String[] args) {

        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://localhost:9000");
        try(DistributedFileSystem dfs = (DistributedFileSystem) FileSystem.get(conf)) {

            FileStatus[] files = dfs.listStatus(new Path("/user/niranjan"));

            for (FileStatus file:files) {
                System.out.print(file.getPath().getName()+" ");
                System.out.println(file.getLen());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
