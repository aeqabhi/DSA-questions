class MUl {
    public static void print(int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void fun(int a[][], int b[][]) {
        if (a[0].length != b.length) {
            System.out.println("unable to multiply");
        }
        int n[][] = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
               
                for (int k = 0; k < b.length; k++) {
                    n[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        print(n);
    }

    public static void main(String[] args) {

        int A[][] = { { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 } };

        int B[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 } };

        fun(A, B);
    }
}