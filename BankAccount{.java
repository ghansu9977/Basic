public class BankAccount{

    // Data Security.
    private String accountNumber;
    private double balance;
     
    // Constructer Method.

    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter method are used to return the value for variable.

    public String get accountNumber(){
        return accountNumber;
    }

    public double get balance(){
        return balance;
    }

    //  create a method for Deposite in amount.

    public void Deposite(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposite: "amount);
        }
    }

    // create a method for Withdraw Amount.

    public void Withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdram : "+amount);

        }
        else{
            System.out.println("Insufficent Balance.");
        }
    }

}

class TestMain{
    public static void main(Stirng[]args){

        // create constructer on the use for difine value.
        BankAccount obj = new BankAccount("102030405060"10000);

        // getter method return value.
        System.out.println("Account Number: "+get accountNumber());
        System.out.println("Balance: "+get balance());

    }
}