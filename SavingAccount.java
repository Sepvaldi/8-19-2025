package AccountTest;

public class SavingAccount {
    public double interestRate = 0.01;
    public double balance;
    public String name;

    public void cetak(){
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Interest Earn: " + (balance * interestRate));
        System.out.println("Total Balance: " + (balance + (balance * interestRate)));
        
        System.out.println("------------------------------------------------");


    }

    
}
