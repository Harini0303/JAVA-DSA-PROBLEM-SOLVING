class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertion {

    // converting array to list
    public static Node convertArrayToList(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;

    }

    // printList after deleting Head
    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;

        }
        System.out.println();
    }

    // inserting head to linked list
    public static Node insertHead(Node head, int val) {
        // Node temp = new Node(val, head);
        // return temp;
        return new Node(val, head);

    }

    // INserting at last
    public static Node insertTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    // INSERTING AT KTH ELEMENT
    public static Node insertPosition(Node head, int el, int k) {
        // if there is no element
        if (head == null) {
            if (k == 1) {
                return new Node(el);
            } else {
                return head;
            }
        }

        // it there is one element
        if (k == 1) {
            // Node newHead = new Node(el,head);
            return new Node(el, head);
        }

        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == (k - 1)) {
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;

        }
        return head;

    }

    // INSERTING ELEMENT BEFORE THE VALUE X
    public static Node insertBeforeValue(Node head, int el, int val) {
        // if there is no element
        if (head == null) {
            return null;
        }

        if (head.data == val) {
            // Node newHead = new Node(el,head);
            return new Node(el, head);
        }

        Node temp = head;
        boolean found = false;
        while (temp.next != null) {
            if (temp.next.data == val) {
                Node x = new Node(el, temp.next);
                temp.next = x;
                found = 1;
                break;
            }
            temp = temp.next;

        }

        return head;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 8 };

        Node head = convertArrayToList(arr);
        // head = insertHead(head, 10);
        // head = new Node(100, head);

        // head = insertTail(head, 100);

        // head = insertPosition(head, 100, 3);

        head = insertBeforeValue(head, 100, 3);

        print(head);

    }

}
