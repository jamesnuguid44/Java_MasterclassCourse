package Challenge.C1toC11;

public class BankAccountMain {
    public static void main(String[] args) {
        C10BankAccount bankAccount1 = new C10BankAccount();
        bankAccount1.setAccountNumber(1123);
        bankAccount1.setCustomerName("Jackson");
        bankAccount1.setEmail("jackson44@gmail.com");
        bankAccount1.setPhoneNumber(925612);
        bankAccount1.setBalance(10000);

        //bankAccount1.balanceInquiry();
        System.out.println("\nAccount no: "+bankAccount1.getAccountNumber()+
                "\nCustomer name: "+bankAccount1.getCustomerName()+
                "\nEmail: "+bankAccount1.getEmail()+
                "\nPhone Number: "+bankAccount1.getPhoneNumber()+
                "\nBalance: "+bankAccount1.getBalance());

        bankAccount1.depositFunds(1000);
        bankAccount1.withrawFunds(6000);
        bankAccount1.withrawFunds(6000);

    }
}
