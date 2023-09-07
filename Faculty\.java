/* Create three classes  Faculty  (facultyid, salary), FullTimeFaculty  (basic, allowance) inherits class Faculty, PartTimeFaculty  (hour, rate) inherits class Faculty. 
 Create   a   method   for   accepting   input   in   FullTimeFaculty       and  PartTimeFaculty,  but   salary  should   not   be   accepted.    salary   is  calculated   on   the   basis   of   (basic+allowance)   for   FullTimeFaculty   and  (hour*rate)   for   PartTimeFaculty.   Also   create   method   in   above   classes   to  display faculty data. 
 Create   another   class(say   XYZ)   for   main   method   and   store   2 fulltime and 2 parttime faculty information. Also print their details. 
*/

public class Faculty{

        private  int FacultyId;
        private  double Salary;

        // create a paramitrized constructer();

        public Faculty(int FacultyId){
            this.facultyid = facultyid;
        }

        // create a display method();

        void display(){
            System.out.println("FacultyId : "+FacultyId);
            System.out.println("Salary : "+Salary);
        }
}

public class FullTimeFaculty extends Faculty{

        private double basic;
        private double allowance;

        // create a paramitrized Constructer();
        public FullTimeFaculty(int facultyid, double Salary, double basic, double allowance){
            
            // call for parent class Faculty();

            super(facultyid);
            this.basic = basic;
            this.allowance = allowance;
            this.salary = basic + allowance;
        }

        // create a now for display method();

        void display(){
        super.display();
        System.out.println("Basic: "+basic);
        System.out.println("Allowance: "+allowance);
}
}


public class PartTimeFaculty extends Faculty{

        Private int hour;
        private double rate;

        // create a paramitrized Constructer();

        public PartTimeFaculty(int hour, double rate, int facultyid, double Salary){

            // call for Super();

            super(facultyid);
            this.hour = hour;
            this.rate = rate;
            this.Salary = Salary;
        }

        // create a display method();

        void display(){

            super display();
            System.out.println("Hour: "+hour);
            System.out.println("rate: "+rate);
        }
}

        // Create a TestMain class();


class XYZ{
    public static void main(String[]args){
        FullTimeFaculty obj = new FullTimeFaculty(101,5000,100000);
        FullTimeFaculty obj1 = new FullTimeFaculty(102,5002,100003);

        // creata a array for Faculties [];
        Faculty [] faculties = {obj1, obj2, obj3, obj4};

        for(int i = 0; i<faculties.length; i++){
            faculties.display();
        }
       }
}
