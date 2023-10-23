class Min {
    public static void fun(int arr[], int n, int L, int H) {
        if (arr[L] <= arr[H]) {
            System.out.println(arr[L]);
            return;
        }

        while (L <= H) {
            int mid = (L + H) / 2;
            if (arr[mid] < arr[mid - 1]) {
                System.out.println(arr[mid]);
                return;
            }

            if (arr[mid] > arr[H]) {
                L = mid+1;
            }else{
                H=mid-1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 2, 3 };
        fun(arr, arr.length, 0, arr.length - 1);
    }
}