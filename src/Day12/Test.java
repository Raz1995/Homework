package Day12;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        printEvenIndexes(arr);
//        System.out.println(arr.length);

//        printEvenElement(arr);

//        printPositiveElement(arr);

//        printNextLargerElement(arr);

//        printElementsSameSigns(arr);

//        printMaxElementAndIndex(arr);

//        printMinPosElement(arr);

//        printDifElementCount(arr);

        //      printReverseArray(arr);
        //       printReversedArray(arr);
        //???changeArrayAdjacentElements(arr);
        swipeMaxAndMin(arr);
        //cycleElements(arr);
        //???findAndDeleteIndexedElement(arr);


    }


    /*public static void initArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Invalid");
        }
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }*/


    public static void printEvenIndexes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void initArr() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printEvenElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void printPositiveElement(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static void printNextLargerElement(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void printElementsSameSigns(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] * arr[i] > 0) {
                System.out.print(arr[i - 1] + " " + arr[i]);
                break;
            }
        }
    }

    public static void printMaxElementAndIndex(int[] arr) {
        int max = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                max = arr[i];
                count = i;
            }
        }
        System.out.println(max + " " + count);
    }

    public static void printMinPosElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i] && arr[i - 1] > 0) {
                min = arr[i - 1];
            }
        }
        System.out.println(min);
    }

    public static void printDifElementCount(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void printReverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void printReversedArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void changeArrayAdjacentElements(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }


    public static void cycleElements(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }

    //??????????????????
    public static void swipeMaxAndMin(int[] arr) {
        int max;
        int min;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] > arr[i]) {
                max = arr[i + 1];
                min = arr[i];
                temp = max;
                max = min;
                min = temp;
            }

            System.out.println(arr[i]);
        }
    }



        /*
        public static void findAndDeleteIndexedElement(int[] arr){
            int i;
            int len = arr.length;
            for (i = 0; i < len; i++)
                // if (arr[i] == arr[k])
                break;
            if (i < len) {
                len = len - 1;
                for (int j = i; j < len; j++)
                    arr[j] = arr[j + 1];
            }
        }*/

    //???
    public static void printUniqueValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.println(i);
            }
        }
    }
}






