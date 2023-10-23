class BS {
    static int fun(int arr[]) {
        int l = 0;
        int r = arr.length - 1;
        int mid = l + (r - l) / 2;

        while (l < r) {
        
            if (arr[mid] < arr[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
            mid = l + (r - l) / 2;
        }
        return l;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 10, 2, 1 };
        System.out.println(fun(arr));
    }
}