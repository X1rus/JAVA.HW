package com.ss;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println("Enter 2 digest");
        Scanner in=new Scanner(System.in);
        int  a,b;
        a=in.nextInt();
        b=in.nextInt();
        Operation(a,b);

        System.out.println("How are you?");
        String s=in.next();
        System.out.println("You are "+s);
    }
    public  static void  Operation(int a, int b)
    {
        System.out.println("a+b="+(a+b)+"\ta-b="+(a-b)+"\ta/b="+(a/b)+"\ta*b="+(a*b));
    }
}
