
class NP {
    public static void revers(int arr[], int F, int L) {
        int x = (L - F) / 2;
        int mid = F + x;
        int n = L;
        for (int i = F; i <= mid; i++) {
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            n--;
        }
    }

    public static void funnn(int arr[], int size) {
        int idx = -1;
        for (int i = size; i >= 0; i--) {
            if (arr[i] > arr[i - 1]) {
                idx = i;
                break;
            }
        }
        int prev = idx;
        for (int i = idx + 1; i < size; i++) {
            if (arr[i] > arr[idx-1] && arr[prev] >= arr[i]) {
                prev = i;
            }
        }

        System.out.println(idx+"+" + prev);
        int t;
        t = arr[idx - 1];
        arr[idx - 1] = arr[prev];
        arr[prev] = t;

        revers(arr, idx, arr.length - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 4, 7, 6, 5, 3, 2, 1 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        funnn(arr, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}