package Video4HW;

import java.util.Scanner;

public class HW4 {
    enum HTTPError
    {
        Error400,
        Error401,
        Error402,
        Error403
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b, c;
        System.out.println(" enter 3 numbers\n");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();

        inDiapason(a, b, c);

        int x, y, z;
        System.out.println(" enter 3 numbers\n");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        Max_Min(x,y,z);

        System.out.println(" enter error type (Error400,Error401,Error402,Error403)\n");
        String er=in.next();
        Error(er);
    }

    public static void inDiapason(float a, float b, float c) {
        if ((a >= -5 && a <= 5) && (b >= -5 && b <= 5) && (c >= -5 && c <= 5))
            System.out.println("Numbers in range [-5,5]");
        else
            System.out.println("Numbers is not in range [-5,5]");
    }

    public static void Max_Min(int x, int y, int z) {
        if (x > y && x> z) System.out.println("Max: " + x);
        else if (y > x && y > z) System.out.println("Max: " + y);
        else if (z > x && z > y) System.out.println("Max: " + z);

        if (x < y && x < z) System.out.println("Min: " + x);
        else if (y < x && y < z) System.out.println("Min: " + y);
        else if (z < x && z < y) System.out.println("Min: " + z);
    }

    public  static  void Error(String error)
    {
        HTTPError er=HTTPError.valueOf(error);
        switch (er)
        {
            case Error400:
                System.out.println("Error 400");
                break;
            case Error401:
                System.out.println("Error 401");
                break;
            case Error402:
                System.out.println("Error 402");
                break;
            case Error403:
                System.out.println("Error 403");
                break;
        }
    }
}
