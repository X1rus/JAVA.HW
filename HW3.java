package Video8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the sentence with US : ");
        String str = in.nextLine();

        Pattern p = Pattern.compile("\\$[0-9]+(\\.[0-9]{0,2})?");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(str.substring(m.start(), m.end()));
        }
    }
}
