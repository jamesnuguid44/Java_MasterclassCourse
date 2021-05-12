package CodingExerciseSection6.E29toE30;

public class e30PersonMain {
    public static void main(String[] args) {
        e30Person person = new e30Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= "+ person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= "+ person.getFullName());
        System.out.println("teen= "+ person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= "+ person.getFullName());
    }
}
