package Day11;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //printEvenNumbers(4, 10);
        //getNumberWithReminders(15, 23, 0, 3);
        //exactSquares(2, 8);
        //getCountOfD(157, 5);
        //getSmallestNaturalDivisor(23);
        //printNaturalDivisors(15);
        //getCountOf2Divisors(35);
        //getMultiplicationTable();
        //printPatterns(10);
        //sumOfIntegers();
        //convertBinaryToDecimal(1001);
        //getNumberOfZeros(15);
        //printPicture(10);
    }


    public static void printEvenNumbers(int a, int b) {
        for (int i = 0; i < b; i++) {
            if (i % 2 == 0 && i >= a) {
                System.out.println(i);
            }
        }
    }

    public static void getNumberWithReminders(int a, int b, int c, int d) {
        for (int i = 0; i < Math.max(a, b); i++) {
            if (i % d == c && i % d == c) {
                if (i > Math.min(a, b)) {
                    System.out.println(i);
                } else System.out.println("");
            }
        }

        /*public static void getNumberWithReminder1 ( int a, int b, int c, int d){
            for (int i = a; i < b; i++) {
                if (i % d == c && i % d == c) {
                    System.out.println(i);
                } else System.out.println("");
            }
        }*/
    }

    public static void exactSquares(int a, int b) {
        for (int i = a; i < b; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                System.out.println(i);
            } else System.out.println("");
        }

    }


    // ?????????????
    public static void getCountOfD(int x, int d) {
        for (int i = 0; i < x; i++) {
            if (x % 10 == d) {
                System.out.println(i);
            }
        }
    }

    public static void getSmallestNaturalDivisor(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            } else System.out.println(x);
            break;
        }
    }


    public static void printNaturalDivisors(int x) {
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void getCountOf2Divisors(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }


    public static void sumOfIntegers() {
        Scanner my = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += my.nextInt();
        }
        System.out.println("The total sum is: " + sum);
    }


    /*public static int convertBinaryToDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }*/


    public static void getNumberOfZeros(int n) {
        int numbers0 = 0;
        int posNumbers = 0;
        int negativeNumbers = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                numbers0++;
            }

        }
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                posNumbers++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < 0) {
                negativeNumbers++;
            }
        }
        System.out.println(numbers0);
        System.out.println(posNumbers);
        System.out.println(negativeNumbers);

    }

     public static  void printPicture(int n){
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n; j++)
                     System.out.print("*");
             System.out.println("");
         }
     }





    public static void getMultiplicationTable() {

        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print(a * b + "\t");
            }
            System.out.println();
        }
    }


    public static void printPatterns(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("\t");
            for (int j = 1; j <= n; j++)
                if ((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0))
                    System.out.print("#");
                else
                    System.out.print(" ");
            System.out.println();
        }

    }


}









