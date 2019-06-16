package Video6;

public class Task2 {
    public static void main(String[] args) {
 Person[] people=new Person[3];
 people[0]=new Teacher();
 people[1]=new Student();
 people[2]=new Cleaners();

 for(Person p: people)
 {
     p.print();
     p.Salary();
 }
    }
}
abstract class Person extends Staff
{

    abstract void print();

    @Override
    void Salary() {

    }


}
abstract class Staff
{
    abstract void Salary();

}

class Student extends Person
{
    final  String TYPE_PERSON="Student";
    @Override
    void print() {
        System.out.println("I am a "+TYPE_PERSON);
    }
}
class Cleaners extends Person
{
    final  String TYPE_PERSON="Cleaners";
    @Override
    void print() {
        System.out.println("I am a "+TYPE_PERSON);
    }

    @Override
    void Salary() {
        System.out.println(TYPE_PERSON+" Some money");
    }
}
class Teacher extends Person
{
    final  String TYPE_PERSON="Teacher";
    @Override
    void print() {
        System.out.println("I am a "+TYPE_PERSON);
    }

    @Override
    void Salary() {
        System.out.println(TYPE_PERSON+" Some money");
    }
}
