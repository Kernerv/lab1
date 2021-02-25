import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first coefficient of the quadratic equation(a):");
        double a = in.nextDouble();
        System.out.print("Input second coefficient of the quadratic equation(b):");
        double b = in.nextDouble();
        System.out.print("Input third coefficient of the quadratic equation(c):");
        double c = in.nextDouble();
        if (a == 0) {
            if (b!=0){
                double x = -c / b;
                System.out.println(x);}
            else {
                System.out.print("Error");
            }
        } else {
            double D = b * b - 4 * a * c;
            if (D > 0) {
                System.out.print("Two roots of the quadratic equation\n");
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println(x1);
                System.out.println(x2);
            }
            if (D == 0) {
                System.out.print("One root of the quadratic equation\n");
                double x = -b / (2 * a);
                System.out.println(x);
            }
            if (D < 0) {
                System.out.print("No roots of the quadratic equation\n");
            }
        }
    }
}

