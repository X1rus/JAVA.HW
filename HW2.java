package Video6;


import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {


        Employee[] empl = new Employee[6];
        empl[0] = new SalariesEmployee("Ivan");
        empl[1] = new ContractEmployee("Petro");
        empl[2] = new SalariesEmployee("Sergiy");
        empl[3] = new ContractEmployee("Oleg");
        empl[4] = new SalariesEmployee("Mukola");
        empl[5] = new ContractEmployee("Vsul");

        for (int i = 0; i < empl.length; i++) {

            System.out.println(empl[i].employee + "\t" + ((Pay) empl[i]).calculatePay(200));
        }
    }
}


interface Pay {
    int calculatePay(int p);
}

class Employee {
    public String employee;
}

class SalariesEmployee extends Employee implements Pay {
    public String getId() {
        return socialSecurityNumber;
    }

    public String socialSecurityNumber;

    public SalariesEmployee(String name) {
        super.employee = name;
    }

    @Override
    public int calculatePay(int hours) {
        return 3 * hours;
    }
}

class ContractEmployee extends Employee implements Pay {
    public String getId() {
        return federalTaxIdmember;
    }

    public String federalTaxIdmember;

    public ContractEmployee(String name) {
        super.employee = name;
    }


    @Override
    public int calculatePay(int fix) {
        return fix;
    }
}
