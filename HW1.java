package Video8;

import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence;
        System.out.println("Enter in the console sentence of five words.:\t");
        sentence = in.nextLine();
        String[] arr = sentence.split(" ");
        System.out.println(maxLenght(arr));
        arr[1] = new StringBuffer(arr[1]).reverse().toString();
        System.out.println("second word revers: " + arr[1]);
    }

    private static String maxLenght(String[] st) {
        int max = st[0].length();
        String word = st[0];
        for (int i = 0; i < st.length; i++) {
            if (st[i].length() > max) {
                word = st[i];
                max = st[i].length();
            }
        }
        return word + " " + max;
    }

}
