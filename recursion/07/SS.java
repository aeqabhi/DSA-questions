import java.util.HashSet;
//unique subsequence
class SS {
    static void fun(String str, int n, String newStr,HashSet<String> set) {
        if (n == str.length()) {
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char curr = str.charAt(n);

        // to be
        fun(str, n + 1, newStr + curr,set);
        // not to be
        fun(str, n + 1, newStr,set);
    }

    public static void main(String[] args) {
        String str = "aaa";

        HashSet<String> set= new HashSet<>();
          String newStr = "";
        fun(str, 0, newStr,set);
    }
}
