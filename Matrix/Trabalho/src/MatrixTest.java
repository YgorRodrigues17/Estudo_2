import java.util.Scanner;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(); // create one matrix m1

        Scanner sc1 = new Scanner(System.in);
        int opc = 5;

        while (opc != 0) {
            System.out.println("Select one option");
            System.out.println("1 - Sum lines");
            System.out.println("2 - Subtrace lines");
            System.out.println("3 - Multiply");
            System.out.println("4 - Max value");
            System.out.println("5 - Min value");
            System.out.println("6 - Pair numbers");
            System.out.println("7 - Matrix order");
            System.out.println("8 - Prime number");
            System.out.println("9 - Factorial element");
            System.out.println("10 - Factorial lines");

            System.out.println("0 - Exit");
            opc = sc1.nextInt();

            if (opc == 1) {
                m1.sumLines(); // call method
            } else if (opc == 2) {
                m1.subLines(); // call method
            } else if (opc == 3) {
                m1.multiMatrix();
            } else if (opc == 4) {
                m1.maxValue();
            } else if (opc == 5) {
                m1.minValue();
            } else if (opc == 6) {
                m1.numPair();
            } else if (opc == 7) {
                m1.matrixOrder();
            } else if (opc == 8) {
                m1.primeNumber(2);
            } else if (opc == 9) {
                int fat = new Matrix().factElement(5); // create object fat and add value
                System.out.println(fat); // write fat object
            } else if (opc == 10) {
                int fat = new Matrix().factLines(4); // create object fat and add value
                System.out.println(fat); // write fat object
            }

        }

    }
}