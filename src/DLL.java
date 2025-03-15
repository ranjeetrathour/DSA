public class DLL {
    public static void main(String[] args) {
        DLLL dlll = new DLLL();
        dlll.addFirst(5);
        dlll.addFirst(2);
        dlll.addFirst(1);
        dlll.addFirst(55);
        dlll.addLast(999);
//        dlll.display();
        dlll.displayReverse();
    }
}

class DLLL {

    private NODE head;
    private NODE tail;


    public void addFirst(int val) {
        NODE node = new NODE(val);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            node.next = head;
            node.previous = null;
            head.previous = node;
            head = node;
        }
    }

    public void addLast(int val) {
        NODE node = new NODE(val);
        if (tail == null) {
            return;
        } else {
            node.previous = tail;
            tail.next = node;
            tail = node;
            node.next = null;
        }
    }

    public void display() {
        if (head == null) {
            return;
        }
        NODE temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public void displayReverse(){
        if (tail==null){
            return;
        }
        NODE temp = tail;
        while (tail!=null){
            System.out.println(tail.val);
            tail=tail.previous;
        }
    }

    class NODE {
        int val;
        NODE next;
        NODE previous;

        public NODE(int val) {
            this.val = val;
            this.next = null;
            this.previous = null;
        }
    }
}
