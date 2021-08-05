import java.util.Scanner;
public class AlgorithmTest{
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        int n1;
        n1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        int n2;
        n2 = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        int n3;
        n3 = sc3.nextInt();

        Scanner sc4 = new Scanner(System.in);
        int n4;
        n4 = sc4.nextInt();

        Scanner sc5 = new Scanner(System.in);
        int n5;
        n5 = sc5.nextInt();

        int greater;
        greater = n1;
        if(n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5){
            greater = n2;
        }
        else if(n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5){
            greater = n3;
        }
        else if(n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5){
            greater = n4;
        }
        else if(n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4){
            greater = n5;
        }

        int smaller;
        smaller = n1;
        if(n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5){
            smaller = n2;
        }
        else if(n3 < n1 && n3 <n2 && n3 < n4 && n3 < n5){
            smaller = n3;
        }
        else if(n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5){
            smaller= n4;
        }
        else if(n5 < n1 && n5 < n2 && n5 < n3 && n5 < n4){
            smaller = n5;
        }


        System.out.println("The max value is: "+greater);
        System.out.println("The min value is: "+smaller);

        int sum;
        sum= greater + smaller;
        System.out.println("The sum between greater and smaller is: "+sum);

        if(sum % 2 == 0){
            System.out.println("PAIR");
        }
        else{
            System.out.println("ODD");
        }

        if(sum % 2 == 1){
            System.out.println("Is prime");
        }
        else{
            System.out.println("Is not prime");
        }


        
        




    }
}