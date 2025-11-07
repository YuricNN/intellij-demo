/**
 * Özyinelemeli Çift Sayı Sayma Alıştırması
 */
public class RecursiveCount {

    /**
     * Ana özyinelemeli metot.
     * Dizinin belirli bir noktasından (index) başlayarak çift sayıları sayar.
     * * @param arr Sayıların bulunduğu dizi.
     * @param index Kontrol etmeye başlanacak dizin (index).
     * @return Dizin o noktadan itibaren dizinin sonuna kadar olan çift sayıların sayısı.
     */
    private static int countEvenRecursive(int[] arr, int index) {
        // Temel Durum (Base Case):
        // Dizin, dizinin sonuna ulaştıysa (dizinin uzunluğuna eşitse), 
        // daha fazla eleman kalmamıştır, bu yüzden 0 döndürülür.
        if (index >= arr.length) {
            return 0;
        }

        // Özyinelemeli Adım (Recursive Step):

        // 1. Mevcut elemanın çift olup olmadığını kontrol et.
        int currentCount = 0;
        if (arr[index] % 2 == 0) {
            currentCount = 1; // Çift ise sayıma 1 ekle.
        }

        // 2. Özyinelemeli çağrı yap:
        // Mevcut elemanın sayısını (currentCount) al ve dizinin kalan kısmı için
        // metodu bir sonraki indeksten (index + 1) tekrar çağır.
        return currentCount + countEvenRecursive(arr, index + 1);
    }

    /**
     * Kullanıcının kolayca çağırabileceği genel metot.
     * Sayma işlemini dizinin başından (index 0) başlatır.
     * * @param arr Sayıların bulunduğu dizi.
     * @return Dizideki toplam çift sayı sayısı.
     */
    public static int countEven(int[] arr) {
        if (arr == null) {
            return 0;
        }
        return countEvenRecursive(arr, 0);
    }

    public static void main(String[] args) {
        int[] array1 = {3, 6, 4, 7, 8, 11, 20}; // Çift sayılar: 6, 4, 8, 20 (Toplam 4)
        int[] array2 = {1, 3, 5, 7, 9};         // Çift sayılar: Hiç yok (Toplam 0)
        int[] array3 = {2, 4, 6, 8, 10};        // Çift sayılar: Hepsi (Toplam 5)

        System.out.println("Dizi 1: Çift sayı sayısı = " + countEven(array1));
        System.out.println("Dizi 2: Çift sayı sayısı = " + countEven(array2));
        System.out.println("Dizi 3: Çift sayı sayısı = " + countEven(array3));
    }
}