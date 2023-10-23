import java.util.HashMap;

class Countt {

    static void fun(int arr[], int size) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) >= size / 3) {
                System.out.println(key+" = "+map.get(key));
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1, 5, 5, 5, 6, 6, 6, 6, 6, };
        fun(nums, nums.length);
    }
}