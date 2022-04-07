import java.util.Scanner;

public class NazarShaheenA2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please Enter the length of an array: ");

        while(!keyboard.hasNextInt()) {
            keyboard.next();
            System.err.print("Please enter an integer value ranging from  1 to 10: ");
        }

        int size = keyboard.nextInt();
        if (size <= 10 & size > 0) {
            int[] originalArray = getArray(size);
            System.out.print("The input array is: [ ");

            for(int i = 0; i < originalArray.length; ++i) {
                System.out.print(originalArray[i] + " ");
            }

            System.out.print("]");
            System.out.println();
            getLargest(originalArray);
            getSmallest(originalArray);
            int[] sortedArray = getSorted(originalArray);
            System.out.print("The sorted array is: [ ");

            for(int i = 0; i < sortedArray.length; ++i) {
                System.out.print(sortedArray[i] + " ");
            }

            System.out.print("]");
            System.out.println();
            getOddEven(originalArray);
            int[] reverseArray = getReverse(originalArray);
            System.out.print("The array in reverse order is: [ ");

            for(int i = 0; i < reverseArray.length; ++i) {
                System.out.print(reverseArray[i] + " ");
            }

            System.out.print("]");
            System.out.println();
            System.out.println();
            System.out.println("Program Completed.");
        } else {
            System.err.println("Program takes integer array length from 1 to 10");
            System.err.print("Please try the program again with valid input");
        }

    }

    public static int[] getArray(int size) {
        int[] arr = new int[size];
        System.out.println("Please Enter the " + size + " elements in the array: ");
        Scanner keyboard2 = new Scanner(System.in);

        for(int i = 0; i < size; ++i) {
            String input = keyboard2.next();

            try {
                Integer.parseInt(input);
                arr[i] = Integer.parseInt(input);
            } catch (NumberFormatException var6) {
                System.err.println("Elements entered is/are not valid : all must be integer");
                System.err.print("Please try the program again with valid input");
                System.exit(0);
            }
        }

        return arr;
    }

    public static void getLargest(int[] arr) {
        int largest = arr[0];
        int index = 0;

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] > largest) {
                largest = arr[i];
                index = i;
            }
        }

        System.out.println("The Largest Number is: " + largest);
        System.out.println("The first index of the largest number is: " + index);
    }

    public static void getSmallest(int[] arr) {
        int smallest = arr[0];

        int i;
        for(i = 1; i < arr.length; ++i) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("The smallest number is: " + smallest);
        System.out.print("All indexes of the smallest number are: ");

        for(i = 0; i < arr.length; ++i) {
            if (arr[i] == smallest) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static int[] getSorted(int[] arr) {
        int[] sortArr = new int[arr.length];

        int i;
        for(i = 0; i < arr.length; ++i) {
            sortArr[i] = arr[i];
        }

        for(i = 0; i < sortArr.length; ++i) {
            for(int j = i + 1; j < sortArr.length; ++j) {
                if (sortArr[i] > sortArr[j]) {
                    int temp = sortArr[i];
                    sortArr[i] = sortArr[j];
                    sortArr[j] = temp;
                }
            }
        }

        return sortArr;
    }

    public static int[] getReverse(int[] arr) {
        int[] Revarr = new int[arr.length];
        int j = 0;

        for(int i = arr.length - 1; i >= 0; --i) {
            Revarr[j] = arr[i];
            ++j;
        }

        return Revarr;
    }

    public static void getOddEven(int[] arr) {
        int countOdd = 0;
        int countEven = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) {
                ++countEven;
            } else {
                ++countOdd;
            }
        }

        System.out.println("Count of Even Numbers: " + countEven);
        System.out.println("Count of Odd Numbers: " + countOdd);
    }
}
