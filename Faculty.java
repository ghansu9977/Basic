/* Create three classes  Faculty  (facultyid, salary), FullTimeFaculty  (basic, allowance) inherits class Faculty, PartTimeFaculty  (hour, rate) inherits class Faculty. 
 Create   a   method   for   accepting   input   in   FullTimeFaculty       and  PartTimeFaculty,  but   salary  should   not   be   accepted.    salary   is  calculated   on   the   basis   of   (basic+allowance)   for   FullTimeFaculty   and  (hour*rate)   for   PartTimeFaculty.   Also   create   method   in   above   classes   to  display faculty data. 
 Create   another   class(say   XYZ)   for   main   method   and   store   2 fulltime and 2 parttime faculty information. Also print their details. 
*/

public class Faculty {

    private int FacultyId;
    private double Salary;

    // create a paramitrized constructer();

    public Faculty(int FacultyId, double Salary) {
        this.facultyId = FacultyId;
        this.Salary = Salary;

    }

    // create a display method();

    void display() {
        System.out.println("FacultyId : " + FacultyId);
        System.out.println("Salary : " + Salary);
    }
}

// create a child class().

class FullTimeFaculty extends Faculty {

    private double basic;
    private double allowance;

    // create a paramitrized Constructer();
    public FullTimeFaculty(int facultyid, double Salary, double basic, double allowance) {

        // call for parent class Faculty();

        super(facultyid);

        // obj for Current Obj();
        this.basic = basic;
        this.allowance = allowance;
        this.salary = basic + allowance;
    }

    // create a now for display method();

    public void display() {
        super.display();
        System.out.println("Basic: " + basic);
        System.out.println("Allowance: " + allowance);
    }
}

    class PartTimeFaculty extends Faculty {

    private int hour;
    private double rate;

    // create a paramitrized Constructer();

    public PartTimeFaculty(int hour, double rate, int facultyid, double Salary) {

        // call for Super();

        super(facultyid, Salary);
        this.hour = hour;
        this.rate = rate;

    }
    // create a display method();

    public void display() {

        super.display();
        System.out.println("Hour: " + hour);
        System.out.println("rate: " + rate);
        System.out.println("Parttime Faculty: " + (hour * rate));
    }
}

// Create a TestMain class();

class FacultyMain {
    public static void main(String[] args) {
        FullTimeFaculty obj = new FullTimeFaculty(101, 5000, 100000);
        FullTimeFaculty obj1 = new FullTimeFaculty(102, 5002, 100003);
        PartTimeFaculty obj2 = new PartTimeFaculty(101, 5000, 100000);
        PartTimeFaculty obj3 = new PartTimeFaculty(102, 5002, 100003);


        // creata a array for Faculties [];
        Faculty[] faculties = {obj,obj1, obj2, obj3};

        for (int i = 0; i < faculties.length; i++) {
            faculties[i].display();
        }
    }
}
