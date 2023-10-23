class Subsequence{
    static void fun(String str,int n,String newStr){
        if(n==str.length()){
            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(n);

        // to be
        fun(str, n+1, newStr+curr);
        // not to be 
        fun(str, n+1, newStr);
    }
    public static void main(String[] args) {
        String str = "abc";
        String newStr = "";
        fun(str, 0, newStr);
    }
}