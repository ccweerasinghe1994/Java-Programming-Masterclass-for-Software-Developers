public abstract class ListItem {
    //    here we are creating instances of the same class
    protected ListItem leftLink = null;
    protected ListItem rightLink = null;
    // we are trying to be as flexible as possible with the value.
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    //    let's create the abstract methods
    abstract ListItem next();

    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    //    these are for the value
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
