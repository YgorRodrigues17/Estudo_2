import java.util.Scanner;

public class Matrix_2 {
    public static void main(String[] args) {
        int A[][], B[][], C[][], D[][];

        A = readMatrix(2, 3);
        B = readMatrix(3, 2);
        C = sumMatrix(A, B);
        D = multiMatrix(A, B);

        showMatrix(C);
        System.out.println();
        showMatrix(D);
        System.exit(0);

    }

    public static int[][] readMatrix(int nl, int nc) {
        int mat[][] = new int[nl][nc];

        Scanner readline = new Scanner(System.in);

        System.out.println("Enter with data of matrix");

        for (int l = 0; l < nl; l++) {
            for (int c = 0; c < nc; c++) {
                System.out.println("Enter with elements [" + l + "][" + c + "]: ");
                mat[l][c] = readline.nextInt();
            }
        }

        return mat;

    }

    public static int[][] sumMatrix(int x[][], int y[][]) {
        if (x.length != y.length || x[0].length != y[0].length) {
            System.out.println("Matrix with different dimensions");
        }
        int z[][] = new int[x.length][y.length];
        for (int l = 0; l < x.length; l++) {
            for (int c = 0; c < x.length; c++) {
                z[l][c] = x[l][c] + y[l][c];
            }
        }
        return z;
    }

    public static int[][] subMatrix(int x[][], int y[][]) {
        int z[][] = new int[x.length][y.length];
        for(int l = 0; l < x.length; l++){  
            for(int c = 0; c < y.length; c++){  
                z[l][c] = x[l][c] - y[l][c];  
            }  
        }  
  
        System.out.println("Subtraction of two matrices: ");  
        for(int l = 0; l < x.length; l++){  
            for(int c = 0; c < y.length; c++){  
               System.out.print(z[l][c] + " ");  
            }  
            System.out.println();  
        }  
        return z;
    }     

    public static int[][] multiMatrix(int x[][], int y[][]) {
        int sum = 0;
        int multi = 0;
        int matrix[][] = new int[x.length][y[0].length];
        for (int l = 0; l < y[0].length; l++) {
            for (int c = 0; c < x.length; c++) {
                for (int m = 0; m < y.length; m++) {
                    multi = x[l][m] * y[m][c];
                    sum = multi + sum;
                }
                matrix[l][c] = sum;
                multi = 0;
                sum = 0;
            }
        }
        return matrix;
    }

    public static void showMatrix(int C[][]) {
        for (int l = 0; l < C.length; l++) {
            for (int c = 0; c < C.length; c++) {
                System.out.print(C[l][c] + "\t");
            }
            System.out.println();
        }
    }
}
