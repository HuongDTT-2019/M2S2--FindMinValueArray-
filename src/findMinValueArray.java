import java.util.Scanner;

public class findMinValueArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size;
        System.out.println("Enter the size of array:");
        size = input.nextInt();
        array = new int[size];
        insertValue(array);
        System.out.println("Array:");
        disPlayArray(array);
        System.out.println("\nMax value is: " + minValue(array));
        ;
    }

    public static void insertValue(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            array[i] = input.nextInt();
        }
    }

    public static void disPlayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }

    public static int minValue(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
