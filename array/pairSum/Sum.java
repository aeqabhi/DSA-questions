class Sum {

    static void funn(int arr[], int n, int sum) {
        int pivot = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        int max = pivot;
        int min = pivot + 1;

        while (max != min) {
            if (arr[max] + arr[min] == sum) {
                System.out.println(arr[max] + "," + arr[min]);
                return;
            } else if (arr[max] + arr[min] < sum) {
                min = (min + 1) % n;
            } else {
                max = (max + n - 1) % n;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        funn(arr, arr.length, 16);
    }
}