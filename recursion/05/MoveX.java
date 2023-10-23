public class MoveX {
    static String str1 = "";
    static String str2 = "";

    public static void fun(String str, int n, char c, int count) {
        // if (n == str.length()) {
        // System.out.println(str1+str2);
        // return;
        // }
        // if (c == str.charAt(n)) {
        // str2 += str.charAt(n);
        // } else {
        // str1 += str.charAt(n);
        // }
        // fun(str, n + 1, c);

        
        if (n == str.length()) {
            System.out.print(str1);
            for (int i = 0; i < count; i++) {
                System.out.print(c);
            }
            return;
        }
        if (c == str.charAt(n)) {
            count++;
        } else {
            str1 += str.charAt(n);
        }
        fun(str, n + 1, c, count);
    }

    public static void main(String[] args) {
        String str = "axxbxcxxd";

        // fun(str, 0, 'x');

        int count = 0;
        fun(str, 0, 'x', count);
    }

}
