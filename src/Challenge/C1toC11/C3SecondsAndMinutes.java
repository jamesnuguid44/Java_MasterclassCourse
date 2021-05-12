package Challenge.C1toC11;

public class C3SecondsAndMinutes {
    public static void main(String[] args) {
        getDurationString(70,50);
        getDurationString(3690);
    }

    public static void getDurationString(int minutes, int seconds){
        if (minutes<0 || (seconds<0 || seconds>59)){
            System.out.println("Invalid Value");
        } else {
            int hour = minutes/60;
            int remainingMinutes = minutes%60;
            
            if (hour<10){
                System.out.print("0"+hour+"h ");
            } else {
                System.out.print(hour+"h ");
            }
            
            if (remainingMinutes<10){
                System.out.print("0"+remainingMinutes+"m ");
            } else {
                System.out.print(remainingMinutes+"m ");
            }

            if (seconds<10){
                System.out.println("0"+seconds+"s ");
            } else {
                System.out.println(seconds+"s ");
            }

            //System.out.println(hour+"h "+remainingMinutes+"m "+seconds+"s");
        }
    }

    public static void getDurationString(int seconds){
        if (seconds<0){
            System.out.println("Invalid Value");
        } else {
            int minutes = seconds/60;
            int remainingSeconds = seconds%60;
            getDurationString(minutes,remainingSeconds);
        }
    }
}
