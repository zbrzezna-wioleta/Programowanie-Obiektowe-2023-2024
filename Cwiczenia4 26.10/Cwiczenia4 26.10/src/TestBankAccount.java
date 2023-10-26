public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount();
        System.out.println(bank1.balance);
        bank1.deposit(100);
        System.out.println(bank1.balance);
        bank1.withdraw(45.99);
        System.out.println(bank1.balance);
    }
}
class BankAccount{
    double balance;
    void deposit(double amount){
        this.balance += amount;
    }
    void withdraw(double amount){
        this.balance -= amount;
    }
}