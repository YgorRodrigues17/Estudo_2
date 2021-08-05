import java.util.Scanner;

public class Matrix {
    Scanner sc1 = new Scanner(System.in);
    int[][] mat = new int[3][3]; // Create matrix 3x3
    {
        for (int i = 0; i < 3; i++) // create 3 rows
            for (int j = 0; j < 3; j++) // create 3 columns
                mat[j][i] = j * i;
    }

    public void sumLines() {
        for (int i = 0; i < mat.length; i++) { // LENGTH FUNCTION RETURN NUMBER OF CHARACTERS
            int sum = 0; // create sum variable and receive value 0
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[j][i];
            }
            System.out.println(sum); // screen write result
        }
    }

    public void subLines() {
        for (int i = 0; i < mat.length; i++) {
            int sub = 0; // create sub variable and receive value 0
            for (int j = 0; j < mat.length; j++) {
                sub -= mat[j][i];
            }
            System.out.println(sub); // screen write result
        }
    }

    public void multiMatrix() {
        for (int i = 0; i < mat.length; i++) {
            int mult = 0; // create mult variable and receive value 0
            for (int j = 0; j < mat.length; j++) {
                mult = mat[j][i] * mat[j][i]; // mult receive multiply operation of matrix
            }
            System.out.println(mult); // screen write result
        }
    }

    public void maxValue() { // this method go return max value in final position
        for (int i = 0; i < mat.length; i++) {
            int max = 0;
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] > max) {
                    max = mat[j][i]; // assigns min value a position in matrix
                }
                System.out.println(max); // screen write result
            }
        }
    }

    public void minValue() { // this method go return min value in first position
        for (int i = 0; i < mat.length; i++) {
            int min = 0;
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] < min) {
                    min = mat[j][i]; // assigns min value a position in matrix
                }
                System.out.println(min); // screen write result
            }
        }
    }

    public void numPair() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i % 2 != 0) { // operation for select numbers wich division with 2 is 0(ARE ODD)
                    System.out.println("ODD");
                }
                if (mat[j][i] % 2 == 0) { // operation for select numbers of matrix wich divison for 2 is 0(ARE PAIR)
                    System.out.println("PAIR"); // write a pair numbers
                }
            }
        }
    }

    public void matrixOrder() {
        for (int i = 0; i < mat.length - 1; i++) {
            for (int j = i + 1; j < mat.length; j++) {
                if (mat[j][0] > mat[i][0]) {
                    int[] tmp = mat[i];
                    mat[i] = mat[j];
                    mat[j] = tmp;
                }
                System.out.println(mat);
            }
        }
    }

    public boolean primeNumber(int num) {
        boolean primo = true; // create boolean method
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                primo = false; // return false if number not prime
            }
        }
        return primo; // return true if nnumber is prime
    }

    public int factElement(int n) {
        if (n == 1 || n == 0)
            return 1;
        return ((factElement(n - 1)) * n);
    }

    public int factLines(int n) {
        if (n == 1 || n == 0)
            return 1;
        return ((factElement(n - 1)) * n);
    }
}
