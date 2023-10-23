class BinaryyyReacursion {

    static boolean fun(int arr[], int l, int r, int key) {

        if (l > r) {
            return false;
        }

        int mid = (l + r) / 2;

        if (key == arr[mid]) {
            System.out.println(mid);
            return true;
        }

        if (key > arr[mid]) {
            fun(arr, mid + 1, r, key);
        } else {
            fun(arr, l, mid - 1, key);
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 7, 8, 9 };

        int l = 0;
        int r = arr.length - 1;

        System.out.println(fun(arr, l, r, 80));

    }
}
