package Day10;

public class Test {
    public static void main(String[] args) {
        //printIntNumbers();
        //printEvenInts();
        //getSquareOfNaturalNumbers(10);
        //getSmallestDivisor(5);
        //getSquareOfNaturalNumbers(48);
        //printPowersOfNumbers(15);
        //printNumbersDescending(15);
        //printNumbersOfMultiply2(24);
        //getExactPower(151);
        //getSmallestInt(17);


    }


    // using while loop print all numbers between 1 and 10
    public static void printIntNumbers() {
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    //print event numbers between 0 and 20
    public static void printEvenInts() {
        int i = 2;
        while (i < 20) {
            System.out.println(i);
            i = i + 2;
        }
    }

    public static void getSquareOfNaturalNumbers(int N) {
        int square = 1;
        int squared = 1;
        while (squared < N) {
            squared = square * square;
            System.out.println(squared);
            square++;
        }
    }

    public static void getSmallestDivisor(int x) {
        int div = 2;
        while (div <= x) {
            if (x % div == 0) {
                System.out.println(div);
                break;
            }
            div++;
        }
    }


    public static void printPowersOfNumbers(int N) {
        int i = 0;
        int power = 1;
        while (power < N) {
            System.out.println(power);
            power = power * 2;
            i++;
        }
    }


    public static void printNumbersDescending(int N) {
        int i = N - 1;
        while (i < N) {
            if (i > 0) {
                System.out.println(i);
                i--;
            }
        }

    }

    /*public static void printNumbersOfMultiply2(int N) {
        int i = 0;
        while (i < N) {
            if (i > 0 && i % 2 == 0) {
                System.out.println(i);
                i++;
            }
        }
    }*/

    public static void getExactPower(int n) {
        int i = 0;
        while (i < n) {
            if (i != 0 && n == i * i) {
                System.out.println(i);
                break;
            }
            i++;
            System.out.println(i);
        }

    }
            public static void getSmallestInt(int n){
            int num =1;
            int k =0;
            while (num <n){
                num *=2;
                k++;
            }
                System.out.println(k);
            }



}


