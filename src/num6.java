import java.util.Scanner;

public class num6
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Input first coefficient of the first quadratic equation(a1): ");
        double a1=in.nextDouble();
        System.out.print("Input second coefficient of the first quadratic equation(b1): ");
        double b1=in.nextDouble();
        System.out.print("Input third coefficient of the first quadratic equation(c1): ");
        double c1=in.nextDouble();
        System.out.print("Input first coefficient of the second quadratic equation(a2): ");
        double a2=in.nextDouble();
        System.out.print("Input second coefficient of the second quadratic equation(b2): ");
        double b2=in.nextDouble();
        System.out.print("Input third coefficient of the second quadratic equation(c2): ");
        double c2=in.nextDouble();
        double D=a1*b2-a2*b1;
        double D1=c1*b2-c2*b1;
        double D2=a1*c2-a2*c1;
        double x=D1/D;
        double y=D2/D;
        if (D==0 && D1==0 && D2==0)
        {
            System.out.print("The system of linear equations has an infinite set of solutions");
        }
        if (D==0 && D1!=0 & D2!=0)
        {
            System.out.print("The system of linear equations has no solutions");
        }
        if (D!=0)
        {
            System.out.println(x);
            System.out.println(y);
        }

    }
}
