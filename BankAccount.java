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

    public String getaccountNumber(){
        return accountNumber;
    }

    public double getbalance(){
        return balance;
    }

    //  create a method for Deposite in amount.

    public void Deposite(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposite: "+amount);
        }
    }

    // create a method for Withdraw Amount.

    public void Withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdram : "+amount);

        }
        else{
            System.out.println("Insufficent Balance.");
        }
    }

}

class BankAccountMain1{
    public static void main(String[]args){
        double amount;


        // create constructer on the use for difine value.
        BankAccount obj = new BankAccount("102030405060",100);

        int dep = 1500;
        int with = 700;
        // getter method return value.
        System.out.println("Account Number: "+obj.getaccountNumber());
        System.out.println("Balance: "+obj.getbalance());
         
        // call for Deposite Method().
        obj.Deposite(dep);
        obj.Withdraw(with);

    }
}