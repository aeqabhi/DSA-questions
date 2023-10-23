class Bs {

    static int firstOccurence(int arr[], int key) {
        int l = 0;
        int r = arr.length - 1;
        int mid = l + (r - l) / 2;
        int ans = -1;
        while (l <= r) {

            if (key == arr[mid]) {
                ans = mid;
                r = mid - 1;

            } else if (key > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            mid = l + (r - l) / 2;
        }
        return ans;
    }

    static int lastOccurence(int arr[], int key) {
        int l = 0;
        int r = arr.length - 1;
        int mid = l + (r - l) / 2;
        int ans = -1;
        while (l <= r) {

            if (key == arr[mid]) {
                ans = mid;
                l = mid + 1;

            } else if (key > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            mid = l + (r - l) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 3, 3, 3, 3, 5 };
        System.out.println(firstOccurence(arr, 3));
        System.out.println(lastOccurence(arr, 3));
        System.out.println("total occurance=" + (lastOccurence(arr, 3) - firstOccurence(arr, 3) + 1));
    }
}