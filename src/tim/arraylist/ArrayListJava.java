package tim.arraylist;

import java.util.ArrayList;

public class ArrayListJava {
    private int[] myNumbers  = new int[50];

    private ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void groceryListItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" items in your list");
        for (String s : groceryList) {
            System.out.println((s));
        }
    }

    private void modifyGroceryListItem(int position, String item){
        groceryList.set(position,item);
        System.out.println("Grocery item "+(position + 1)+" has been modified !");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }

    public String findItem(String searchItem){

    }
}
