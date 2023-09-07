// Create a class Student with two members : rollno and percentage.
// 	Create default and parameterized constructors.
// Create method show() to 	display information.
// 	Create another class CollegeStudent inherits Student class. Add a new membersemester to it. Create default and parameterized constructors. Also override show() method.
// 	Create another class SchoolStudent inherits Student class. Add a new memberclassname(eg 12 th ,10 th etc.) to it. Create default and parameterized 	constructors. Also override show() method.

import java.util.Scanner;

public class Student {

    private int rollno;
    private double percentage;

    // create a Default Constructer();

    public Student() {

    }

    // Create a Paramitrized Constructer();

    public Student(int rollno, double percentage) {

        // Current Obj

        this.rollno = rollno;
        this.percentage = percentage;

    }

    public double getpercentage() {

        return percentage;
    }

    public int getrollno() {
        return rollno;
    }

    // create a Show Method();

    void Show() {

        // Print the value of rollno and percentage;

        System.out.println("Roll No: " + rollno);
        System.out.println("Percentage: " + percentage);
    }

    public void student(){

        System.out.println("It is a Student");
    }
}

// create a another class for college Students and CollegeStudents class Inherit
// of Student(Student is Parent class and College Student is child class.)

class CollegeStudent extends Student {

    private String membersemester;

    // creata a default Constructer;

    public CollegeStudent() {

    }

    // creata a Paramitrized Constructer;

    public CollegeStudent(int rollno, double percentage, String membersemester) {

        // Call for Super();

        super(rollno, percentage);
        this.membersemester = membersemester;
    }


    // Override for Show Method();

    void Show() {

        // Print the value of rollno and percentage and memberSemester;

        super.Show();
        System.out.println("member Semester: " + membersemester);

    }

    public void student(){

        System.out.println("It is a CollegeStudent");
    }

}

// create a new child class for School Student{}.and that School Student class
// parent class for Student[];

class SchoolStudent extends Student {

    private String memberclassname;

    // create a defult Constructer();

    public SchoolStudent() {

    }

    // create a Paramitrized Constructer();

    public SchoolStudent(int rollno, double percentage, String memberclassname) {

        // call for super();

        super(rollno, percentage);
        this.memberclassname = memberclassname;
    }

    // override for show method();

    void Show() {

        super.Show();
        System.out.println("Member class Name: " + memberclassname);

    }

    public void student(){

        System.out.println("It is a SchoolStudent");
    }

}

// create a main class for Testing the code;

class XYZ2 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a roolNo.: ");
        int r=sc.nextInt();

        Student [] arr = new Student[5];

        arr[0] = new CollegeStudent(101,85.5,"2nd");
        arr[1] = new CollegeStudent(201,25.5,"3rd");
        arr[2] = new SchoolStudent(301,15.5,"10th");
        arr[3] = new SchoolStudent(401,45.5,"11th");
        arr[4] = new SchoolStudent(501,95.5,"12th");

        for(int i=0; i<arr.length; i++){
            arr[i].Show();
            System.out.println("-----------------------------------------------------");
        }

        // create a countfor how many Student in A grade (above 75%);
        
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].getpercentage() > 75)
            count++;
        }
        System.out.println("Students have grade A: "+count);

        for(int i=0; i<arr.length; i++){
            
            if(r == arr[i].getrollno()){
                arr[i].student();
                    break;
            

            }

            if(r == arr.length)
                System.out.println("Not Found");             
        }       
    }
}