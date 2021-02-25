import java.util.Scanner;

public class Array {
    public static void num8(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }

    public static void num9(int[] array) {
        Scanner in = new Scanner(System.in);
        for (int j = 0; j < array.length; j++) {

            System.out.print("Input elem: ");
            array[j] = in.nextInt();

        }
    }

    public static int num10(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int num11(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                k++;
            }
        }
        return k;
    }

    public static int num12(int[] array) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
        int l = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= a && array[i] <= b) {
                l++;
            }
        }
        return l;
    }


    public static boolean num13(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.println("Not all elements are positive");
                return false;
            } else {
                System.out.println("All elements are positive");
                return true;
            }
        }
        return false;
    }

    public static void num14(int[] array) {

        int l = array.length / 2;

        int buf;
        for (int i = 0; i < l; i++) {
            buf = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buf;
        }
        num8(array);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input size: ");
        int k = in.nextInt();
        int[] array = new int[k];
        num9(array);
        num8(array);
        System.out.println(num10(array));
        System.out.println(num11(array));
        System.out.println(num12(array));
        num13(array);
        num14(array);
    }
}
