class Pivot {

    static int pivot(int arr[], int size) {
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;

        while (start < end) {
            if (arr[mid] >= arr[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = start + (end - start) / 2;
        }

        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 1, 2, 3, 4, 5, 6 };
        int size = arr.length;

        int and = pivot(arr, size);
        System.out.println(and);
    }
}