class Recu {

    public static void fun(int n) {
        if (n == 11) {
            return;
        }
        System.out.println(2 * n);
        fun(n + 1);
    }

    public static void sumOfNum(int i, int n, int sum) {
        if (i > n) {
            System.out.println(sum);
            return;
        }
        sum += i;
        sumOfNum(i + 1, n, sum);
        System.out.println(i);

    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void fibonacci(int n1, int n2, int n) {
        if (n1 == 0) {
            System.out.print(n1 + " " + n2 + " ");
        }
        if (n < 3) {
            return;
        }
        System.out.print(n1 + n2 + " ");
        fibonacci(n2, n1 + n2, n - 1);
    }

    public static int calPower(int x, int n) {
        // stack height == n
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        return x * calPower(x, n - 1);
    }

    public static int calPower2(int x,int n){
        //stack height == log(n)
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        if(n%2==0){
            return calPower(x,n/2) * calPower2(x, n/2);
        }else{
            return calPower(x,n/2) * calPower2(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        // fun(1);
        // sumOfNum(1, 5, 0);
        // System.out.println(factorial(5));
        // fibonacci(0, 1,10);
        // System.out.println(calPower(2, 5));
        System.out.println(calPower2(2, 5));
    }
}