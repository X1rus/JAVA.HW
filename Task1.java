package Video8;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st1, st2;
        System.out.println("Enter first string:\t");
        st1 = in.next();
        System.out.println("Enter second string:\t");
        st2 = in.next();
        boolean is = st2.contains(st1);
        System.out.println(is);
    }
}
