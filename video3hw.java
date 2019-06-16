package video3;

import java.util.Scanner;

public class video3hw {
     public static void main(String[] args)
     {
         Person person=new Person();
         Scanner in=new Scanner(System.in);

         Person newPerson1=new Person("PersonName1",1966);
         Person newPerson2=new Person("PersonName2",1977);
         Person newPerson3=new Person("PersonName3",1988);
         Person newPerson4=new Person("PersonName4",1999);
         Person newPerson5=new Person("PersonName5",2000);

         person.Output(newPerson1);
         person.Output(newPerson2);
         person.Output(newPerson3);
         person.Output(newPerson4);
         person.Output(newPerson5);

         System.out.println("enter birth year: " );
         int bd=in.nextInt();

         person.Age(bd);

         person.Input("SomeName",1977);

         person.changeName(newPerson1,"Alex");

    }
}
