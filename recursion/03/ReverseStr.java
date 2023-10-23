public class ReverseStr {
    public static void fun(String str, int n) {

        if (n < 0) {
            return;
        }
        System.out.print(str.charAt(n));
        fun(str, n - 1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void firstAndLastOccurance(String str, char c, int n) {
        if (n == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (c == str.charAt(n)) {
            if (first == -1) {
                first = n;
            } else {
                last = n;
            }
        }

        firstAndLastOccurance(str, c, n + 1);
    }

    public static void main(String[] args) {
        String str = "aaabbccdeeeefaaf";

        // fun(str,str.length()-1);
        firstAndLastOccurance(str, 'a', 0);
    }
}
