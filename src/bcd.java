private static int countEvenRecursive(int[] arr, int index) {
    // Hint 3: Temel Durum (index arr.length'e ulaştığında)
    if (index == arr.length) {
        return 0;
    }

    // Özyinelemeli Adım
    int currentCount = 0;
    if (arr[index] % 2 == 0) {
        currentCount = 1;
    }

    // Kalan dizi için özyinelemeli çağrı (index + 1)
    return currentCount + countEvenRecursive(arr, index + 1);
}