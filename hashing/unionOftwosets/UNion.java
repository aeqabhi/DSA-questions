import java.util.HashSet;
import java.util.Iterator;

class UNion {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 3, 4, 5 };

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        Iterator it = set.iterator();


      
        System.out.println(set.size());
        
        // int count = 0;
        // while (it.hasNext()) {
        //     count++;
        //     it.next();
        // }
        // System.out.println(set);
        // System.out.println(count);

    }
}