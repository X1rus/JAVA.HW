package com.ss;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Video 1 HW 1");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter parameters:\n");
        int param = in.nextInt();
        System.out.println("Perimeter: " + (2 * Math.PI * param));
        System.out.println("\nArea: " + (Math.PI * Math.pow(param, 2)));


        System.out.println("\n-------------------------------------------------------------");
        System.out.println("\nVideo 1 HW 2");
        String inputName,inputAddress;
        System.out.println("\nWhat is your name?\n");
        inputName=in.next();
        System.out.println("\nWhere are you live, "+inputName+"?\n");
        inputAddress=in.next();
        System.out.println("\nYou name is "+inputName+" and you live in "+inputAddress+"\n");

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("\nVideo 1 HW 3");
        double c1,c2,c3;
        double t1,t2,t3;
        System.out.println("\nUnits per minute for first country: ");
        c1=in.nextDouble();
        System.out.println("\nUnits per minute for second country: ");
        c2=in.nextDouble();
        System.out.println("\nUnits per minute for third country: ");
        c3=in.nextDouble();

        System.out.println("\nTalks minute for first country: ");
        t1=in.nextDouble();
        System.out.println("\nTalks minute for second country: ");
        t2=in.nextDouble();
        System.out.println("\nTalks minute for third country: ");
        t3=in.nextDouble();


        System.out.println("\nComputer will count for first call: "+c1*t1+"\t second call: "+
                c2*t2+" \tthird call: "+c3*t3+"\tcall together: "+(c1*t1+c2*t2+c3*t3));



    }
}

