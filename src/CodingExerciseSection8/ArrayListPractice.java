package CodingExerciseSection8;

import java.util.ArrayList;

public class ArrayListPractice {
    public static ArrayList<String> groceryList = new ArrayList<>();
    public static void main(String[] args) {
        addGrocery("Coffee");
        addGrocery("Milk");
        addGrocery("Rice");
        addGrocery("Canned meat");
        getList();
        remove("Rice");
        getList();
        modify("Milk", "Soy milk");
        getList();

    }

    public static void addGrocery(String grocery){
        groceryList.add(grocery);
        System.out.println("Total items now "+ groceryList.size());
    }

    public static void getList(){
        System.out.println("Grocery list:");
        for (int i=0; i<groceryList.size(); i++){
            System.out.println("Item #"+ (i+1) + ": " + groceryList.get(i));
        }
    }

//    public static void remove(int remove){
//        String removed = groceryList.get(remove);
//        groceryList.remove(remove);
//        System.out.println("You removed "+ removed + "\nTotal items now " + groceryList.size());
//    }

    public static void remove(String remove){
        int position = groceryList.indexOf(remove);
        if (position>=0){
            String removed = groceryList.get(position);
            groceryList.remove(position);
            System.out.println(removed + " removed.");
        } else {
            System.out.println(remove+ " is not on the list.");
        }
    }

//    public static void modify(int modify,String grocery){
//        String replaced = groceryList.get(modify);
//        groceryList.set(modify, grocery);
//        System.out.println(replaced + " is replaced by "+ groceryList.get(modify));
//    }

    public static void modify(String modify, String grocery){
        int toModify = groceryList.indexOf(modify);

        if (toModify>=0){
            String replaced = groceryList.get(toModify);
            groceryList.set(toModify,grocery);
            System.out.println(replaced + " was replaced with " + grocery);
        } else {
            System.out.println("Item to be modified not on list.");
        }
    }
}
