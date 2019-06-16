package Video5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Employee emp[] = new Employee[]{
                new Employee("Ivan", 1, 500),
                new Employee("Petro", 2, 200),
                new Employee("Oleg", 3, 300),
                new Employee("Iruna", 2, 250),
                new Employee("Marta", 1, 340)
        };
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of department:");
        int numb=in.nextInt();
        for (int i = 0; i < emp.length; i++) {
            if(numb==emp[i].department) System.out.println(emp[i].name+"\t"+emp[i].department+"\t"+emp[i].salary);
        }
        System.out.println("arrange workers by the field salary in descending order");

        int tmp;
        for (int i = 0; i < emp.length - 1; i++) {
            for (int j = i + 1; j < emp.length; j++) {
                if (emp[i].salary < emp[j].salary) {
                    tmp = emp[i].salary;
                    emp[i].salary = emp[j].salary;
                    emp[j].salary = tmp;
                }
            }
        }
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].name+"\t"+emp[i].department+"\t"+emp[i].salary);
        }

    }

}

class Employee {
    String name;
    int department;
    int salary;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
