import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Vector3DArray {
    private Vector3D arrayVector[];

    @Override
    public String toString() {
        return "Vector3DArray{" +
                "arrayVector=" + Arrays.toString(arrayVector) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector3DArray)) return false;
        Vector3DArray that = (Vector3DArray) o;
        return Arrays.equals(arrayVector, that.arrayVector);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arrayVector);
    }

    public Vector3DArray(int size) {
        this.arrayVector = new Vector3D[size];
        for (int i = 0; i < size; i++) {
            arrayVector[i] = new Vector3D();
        }
    }


    public int vectorLengthArray() {
        return arrayVector.length;
    }

    public void exchangeElem(int i, Vector3D a) {
        arrayVector[i] = a;
    }

    public double maxLength() {
        double max = 0;
        for (Vector3D i : arrayVector) {
            if (Math.abs(i.length()) - max > 1E-9) {
                max = i.length();
            }
        }
        return max;
    }

    public int searchVector(Vector3D a) {
        for (int i = 0; i < vectorLengthArray(); i++) {
            if (arrayVector[i].equals(a)) {
                return i;
            }
        }
        return -1;
    }

    public Vector3D sumVectors() {
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < vectorLengthArray(); i++) {
            x += arrayVector[i].getX();
            y += arrayVector[i].getY();
            z += arrayVector[i].getZ();
        }
        return new Vector3D(x, y, z);
    }

    public static Vector3D product(Vector3D vector3D, double l) {
        return new Vector3D(vector3D.getX() * l, vector3D.getY() * l, vector3D.getZ() * l);
    }

    public static void fillingTheArray(double[] array) {
        Scanner in = new Scanner(System.in);
        for (int j = 0; j < array.length; j++) {
            System.out.print("Input elem: ");
            array[j] = in.nextInt();
        }
    }


    public Vector3D vectorLK(double[] array) {
        double x = 0, y = 0, z = 0;
        Vector3D vector3D = new Vector3D();
        Vector3DProcessor s = new Vector3DProcessor();
        if (array.length != vectorLengthArray()) {
            return vector3D;
        }
        for (int i = 0; i < array.length; i++) {
            vector3D = s.sum(vector3D, product(arrayVector[i], array[i]));
        }
        return vector3D;
    }

    public Point3D[] vectorArrayPoint(Point3D P) {
        Point3D[] point3DS = new Point3D[arrayVector.length];
        for (int j = 0; j < point3DS.length; j++) {
            point3DS[j] = new Point3D(P.getX() + arrayVector[j].getX(),
                    P.getY() + arrayVector[j].getY(),
                    P.getZ() + arrayVector[j].getZ());
        }
        for (int j = 0; j < point3DS.length; j++) {
            System.out.println(point3DS[j].toString());
        }
        return point3DS;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array:");
        int size = in.nextInt();
        System.out.println("Input number of element:");
        int i = in.nextInt();
        System.out.println("Input tree numbers (the coordinates of the vector):");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        Vector3D a = new Vector3D(x, y, z);
        Vector3D b = new Vector3D(1, 1, 1);
        Vector3D b1 = new Vector3D(2, 2, 2);
        Vector3DArray one = new Vector3DArray(size);
        System.out.println("Vector length array: " + one.vectorLengthArray());
        one.exchangeElem(i, a);
        one.exchangeElem(1, b);
        one.exchangeElem(2, b1);
        System.out.println("Max length: " + one.maxLength());
        System.out.println("Search vector: " + one.searchVector(a));
        System.out.println("Sum vectors: " + one.sumVectors());
        System.out.println("Input size of array for number: ");
        int k = in.nextInt();
        double[] test = new double[k];
        fillingTheArray(test);
        System.out.println("Linear combination of vectors: " + one.vectorLK(test));
        System.out.println("Input point: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double z1 = in.nextDouble();
        Point3D P = new Point3D(x1, y1, z1);
        System.out.println("Vector array point: ");
        one.vectorArrayPoint(P);

    }
}
