package Video7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*Оголосити колекцію myCollection з 10 цілих чисел і заповнити її (з консолі або випадкового).
Знайдіть і збережіть у списку newCollection всі позиції елемента більше 5 у колекції. Роздрукувати новуколекцію
Видалити з колекції елементи myCollection, які більше 20. Друк результату
Вставити елементи 1, -3, -4 у положення 2, 8, 5. Результат друку у форматі: "позиція - xxx, значення елемента - xxx"
Сортування та друк колекції*/
public class Task1 {
    public static void main(String[] args) {

        ArrayList<Integer> myCollection=new ArrayList<>();
        ArrayList<Integer> newCollection=new ArrayList<>();
        Random r=new Random();
        for(int i=0;i<10;i++)
        {
            myCollection.add(r.nextInt(30));
        }


        System.out.println(myCollection.toString());

        for (Integer i: myCollection) {
            if(i>5) newCollection.add(i);
        }

        System.out.println(newCollection.toString());

        myCollection.removeIf(i->(i>20));
        System.out.println(myCollection.toString());

        newCollection.add(2,1);
        newCollection.add(8,-3);
        newCollection.add(5,-4);
        Collections.sort(newCollection);
        System.out.println(newCollection.toString());


    }
}
