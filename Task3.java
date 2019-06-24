package Video8;
/*
Ім'я користувача може містити від 3 до 15 символів латинського алфавіту,
 цифр і підкреслення. Використовуючи регулярні вирази,
 виконайте перевірку імені користувача на дійсність.
 Введіть п'ять імен в основний метод.
 Виведіть повідомлення на консоль перевірки кожного з введених імен.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0]="van33_";
        names[1]="Io";
        names[2]="oha22_n";
        names[3]="Qwertyuiopasdfhk";
        names[4]="WWe12";

        for(String ss:names)
        {
            System.out.println(ss+" "+checkWithRegExp(ss));
        }

    }

    public  static  boolean checkWithRegExp(String userName)
    {
        Pattern p=Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m=p.matcher(userName);
        return m.matches();
    }


}
