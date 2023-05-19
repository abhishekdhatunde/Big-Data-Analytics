import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class JavaFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Path:");
        String path = sc.nextLine();
//        File file = new File("~/Downloads");
        File file = new File(path);
        System.out.println(file.exists());
        System.out.println(Arrays.toString(file.listFiles()));
        System.out.println(file.getFreeSpace());
        System.out.println(file.getName());
        System.out.println(file.getParent());
    }
}
