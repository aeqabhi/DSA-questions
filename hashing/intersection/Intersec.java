import java.util.HashSet;

class Intersec {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {3,4,5,6,7,4};

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<a.length;i++){
            set.add(a[i]);
        }

        int count = 0;
        for(int i = 0;i<b.length;i++){
            if(set.contains(b[i])){
                count++;
                System.out.print(b[i]+" ");
                set.remove(b[i]);
            }
        }
        System.out.println("");
        System.out.println(count);
    }
}
