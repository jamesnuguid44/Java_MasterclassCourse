package Challenge.C1toC11;

public class VipCustomerMain {
    public static void main(String[] args) {
        C11VipCustomer vip1 = new C11VipCustomer();
        C11VipCustomer vip2 = new C11VipCustomer("John","john@email.com");
        C11VipCustomer vip3 = new C11VipCustomer("Jack", 90000,"jack@email.com");

        System.out.println("Customer #1: "+ vip1.getName() +
                "\nEmail Address: " + vip1.getEmailAddress() +
                "\nCredit Limit: " + vip1.getCreditLimit() + "\n");

        System.out.println("Customer #2: "+ vip2.getName() +
                "\nEmail Address: " + vip2.getEmailAddress() +
                "\nCredit Limit: " + vip2.getCreditLimit() + "\n");

        System.out.println("Customer #3: "+ vip3.getName() +
                "\nEmail Address: " + vip3.getEmailAddress() +
                "\nCredit Limit: " + vip3.getCreditLimit() + "\n");
    }
}
