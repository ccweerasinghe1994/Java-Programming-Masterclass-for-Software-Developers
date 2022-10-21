public abstract class ListItem {
    private ListItem previousItem;
    private ListItem nextItem;

    public ListItem() {
        this.previousItem = null;
        this.nextItem = null;
    }

    public abstract int compareTo(ListItem listitem);

    public void setPreviousItem(ListItem previousItem) {
        this.previousItem = previousItem;
    }

    public void setNextItem(ListItem nextItem) {
        this.nextItem = nextItem;
    }
}
