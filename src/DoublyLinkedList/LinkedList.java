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

    public void addNodeAtStart(int data){
        Node node = new Node();     // Create a new node
        node.data = data;           // Assign data to newly created node
        node.next = head;           // Make the next of new `node` point to the head (which currently is the first element)
        node.prev = null;           // Make the prev of new `node` point to null (which will be our first node after this functions ends)
        head.prev = node;           // Important: Make the prev of head point towards out new `node` (Head is now second element.)
        head = node;                // Make the new `node` the head (Now our new `node` is the head.)
    }

    public void display(){
        Node n = head;
        while(n.next != null){
            System.out.println("Node Data:" +n.data);
            System.out.println("Node Next:" +n.next);
            System.out.println("Node Prev:" +n.prev);
            n = n.next;
        }
        // Without this line the last elements' data won't be printed, as loop runs until the second last element
        System.out.println("Node Data:" +n.data);
        System.out.println("Node Next:" +n.next);
        System.out.println("Node Prev:" +n.prev);
    }
}
