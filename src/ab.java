public class ab {
}
public static boolean areEqual(Queue q1, Queue q2) {
    // 1. İpucu: Boyutları karşılaştır. Farklıysa, eşit değiller.
    if (q1.size() != q2.size()) {
        return false;
    }

    Node current1 = q1.front;
    Node current2 = q2.front;

    // 2. İpucu: Her iki kuyruğu eş zamanlı olarak dolaş
    while (current1 != null && current2 != null) {
        // 3. İpucu: Her düğüm çiftinin verisini karşılaştır
        if (current1.data != current2.data) {
            return false; // Uyuşmazlık (Mismatch) varsa, eşit değiller.
        }
        current1 = current1.next;
        current2 = current2.next;
    }

    // 4. İpucu: Tüm düğümler eşleşirse, kuyruklar eşittir.
    return true;
}

void main() {
}