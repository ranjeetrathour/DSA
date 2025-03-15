public class LL {
    public static void main(String[] args) {
        LLL lll = new LLL();

        lll.addFirst(4);
        lll.addFirst(7);
        lll.addFirst(8);
        lll.addLast(5);
        lll.addAtIndex(2,1);
        lll.deleteFirst();
        lll.printList();
    }


}

class LLL {
    private Node head;
    private Node tail;
    private int size=1;

    //add at last
    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    //add at last position
    public void addLast(int val){
        Node node = new Node(val);
        if (tail==null){
            head = tail = node;
        }else {
            tail.next=node;
            tail=node;
        }
    }

    //display all the list
    public void printList() {
        if (head == null) {
            System.out.println("error");
        }
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public void addAtIndex(int val, int index){
        Node node = new Node(val);
        if (size==0){
            addFirst(val);
        }
        if (size<index){
            return;
        }
        Node temp = head;
        for (int i=0; i<size; i++){
           if (i==index-1){
               node.next=temp.next;
               temp.next=node;
           }
           temp=temp.next;
        }
    }

    public void deleteFirst(){
        if (head==null){
            return;
        }
        head=head.next;

    }

    public void deleteLast(){
        if (tail==null){
            return;
        }

    }

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
