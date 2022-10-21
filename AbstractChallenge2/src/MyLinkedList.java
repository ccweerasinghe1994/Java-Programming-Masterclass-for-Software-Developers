public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
//         this is empty, so this becomes the head of the list
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
//      we are going to loop through
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
//                so the new item is grater, we have to move if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
//                    there is no next so add to the end
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                }
                return true;
            } else if (comparison > 0) {
//                new item is less, we have to enter before
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    currentItem.setPrevious(newItem);
                    newItem.setNext(currentItem);
                } else {
//                    the node with the previous is root
                    newItem.setNext(root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;

                }
                return true;
            }else {
//                equal
                System.out.println(newItem.getValue() + " is already present, not added 👽");
                return false;
            }

        }
    }

    @Override
    public boolean removeItem(ListItem listItem) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
