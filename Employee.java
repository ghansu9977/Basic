
//Explain the importance of toString() and equals() method of the Object class and override them on class Employee (empId,name,salary).
//Create class for main method(say XYZ),and accept five employees information and store in an array. Also ensure if entered empId already exist or not (use ////equals method).
//Display all employee info using toString() method.

import java.util.Scanner;

class Employee {

    private String empId;
    private String name;
    private int Salary;

    // create a default constructer();

    public Employee() {

    }

    // create a paramitrized Constructer();

    public Employee(String empId, String name, int Salary) {

        this.empId = empId;
        this.name = name;
        this.Salary = Salary;
    }

    public String getempId() {
        return empId;
    }

    public String toString() {
        return ("\nEmployee Id: " + empId + "\nSalary: " + Salary+ "\nName: " + name);
    }

    // create a show method();
    // void show() {
    // System.out.println("\nEmployee Id: " + empId);
    // System.out.println("Name: " + name);
    // System.out.println("Salary: " + Salary);

    // }
}

class TestMain1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] empArr = new Employee[5];

        String empId = "";
        for (int i = 0; i < empArr.length; i++) {
            System.out.println("\nEnter" + (i + 1) + "Employee Details: ");

            while (i >= 0) {
                System.out.print("\nEnter Employee Id: ");
                empId = sc.next();
                int j = 0;
                for (j = 0; j < i; j++) {

                    if ((empArr[j].getempId()).equals(empId))
                        break;
                }
                if (j == i)
                    break;

                else
                    System.out.println("\n Enter Employee ID Exits, \nplease re-enter Employee Id: ");
            }

            System.out.print("Enter a Name: ");
            String name =sc.nextLine();
            name = sc.nextLine();
            
            System.out.print("Enter a Salary: ");
            int salary = sc.nextInt();

            empArr[i] = new Employee(empId, name, salary);

        }

        for (int i = 0; i < empArr.length; i++) {

            System.out.println(empArr[i].toString());
        }
    }
}
