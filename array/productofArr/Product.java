class Product {
    public static void funn(int arr[], int n) {
        int prefix[] = new int[n];
        int suffix[] = new int[n];

        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = arr[i - 1] * prefix[i - 1];
        }

        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = arr[i + 1] * suffix[i + 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i]*suffix[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        funn(arr, arr.length);
    }
}