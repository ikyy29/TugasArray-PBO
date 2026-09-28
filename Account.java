public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Maaf, saldo Anda tidak cukup untuk menarik Rp " + amount);
        } else {
            this.balance = this.balance - amount; 
        }
    }
}
