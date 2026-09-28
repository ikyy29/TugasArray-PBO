public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        this.customers = new Customer[25];
        this.numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l) {
        Customer newCustomer = new Customer(f, l);
        this.customers[numberOfCustomers] = newCustomer;
        numberOfCustomers++;
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }
}
