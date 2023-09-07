import java.util.Scanner;
class Automorephic{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        
        double result;
        double rem=n%10;

        result=Math.pow(n,2);
        double rem2 = result % 10;
        
        if(rem == rem2){
            System.out.println("it is a Automorephic number.");
        }
        else{
            System.out.println("It is a not Automorephic number.");
        }
    } 
}