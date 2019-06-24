package Video9;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) throws MyException {
        Scanner in = new Scanner(System.in);
        double a, b;
        System.out.println("Enter number a: ");
        a = in.nextDouble();
        System.out.println("Enter number b: ");
        b = in.nextDouble();
        try {
            System.out.println(divDouble(a, b));
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(divDouble(-0, 1.44));
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(divDouble(3.22, 0));
        } catch (MyException e) {
            e.printStackTrace();
        }

      divDouble(5.25, 2);
    }

    public static double divDouble(double a, double b) throws MyException {
        if (a == -0)
            throw new MyException("Error! 0 - positive number");
        if (b == 0)
            throw new MyException("Div by zero!");
        return a / b;
    }
}
//class MyExeption extends Exception {
//
//    public MyExeption() {
//    }
//
//    public MyExeption(String cause) {
//        super(cause);
//    }
//}


