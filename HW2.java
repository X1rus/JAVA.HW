package Video8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW2 {
    public static void main(String[] args) {
        String str = "I  am    learning   Java  Core";
        System.out.println("Before: " + str);
        String str1 = str.replaceAll("\\s+", " ");
        System.out.print("After: " + str1);
    }
}
