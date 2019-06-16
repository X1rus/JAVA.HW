package video3;

import java.util.Calendar;

public class Person {


    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void Age(int age) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        System.out.println("Full years: " + (year - age));
    }

    public Person Input(String name, int year) {
        Person newPerson = new Person();
        newPerson.setName(name);
        newPerson.setBirthYear(year);
        return newPerson;
    }

    public void Output(Person p)
    {
        //return "Name: "+p.getName()+" Age: "+p.getBirthYear();
        System.out.println("Name: "+p.getName()+" Age: "+p.getBirthYear());
    }

    public void changeName(Person p, String newName)
    {
      p.setName(newName);
       System.out.println("Name chenged on: "+p.getName());

    }
    @Override
    public String toString()
    {
        return "Name: "+getName()+" Age: "+getBirthYear();
    }
}
