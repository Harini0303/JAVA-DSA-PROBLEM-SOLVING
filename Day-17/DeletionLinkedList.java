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

public class DeletionLinkedList {

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

    // deleting head
    public static Node removeHead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    // removing the last element
    public static Node removeTail(Node head) {
        if (head == null || head.next == null) {
            return null;

        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;

        }
        temp.next = null;
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

    // delete the element in the particular position
    public static Node removePosition(Node head, int k) {
        if (head == null) {
            return head;
        }
        if (k == 1) {
            Node temp = head;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;
    }

    // deleting the value
    public static Node removeElement(Node head, int el) {
        if (head == null) {
            return head;
        }

        if (head.data == el) {
            Node temp = head;
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == el) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 8 };

        Node head = convertArrayToList(arr);

        // head = removeHead(head);
        // head = removeTail(head);
        // head = removePosition(head, 2);
        // head = removeElement(head, 6);
        print(head);

    }

}
