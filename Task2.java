package Video7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*У методі main () оголошуємо карту employeeMap пар <Integer, String>.
Додати до співробітникаМап сім пар (ID, ім'я) деяких осіб. Відображення карти на екрані.
Попросіть користувача ввести ідентифікатор, потім знайдіть та напишіть відповідну назву з карти.
 Якщо ви не можете знайти цей ідентифікатор - скажіть про це користувачеві (використовуйте функцію containsKey ()).
Попросіть користувача ввести ім'я, перевірте, чи маєте назву на карті, і напишіть відповідний ідентифікатор.
Якщо ви не можете знайти це ім'я - скажіть про це користувачеві (використовуйте функцію containsValue ()).*/
public class Task2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
        employeeMap.put(1, "Ivan");
        employeeMap.put(2, "Petro");
        employeeMap.put(3, "Marta");
        employeeMap.put(4, "Leonid");
        employeeMap.put(5, "Vasil");
        employeeMap.put(6, "Dmutro");
        employeeMap.put(7, "Rustam");

        System.out.println(employeeMap);
        System.out.println("Enter ID: \t");
        int id = in.nextInt();


//        if () {
//            if (employeeMap.containsKey(id)) {
//                System.out.println(employeeMap);
//
//            } else {
//                System.out.println("dont have Id in database");
//
//
//            }
//        }
    }
}
