public class TimeComplexityExamples {
    public static void main(String[] args) {
        System.out.println("Soru 2:");
        int sum = 0;
        sum = sum + 5;
        System.out.println("sum = " + sum);

        System.out.println("\nKod Parçası 1 - O(n):");
        sum = 0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        System.out.println("\nKod Parçası a - O(n^2):");
        sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += i + j;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("\nKod Parçası c - O(log n):");
        n = 1024;
        int count = 0;
        while (n > 1) {
            n = n / 2;
            count++;
            System.out.println("n = " + n);
        }
        System.out.println("Total divisions: " + count);
    }
}