package Video7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task1 {
   public static ArrayList<Integer> myCollection = new ArrayList<>();
   public static ArrayList<Integer> newCollection = new ArrayList<>();
    public static void main(String[] args) {


        Random r = new Random();

        //Test1
        addNumbers(r);


        System.out.println(myCollection.toString());

        upFife();

        System.out.println(newCollection.toString());

        upTwenty();

        newCollection.add(2, 1);
        newCollection.add(8, -3);
        newCollection.add(5, -4);
        Collections.sort(newCollection);
        System.out.println(newCollection.toString());


    }

    public static void upTwenty() {
        myCollection.removeIf(i -> (i > 20));
        System.out.println(myCollection.toString());
    }

    public static void upFife() {
        for (Integer i : myCollection) {
            if (i > 5) newCollection.add(i);
        }
    }

   public static void addNumbers(Random r) {
        for (int i = 0; i < 10; i++) {
            myCollection.add(r.nextInt(30));
        }
    }
}
