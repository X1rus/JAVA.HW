package Video8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("Enter Surname Name Patronymic    :\t");
        name = in.nextLine();
        String[] arr = name.split(" ");

        System.out.println(arr[0]+" "+arr[1].toUpperCase().charAt(0)+"."+arr[2].toUpperCase().charAt(0)+".");
        System.out.println(arr[1]);
        System.out.println(arr[1]+" "+arr[2]+" "+arr[0]);
    }
}
