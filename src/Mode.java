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

public class QueueExercise {

    public static void main(String[] args) {
        Queue q1 = new Queue();
        Queue q2 = new Queue();
        Queue q3 = new Queue();

        System.out.println("--- Kuyruk 1 (Q1) İşlemleri ---");
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.display();

        System.out.println("\n--- Kuyruk 2 (Q2) İşlemleri (Q1 ile aynı) ---");
        q2.enqueue(10);
        q2.enqueue(20);
        q2.enqueue(30);
        q2.display();

        System.out.println("\n--- Kuyruk 3 (Q3) İşlemleri (Farklı) ---");
        q3.enqueue(10);
        q3.enqueue(40);
        q3.display();

        boolean areQ1Q2Equal = Queue.areEqual(q1, q2);
        System.out.println("\nQ1 ve Q2 eşit mi? " + areQ1Q2Equal);

        boolean areQ1Q3Equal = Queue.areEqual(q1, q3);
        System.out.println("Q1 ve Q3 eşit mi? " + areQ1Q3Equal);

        System.out.println("\n--- Q1'den Çıkarma İşlemi ---");
        q1.dequeue();
        q1.display();

        boolean areQ1Q2EqualAfterOp = Queue.areEqual(q1, q2);
        System.out.println("\nİşlem sonrası Q1 ve Q2 eşit mi? " + areQ1Q2EqualAfterOp);

        System.out.println("\n--- Q3'e Ekleme İşlemi ---");
        q3.enqueue(30);
        q3.display();

        q1.dequeue();
        q1.dequeue();
        q1.display();

        System.out.println("\nQ1 ve Q3 tekrar eşit mi? " + Queue.areEqual(q1, q3));
    }
}