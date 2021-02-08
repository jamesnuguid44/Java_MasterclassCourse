package CodingExercise;

public class e24FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(2,1,5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int totalBigPacks = bigCount*5;
        int totalSmallPacks = smallCount;

        if (bigCount<0 || smallCount<0 || goal<0 || (totalBigPacks > goal && totalSmallPacks < goal%5)){
            return false;
        }
        return (totalBigPacks+totalSmallPacks >= goal);
    }
}
