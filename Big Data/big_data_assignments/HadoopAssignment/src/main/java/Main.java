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

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://localhost:9000");
        try (DistributedFileSystem dfs = (DistributedFileSystem) FileSystem.get(conf)) {
            Path path = new Path("/user/niranjan/emp.csv");
            try (FSDataInputStream dis = dfs.open(path)) {
                try(Scanner sc = new Scanner(dis)) {
                    System.out.println(sc.next());
                    while (sc.hasNext()) {
                        String line = sc.next();
                        String[] details = line.split(",");

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
//        employees.stream().forEach(System.out::println);
//        employees.stream()
//                .sorted(Comparator.comparingInt(Employee::getSalary))
//                .forEach(System.out::println);

        ArrayList<Employee> sortedEmployees = (ArrayList<Employee>) employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(sortedEmployees);

        try(DistributedFileSystem dfs = (DistributedFileSystem) FileSystem.get(conf)) {
            String filePath = "/user/niranjan/emp.txt";
            Path txtPath = new Path(filePath);
            try(FSDataOutputStream fsDataOutputStream = dfs.create(txtPath)) {
                try(PrintStream out = new PrintStream(fsDataOutputStream)) {
                    for (Employee employee:sortedEmployees) {
                        out.println(employee);
                        fsDataOutputStream.hsync();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
