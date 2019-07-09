package Video5;
/*Ask user to enter the number of month.
 Read the value and write the amount of days in this month
 (create array with amount days of each month).
 */
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of month");
        int n=in.nextInt()-1;
        int[] days=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("days in this month: "+days[n]);
    }
}

