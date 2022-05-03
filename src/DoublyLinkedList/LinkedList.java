package DoublyLinkedList;

public class LinkedList {
    Node head;
    public void addNodeAtEnd(int data){
        Node node = new Node();
        node.data = data;
        node.prev = null;
        node.next = null;

        // Check if the element to be inserted is the first element in the list
        if(head == null){
            head = node;
        } else {
            Node n = head;

            //Traverse the list until last element is reached
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
            node.prev = n;
        }
    }

    public void display(){
        Node n = head;
        while(n.next != null){
            System.out.println("Node Data:" +n.data);
            n = n.next;
        }
        // Without this line the last elements' data won't be printed, as loop runs until the second last element
        System.out.println("Node Data:"+n.data);
    }
}
