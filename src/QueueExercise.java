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