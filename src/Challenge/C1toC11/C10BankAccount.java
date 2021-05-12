package Challenge.C1toC11;

public class C10BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    //setters


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //getters


    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(int deposit){
        System.out.println("\nYour current balance is: "+ this.balance + "\nYou made a deposit of: "+ deposit);
        this.balance += deposit;
        System.out.println("Your total balance now is: "+ this.balance);
    }

    public void withrawFunds(int withraw){
        if (balance < withraw){
            System.out.println("\nInsufficient funds");
        } else {
            System.out.println("\nYou made a withrawal of: " + withraw);
            this.balance -= withraw;
            System.out.println("Your total balance now is: " + this.balance);
        }
    }

    public void balanceInquiry(){
        System.out.println("\nAccount no: "+accountNumber+
                "\nCustomer name: "+customerName+
                "\nEmail: "+email+
                "\nPhone Number: "+phoneNumber+
                "\nBalance: "+balance);

    }


}
