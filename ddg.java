package Video8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ddg {

    public static void main(String[] args) {
        String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w+";
        String text = "my.mail@ua.ua";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.matches()) {
            System.out.print("Matches the entire text string");
            m.reset();
            System.out.println();
        }
        while (m.find()) {
            System.out.print(text.substring(m.start(),m.end())+ "*");
        }
    }
}

