import java.util.Scanner;

public class Vector3D {
    private double x, y, z;

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
    }

    public Vector3D(Point3D a, Point3D b) {
        this(b.getX() - a.getX(), b.getY() - a.getY(), b.getZ() - a.getZ());
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    @Override
    public boolean equals(Object o) {
        final double eps = 1E-9;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Math.abs(vector3D.x - x) <= eps && Math.abs(vector3D.y - y) <= eps
                && Math.abs(vector3D.z - z) <= eps;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = in.nextDouble();
        System.out.println("Input y: ");
        double y = in.nextDouble();
        System.out.println("Input z: ");
        double z = in.nextDouble();
        Vector3D vector3D = new Vector3D();
        Vector3D vector3D1 = new Vector3D(x, y, z);
        System.out.println("length=" + vector3D.length());
        System.out.println("length=" + vector3D1.length());
        if (vector3D.equals(vector3D1)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

    }
}
