package Challenge;

public class C2FeetAndInchesToCentimeters {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(26);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0) || (inches < 0 || inches > 12)){
            return -1;
        } else {
            double centimeters = (((feet*12) + inches) * 2.54);
            System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " centimeters");
            return centimeters;
            }
        }

    //Calculates feet and inches based on given inches and converts it to centimeters
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        } else {
            int feet = (int) (inches/ 12);
            double excessInches = inches%12;
            return calcFeetAndInchesToCentimeters(feet,excessInches);
        }
    }
}
