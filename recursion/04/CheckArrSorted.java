class CheckArrSorted {

    public static boolean fun(int arr[], int n) {
        if (n == arr.length - 1) {
            return true;
        }
        if (arr[n] <= arr[n + 1]) {
            return fun(arr, n + 1);
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(fun(arr, 0));
    }

}
