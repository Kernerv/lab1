import java.util.Scanner;

public class Vector3DProcessor
{
    public static Vector3D sum(Vector3D a,Vector3D b)
    {
        return new Vector3D(a.getX()+b.getX(),a.getY()+b.getY(),a.getZ()+b.getZ());
    }

    public static Vector3D difference(Vector3D a,Vector3D b)
    {
        return new Vector3D(a.getX()-b.getX(),a.getY()-b.getY(),a.getZ()-b.getZ());
    }


    public static double scalarProduct(Vector3D a,Vector3D b)
    {
        return a.getX()*b.getX()+a.getY()*b.getY()+a.getZ()*b.getZ();
    }

    public static Vector3D vectorProduct(Vector3D a, Vector3D b)
    {
        double i=a.getY()*b.getZ()-a.getZ()*b.getY();
        double j=a.getX()*b.getZ()-a.getZ()*b.getX();
        double k=a.getX()*b.getY()-a.getY()*b.getX();
        return new Vector3D(i,j,k);
    }

    //public static boolean collinearity(Vector3D a,Vector3D b)
    //{
    //    if (a.getX()/b.getX()==a.getY()/b.getY() && a.getY()/b.getY()==a.getZ()/b.getZ())
    //    {
    //        System.out.println("Two vectors are collinear");
    //        return true;
    //    }
    //    System.out.println("Two vectors are not collinear");
    //    return false;
    //}
    public static boolean collinearitytrue(Vector3D a,Vector3D b)
    { Vector3D n=new Vector3D();
        if (vectorProduct(a,b).equals(n))
        {
            System.out.println("Two vectors are collinear");
            return true;
        }
        System.out.println("Two vectors are not collinear");
        return false;
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Input tree numbers (the coordinates of the vector):");
        double x= in.nextDouble();
        double y= in.nextDouble();
        double z= in.nextDouble();
        Vector3D a=new Vector3D(x,y,z);
        System.out.println("Input tree numbers (the coordinates of the vector):");
        double x1= in.nextDouble();
        double y1= in.nextDouble();
        double z1= in.nextDouble();
        Vector3D b=new Vector3D(x1,y1,z1);
        System.out.println("Sum="+sum(a,b));
        System.out.println("Difference="+difference(a,b));
        System.out.println("Scalar Product= "+scalarProduct(a,b));
        System.out.println("Vector product="+vectorProduct(a,b));
        Vector3D n=new Vector3D();
        collinearitytrue(a,b);

    }
}
