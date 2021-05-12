package Challenge.C1toC11;

public class C11VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public C11VipCustomer(){
        this("Name not specified", 1000,"support@email.com");
    }

    public C11VipCustomer(String name, String emailAddress){
        this(name,999,emailAddress);
    }

    public C11VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
