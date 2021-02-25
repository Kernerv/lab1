import java.util.Objects;
import java.util.Scanner;

public class Point3D {
    private double x, y, z;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return Math.abs(point3D.x- x )<= 1E-9 &&
                Math.abs(point3D.y- y) <= 1E-9 &&
                Math.abs(point3D.z- z) <= 1E-9;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    Point3D(double first, double second, double third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double first) {
        this.x = first;
    }

    public void setY(double second) {
        this.y = second;
    }

    public void setZ(double third) {
        this.z = third;
    }

    public static void printf(Point3D point3D) {
        System.out.println(point3D.x);
        System.out.println(point3D.y);
        System.out.println(point3D.z);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number:");
        double first = in.nextDouble();
        System.out.print("Input second number:");
        double second = in.nextDouble();
        System.out.print("Input third number: ");
        double third = in.nextDouble();
        Point3D A = new Point3D(first, second, third);

        System.out.print("Input first number: ");
        double first1 = in.nextDouble();
        System.out.print("Input second number: ");
        double second1 = in.nextDouble();
        System.out.print("Input third number: ");
        double third1 = in.nextDouble();
        Point3D B = new Point3D(first1, second1, third1);
        if(A.equals(B))
            System.out.println("Two points equal");
        else
            System.out.println("Two points do not equal");

        if(A.equals(A))
            System.out.println("It is the same point");
        else
            System.out.println("It is not the same point");

        if(A == B) {
            System.out.println("== Two points equal");

        }

        printf(A);
        printf(B);
    }
}
