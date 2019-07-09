package Video5;
/*Create class Car with fields type, year of production and engine capacity.
 Create and initialize four instances of class Car.
 Display cars
 certain model year  (enter year in the console);
ordered by the field year.
*/
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

        Car tmp=new Car();
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].Year > cars[j].Year) {
                    tmp.Year = cars[i].Year;
                    tmp.carName=cars[i].carName;
                    tmp.capacity=cars[i].capacity;

                    cars[i].Year = cars[j].Year;
                    cars[i].carName=cars[j].carName;
                    cars[i].capacity=cars[j].capacity;

                    cars[j].Year = tmp.Year;
                    cars[j].carName=tmp.carName;
                    cars[j].capacity=cars[j].capacity;
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

    public Car() {
    }
}