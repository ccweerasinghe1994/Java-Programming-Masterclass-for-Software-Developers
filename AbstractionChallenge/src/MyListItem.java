public class MyListItem extends ListItem {
    private String value;
    public MyListItem(String value1) {
        this.value = value1;
    }
    public String getValue() {
        return value;
    }

    @Override
    public int compareTo(ListItem listitem) {
        return 0;
    }
}
