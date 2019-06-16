package video3;

import static video3.Employee.getSalary;
import static video3.Employee.totalSum;

public class TaskEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Vova", 200, 140);
        Employee emp2 = new Employee("Olia", 230, 140);
        Employee emp3 = new Employee("Valera", 300, 140);


        totalSum=getSalary(emp1.getRate(),emp1.getHours())+getSalary(emp2.getRate(),emp2.getHours())+getSalary(emp3.getRate(),emp3.getHours());
        System.out.println("total sum: "+totalSum);
    }
}

class Employee {
    private String name;
    private int rate;
    private int hours;
    public static int totalSum;

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public  static int getSalary(int rate, int hours) {
        return rate*hours;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Rate: " + getRate() + " Hours: " + getHours();
    }

    public static void getBonuses(int rate) {
        double bonus = rate * 1.1;
        System.out.println("Bonuese: " + bonus);
    }


}
