class BankAccount {
    String account_holder_name;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Account Holder Name: " + account_holder_name);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountProgram {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.account_holder_name = "Kavya";
        account.balance = 5000;

        account.deposit(2000);
        account.withdraw(1500);
        account.checkBalance();
    }
}
