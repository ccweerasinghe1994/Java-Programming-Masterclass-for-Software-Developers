import java.util.ArrayList;

public class GroceryList {
    private final ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void updateGroceryList(int index, String item) {
        groceryList.set(index, item);
        System.out.println("Grocery list item " + index + "has been updated");
    }

    public void removeItemFromGroceryList(int index) {
        String item = groceryList.get(index);
        groceryList.remove(index);
        System.out.println(item + " has been removed from the grocery list");
    }
}
