import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DistributedFileSystem;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://localhost:9000");
        try(DistributedFileSystem dfs = (DistributedFileSystem) FileSystem.get(conf)) {
            Path path = new Path("/user/niranjan/emp.csv");
            try(FSDataInputStream dis = dfs.open(path)) {
                try(Scanner sc = new Scanner(dis)) {
                    System.out.println(sc.next());
                    while (sc.hasNext()){
                        String[] details = sc.next().split(",");

                        Employee employee = new Employee();

                        employee.setId(Integer.parseInt(details[0]));
                        employee.setName(details[1]);
                        employee.setJob(details[2]);
                        employee.setSalary(Integer.parseInt(details[4]));
                        employee.setDeptno(Integer.parseInt(details[5]));

                        employees.add(employee);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(employees);

//        employees.stream()
//                .sorted(Comparator.comparingInt(Employee::getDeptno))
////                .filter(Employee::getDeptno == 10)
//                .forEach(System.out::println);

        ArrayList<Employee> sortedEmployees = (ArrayList<Employee>) employees.stream()
                .sorted(Comparator.comparingInt(Employee::getDeptno))
                .collect(Collectors.toList());

//        System.out.println(sortedEmployees);

        try(DistributedFileSystem dfs = (DistributedFileSystem) FileSystem.get(conf)) {
            Path path = new Path("/user/niranjan/sorted.txt");
            try(FSDataOutputStream dout = dfs.create(path) ) {
                try(PrintStream out = new PrintStream(dout)) {
                    for (Employee employee: employees) {
                        out.println(employee);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
