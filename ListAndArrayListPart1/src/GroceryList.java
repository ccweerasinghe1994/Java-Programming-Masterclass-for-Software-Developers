import java.util.ArrayList;

public class GroceryList {
    private final ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void updateGroceryList(String currentItem, String newItem) {
        int index = findItem(currentItem);
        if (index >= 0) {
            updateGroceryList(index, newItem);
        }
    }

    private void updateGroceryList(int index, String item) {
        groceryList.set(index, item);
        System.out.println("Grocery list item " + index + 1 + " has been updated");
    }

    public void removeItemFromGroceryList(String item) {
        int index = findItem(item);
        if (index >= 0) {
            groceryList.remove(index);
        }
        System.out.println(item + " has been removed from the grocery list");
    }

    private int findItem(String item) {
//        boolean exists = groceryList.contains(item);
        return groceryList.indexOf(item);

    }

    public boolean onFile(String item) {
        int index = findItem(item);
        return index >= 0;
    }
}
