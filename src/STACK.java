import java.util.StringTokenizer;

class maiin {
    public static void main(String[] args) {
        STACK stack = new STACK();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}

public class STACK {
    Node head;

    //push
    public void push(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    //pop
    public int pop() {
        if (head != null) {
            Node temp = head;
            head = head.next;
//            System.out.println(head.val);
            return temp.val;
        }
        return 0;
    }

    //peek
    public int peek() {
        if (head != null) {
            return head.val;
        }
        return 0;
    }

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
