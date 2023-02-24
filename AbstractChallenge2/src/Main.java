public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(null);
        linkedList.traverse(linkedList.getRoot());

        String stringData = "COLOMBO KANDY GAMPHA NEGAMBO";

        String[] data = stringData.split(" ");

        for (String city:data){
            linkedList.addItem(new Node(city));
        }
        linkedList.traverse(linkedList.getRoot());
    }
}