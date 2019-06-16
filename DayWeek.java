package Video4HW;

import java.util.Scanner;

public class DayWeek {
    public static void main(String[] args) {
        int dayOfWeek;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter day of the week [1,2,3,4,5,6,7]: ");
        dayOfWeek=in.nextInt();
        switch ( dayOfWeek)
        {
            case 1:
                System.out.println("Monday, Понеділок, Понедельник");
                break;
            case 2:
                System.out.println("Tuesday, Вівторок, Вторник");
                break;
            case 3:
                System.out.println("Wednesday, Середа, Среда");
                break;
            case 4:
                System.out.println("Thursday, Четверг, Четверг");
                break;
            case 5:
                System.out.println("Friday, П'ятниця, Пятница");
                break;
            case 6:
                System.out.println("Saturday, Субота, Суббота");
                break;
            case 7:
                System.out.println("Sunday, Неділя, Воскресенье");
                break;
        }
    }
}
