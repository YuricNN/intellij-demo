class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Enqueue: " + data);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Hata: Kuyruk boş.");
            return -1;
        }
        int removedData = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("Dequeue: " + removedData);
        return removedData;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Kuyruk boş.");
            return;
        }
        Node current = front;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.data + (current.next != null ? ", " : ""));
            current = current.next;
        }
        System.out.println(" ] (Boyut: " + size + ")");
    }

    public static boolean areEqual(Queue q1, Queue q2) {
        if (q1.size() != q2.size()) {
            return false;
        }

        Node current1 = q1.front;
        Node current2 = q2.front;

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return true;
    }
}