class Spi {
    public static void print(int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 11, 12, 13, 14 },
                { 15, 16, 17, 18 },
                { 19, 20, 21, 22 },
                { 23, 24, 25, 26 },
                { 27, 28, 29, 30 } };

        int Row = arr.length - 1;
        int Column = arr[0].length - 1;
        int r = 0;
        int c = 0;

        while (r < Row && c < Column) {

            for (int i = c; i <= Column; i++) {
                System.out.print(arr[r][i] + " ");
            }
            r++;

            for (int i = r; i <= Row; i++) {
                System.out.print(arr[i][Column] + " ");
            }
            Column--;

            for (int i = Column; i >= c; i--) {
                System.out.print(arr[Row][i] + " ");
            }
            Row--;

            for (int i = Row; i >= r; i--) {
                System.out.print(arr[i][c] + " ");
            }
            c++;

        }
    }
}