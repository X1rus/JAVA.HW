package Video7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String value, name;
        HashMap<Integer, String> employeeMap = getIntegerStringHashMap();

        System.out.println(employeeMap);
        int id = getId(in);

        checkID(employeeMap, id);

        name = getString(in);


        checkName(name, employeeMap);


    }

    public static HashMap<Integer, String> getIntegerStringHashMap() {
        HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
        employeeMap.put(1, "Ivan");
        employeeMap.put(2, "Petro");
        employeeMap.put(3, "Marta");
        employeeMap.put(4, "Leonid");
        employeeMap.put(5, "Vasil");
        employeeMap.put(6, "Dmutro");
        employeeMap.put(7, "Rustam");
        return employeeMap;
    }

    public static String getString(Scanner in) {
        String name;
        System.out.println("\nEnter Name: \t");
        name = in.next();
        return name;
    }

    //finde by name
    public static boolean checkName(String name, HashMap<Integer, String> employeeMap) {
        if (employeeMap.containsValue(name)) {

            for (Map.Entry<Integer, String> key : employeeMap.entrySet()) {
                if (key.getValue().toString().equals(name)) {
                    System.out.println(key.getKey());
                }
            }
            return true;
        } else {
            System.out.println("Wrong ID");
            return false;
        }
    }

    //check entered id
    public static boolean checkID(HashMap<Integer, String> employeeMap, int id) {
        String value;
        if (employeeMap.containsKey(id)) {
            value = employeeMap.get(id);
            System.out.println(value);
            return true;
        } else {
            System.out.println("Wrong ID");
            return false;
        }
    }

    //read employee id
    public static int getId(Scanner in) {
        System.out.println("Enter ID: \t");
        return in.nextInt();
    }
}

