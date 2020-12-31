package CodingExercise;

public class e13NumberOfDaysInMonth {
    public static void main(String[] args) {
        //System.out.println(getDaysInMonth(2, 2020));
    }

    public static boolean isLeapYear(int year) {
        boolean isBy4 = (year % 4) == 0;
        boolean isBy100 = (year % 100) == 0;
        boolean isBy400 = (year % 400) == 0;

        if (year < 1 || year > 9999) {
            return false;
        } else if (!isBy4) {
            return false;
        } else if (isBy4) {
            if (!isBy100) {
                return true;
            } else if (isBy100) {
                return isBy400;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if (month<1 || month>12 || year<1 || year>9999){
            return -1;
        }
        boolean years = isLeapYear(year);

        if (years){
            switch (month){
                case 2:
                    return 29;
            }
        }
        switch (month){
            case 1: return 31;
            case 2: return 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
        } return -1;
    }
}

