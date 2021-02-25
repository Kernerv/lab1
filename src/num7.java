import java.util.Scanner;

public class num7
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input x: ");
        double x=in.nextDouble();
        double k=1;
        int n=1;
        double s=1;
        System.out.print("Input accurate: ");
        double E=in.nextDouble();
        while (Math.abs(k)>E)
        {
            k*=x/n;
            s+=k;
            n++;
        }
        System.out.println(s);
    }
}

