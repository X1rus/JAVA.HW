package Video5;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        Car[] cars=new Car[4];
        cars[0]=new Car("Porshe",1967,250);
        cars[1]=new Car("Audi",1995,150);
        cars[2]=new Car("BMW",1973,250);
        cars[3]=new Car("VW",2002,100);


        Scanner in=new Scanner(System.in);
        System.out.println("enter the car year");
        int numb=in.nextInt();
        for (int i = 0; i < cars.length; i++) {
            if(numb==cars[i].Year) System.out.println(cars[i].carName+"\t"+cars[i].Year+"\t"+cars[i].capacity);
        }
        System.out.println("ordered by the field year.");

        int tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].Year > cars[j].Year) {
                    tmp = cars[i].Year;
                    cars[i].Year = cars[j].Year;
                    cars[j].Year = tmp;
                }
            }
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].carName+"\t"+cars[i].Year+"\t"+cars[i].capacity);
        }

    }
}
class Car
{
    String carName;
    int Year;
    int capacity;

    public Car(String carName, int year, int capacity) {
        this.carName = carName;
        Year = year;
        this.capacity = capacity;
    }
}
