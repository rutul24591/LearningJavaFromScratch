package DoublyLinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();

        linkedList.addNodeAtEnd(1);
        linkedList.addNodeAtEnd(2);
        linkedList.addNodeAtEnd(3);
        linkedList.addNodeAtEnd(4);
        linkedList.addNodeAtEnd(5);

        linkedList.addNodeAtStart(6);
        linkedList.addNodeAtPosition(3, 1000);

        linkedList.display();
    }
}
