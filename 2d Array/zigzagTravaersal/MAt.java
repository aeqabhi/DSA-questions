class MAt{

     static void printMatrix(int matrix[][])
    {
        for (int i = 0; i < ROW; i++)
        {
            for (int j = 0; j < COL; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int M[][] = {
            { 1, 2, 3, 4 },     { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },  { 13, 14, 15, 16 },
            { 17, 18, 19, 20 },
        };
    }
}