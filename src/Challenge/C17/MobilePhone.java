package Challenge.C17;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    ArrayList<Contacts> contactList;
    Scanner scanner = new Scanner(System.in);
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<>();
    }

    public void addContact(){
        System.out.println("Add Contact:\nPlease enter name - ");
        String name = scanner.nextLine();
        int index = contactList.indexOf(name);
        if (index>=0) {
            System.out.println("Please enter number - ");
            String num = scanner.nextLine();
            scanner.nextLine();
            contactList.add( new Contacts(name, num));
            System.out.println(name + " added to contacts.");
            System.out.println();
        } else {
            System.out.println("Contact already exists.");
            System.out.println();
        }
    }

    private Contacts add(Contacts contacts){

    }

    public void removeContact(){
        System.out.println("Remove Contact:\nPlease enter name - ");
        String name = scanner.nextLine();
        int index = contactList.indexOf(name);
        if (index>=0){
            contactList.remove(index);
            System.out.println(name+" removed from contacts.");
            System.out.println();
        } else {
            System.out.println("Contact not found.");
            System.out.println();
        }
    }

    public boolean findContact(Contacts contacts){
        System.out.println("Find Contact:\nPlease enter name - ");
        String name = scanner.nextLine();
        int index = contactList.indexOf();
        if (index>=0){
            System.out.println(name + " found.");
            System.out.println();
        } else {
            System.out.println("Contact not found.");
            System.out.println();
        }
    }
}
