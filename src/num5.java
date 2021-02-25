import java.util.Scanner;

public class num5
{
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input lower limit:" );
        double a= in.nextDouble();
        System.out.print("Input upper limit:" );
        double b= in.nextDouble();
        System.out.print("Input step: ");
        double h=in.nextDouble();
        if(h==0){
            System.out.println("Error");
        }
        double help;
        if(a>b){
            help=a;
            a=b;
            b=help;
        }
        if(h<0)
            h=-h;
        for(double x= a; x-b<=1E-9; x=x+h)
        {
            System.out.format("%10.6f|%10.6f\n",x,Math.sin(x));
        }

    }
}