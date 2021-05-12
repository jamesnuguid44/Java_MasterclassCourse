package Challenge.C1toC11;

public class Parse {
    public static void main(String[] args) {
        String asdasd = "1985.45";
        String dsa = "1923";
        String numWithLetters = "as1945";
        String numWithLetters2 = "1945as";

        Integer int1 = Integer.parseInt(dsa);

        System.out.println(Integer.parseInt(dsa));
        System.out.println(Double.parseDouble(asdasd));
        //with errors because wrong variable passed
        //System.out.println(Integer.parseInt(asdasd));
        //System.out.println(Integer.parseInt(numWithLetters));
        //System.out.println(Integer.parseInt(numWithLetters2));

        System.out.println(int1);
    }
}
