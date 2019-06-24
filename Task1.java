package Video9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Enter side a: ");
        a = in.nextInt();
        System.out.println("Enter side b: ");
        b = in.nextInt();
        try {
            System.out.println(squareRectangle(a,b));
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }


    }

    public static int squareRectangle(int a, int b) throws MyExeption {
        if (a <= 0 || b <= 0)
            throw new MyExeption("a or b can not was - or 0");
        return a * b;
    }

}

class MyExeption extends Exception {

    public MyExeption() {
    }

    public MyExeption(String cause) {
        super(cause);
    }
}
