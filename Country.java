package Video4HW;

import java.util.Scanner;

public class Country {
  public   enum Continent {
        AUSTRALIA,
        ANTARCTICA,
        SOUTH_AMERICA,
        NORTH_AMERICA,
        AFRICA,
        EURASIA

    }

    public static void main(String[] args) {

        System.out.println("Enter the country like (Australia,Antarctica,Ukraine,Chad, Usa, Columbia )");
        Scanner in = new Scanner(System.in);
        String country = in.next();
        Continent coun=null;
        switch (country)
        {
            case "Australia":
                System.out.println(coun.AUSTRALIA);
                break;
            case "Antarctica":
                System.out.println(coun.ANTARCTICA);
                break;
            case "Ukraine":
                System.out.println(coun.EURASIA);
                break;
            case "Chad":
                System.out.println(coun.AFRICA);
                break;
            case "Usa":
                System.out.println(coun.NORTH_AMERICA);
                break;
            case "Columbia":
                System.out.println(coun.SOUTH_AMERICA);
                break;

        }
    }
}

