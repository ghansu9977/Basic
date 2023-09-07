/*
 Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
Create default and parameterized constructor.
Method show(): to print all data member information.
Write main function in another class(Say XYZ) and store three TwoBHK flat’s.information and print information using show method. Also print total amount of all flats.
*/
public class OneBhK{
    
    private double roomArea;
    private double hallArea;
    private double price;

    // create a Default Constructer();

    public OneBhK(){

    }

    // create a Paramitrized Constructer();

    public OneBhK(double roomArea, double hallArea, double price){
        
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;

    }

    // create a Get method use for Return Value();

    public double getroomArea(){
        return roomArea;
    }

    public double gethallArea(){
        return hallArea;
    }

    public double getprice(){
        return price;
    }
}
     // Set the value for update value().
/* 
     public void setroomArea(double roomArea){
        this.roomArrea=roomArea;
     }

     public void sethallArea(double hallArea){
        this.hallArea=hallArea;
     }

     public void setprice(double price){
        this.price=price;
     }
 */
    


    //  class TestMain{
    //     public static void main(String[]args){
    //         OneBhK obj = new OneBhK();
    //         OneBhK obj1 = new OneBhK(5,15,10000);

    //         System.out.println("Default OneBhk");
    //         System.out.println("Room Area: "+obj. getroomArea());
    //         System.out.println("Room Area: "+obj.gethallArea());
    //         System.out.println("Room Area: "+obj.getprice());

    //         System.out.println("Paramitrized Constructer");
    //         System.out.println("Room Area: "+obj1.getroomArea());
    //         System.out.println("Room Area: "+obj1.gethallArea());
    //         System.out.println("Room Area: "+obj1.getprice());

    //     }
    //  }

class TwoBhk extends OneBhK {

    private double room2Area;
    private static double allFlatePrice = 0;

    // create a constructor();

    public TwoBhk() {

    }

    // create a Paramitrized Constructer();

    public TwoBhk(double roomArea, double hallArea, double price, double room2Area) {
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }

    void show() {
        super.show();
        System.out.println("Room 2 Area: " + room2Area);
    }

    // get the return value of price();

   // public double getprice() {
     //   return price;
  //  }

    // create a all flate amount to use for all flate amounmt method();

    public void allFlatePrice() {
        allFlatePrice += getprice();
    }

    // public void show methode to create now();

    public static void display() {
        System.out.println("Price of All Flats: " + allFlatePrice);
    }
}

    // create a Main Test class();

    class TwobhkMain1 {
        public static void main(String[]args) {


            System.out.println("\nInformation of TwoBhk Flat: ");
            
            // call for obj() of TwoBhk();

            TwoBhk flat2 = new TwoBhk(10, 15, 1200, 12);
            TwoBhk flat1 = new TwoBhk(12, 19, 1800, 18);
            TwoBhk flat3 = new TwoBhk(8, 13, 15000, 22);

            // call to show method();

            flat1.show();
            flat2.show();
            flat3.show();

            // call to all Flatprice Information for allFlatePrice()method;
            flat1.allFlatePrice();
            flat2.allFlatePrice();
            flat3.allFlatePrice();

            TwoBhk.display();

        }
    }

