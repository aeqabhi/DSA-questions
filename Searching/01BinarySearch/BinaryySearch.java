class BinaryySearch {

    static Boolean implementBS(int arr[], int key) {
        int l = 0;
        int r = arr.length - 1;

        // int mid = (l + r) / 2;
        // optimization
        int mid = l + (r-l)/2;
        while (l <= r) {
            if (arr[mid] == key) {
                System.out.println(mid);
                return true;
            }

            if(key > arr[mid]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
            mid = l + (r-l)/2;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        int key = 7;

        System.out.println(implementBS(arr, key));
    }
}