class Searching {

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

    static int BinarySearch(int arr[], int size, int start, int end, int key) {
        int mid = start + (end - start) / 2;

        while (start < end) {
            if (key == arr[mid]) {
                return mid;
            }

            if (key > arr[mid] && key < arr[end]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            mid = start + (end - start) / 2; 
        }

        return -1;
    }

    static int SearchingInRotatedArr(int arr[], int size, int key) {
        int start = 0;
        int end = size - 1;

       
        int pivot = pivot(arr, size);

        if (key > arr[pivot] && key < arr[end]) {
            return BinarySearch(arr, size, pivot+1, end, key);   
        }else{
            return BinarySearch(arr, size, start,pivot-1, key);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 1, 2, 3, 4, 5, 6 };
        int size = arr.length;
        int key = 6;

        // int and = pivot(arr, size);
        // System.out.println(and);

        int ans = SearchingInRotatedArr(arr, size, key);
        System.out.println(ans);
    }
}