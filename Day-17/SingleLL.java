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

class LinkedList {

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

    // length of the linked list
    public static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    // search the element in LL
    public static int search(Node head, int val) {

        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return 1;
            }
            temp = temp.next;

        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 8 };
        Node y = new Node(arr[3]);

        // getting the value
        // System.out.println(y.data); //op : 8

        // array to list
        Node head = convertArrayToList(arr);
        // System.out.println(head.data);

        // traversal
        // Node temp = head;
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        // length of the linked list
        // System.out.println(lengthOfLL(head));

        // search the element in the array
        System.out.println(search(head, 15));

    }
}