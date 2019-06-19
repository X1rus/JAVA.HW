package Video7;

import java.util.ArrayList;
import java.util.Comparator;

import static Video7.Student.printStudent;
public class HW3 {
    public static void main(String[] args) {
ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Ivan",1));
        students.add(new Student("Petro",2));
        students.add(new Student("Iruna",3));
        students.add(new Student("Maxum",2));
        students.add(new Student("Oleg",1));


        students.sort(new NameComparator());
        for(Student st: students)
            System.out.println(st);
        System.out.println("\n");
        students.sort(new CoursComparator());
        for(Student st: students)
            System.out.println(st);

        System.out.println("\n");
        printStudent(students,2);
    }
}
class Student
{
    String name;
    int cours;

    public Student(String name, int cours) {
        this.name = name;
        this.cours = cours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

public  static ArrayList<Student> printStudent(ArrayList<Student> st, int cours)
{
    for(Student stud: st)
    {
        if(stud.cours==cours)
        {
            System.out.println(stud);
        }
    }

    return null;
}

public  static boolean Compare(Student st1, Student st2)
{

    return  true;
}
@Override
    public String toString()
{
    return "Student: "+name+"\tCours: "+cours;
}

}
class NameComparator implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
class  CoursComparator implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.cours-o2.cours;
    }
}
