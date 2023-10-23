public class removeDuplicate {

    public static boolean[] map = new boolean[26];
    static String newStr = "";

    static void fun(String str,int n){
        if(n==str.length()){
            System.out.println(newStr);
            return;
        }
        if(map[str.charAt(n) - 'a'] == false){
            newStr += str.charAt(n);
            map[str.charAt(n)-'a'] = true;
        }
        fun(str, n+1);
    }
    public static void main(String[] args) {
        String str = "aabccdddddddddddddddddddddddddeeeeef";
        fun(str, 0);
    }
}
