import java.util.Scanner;

public class num2 {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double one = in.nextDouble();
        System.out.print("Input second number: ");
        double two = in.nextDouble();
        System.out.print("Input third number: ");
        double three = in.nextDouble();
        double mult=one*two*three;
        System.out.printf("Multiplication :%f \n", mult);
        double  aver = (one+two+three)/3;
        System.out.printf("Average :%f \n", aver);
        if (one > two) {
            if (two > three)  {
                System.out.printf("%f \n", three);
                if(one > two){
                    System.out.println(two);
                    System.out.println(one);
                } else {
                    System.out.println(one);
                    System.out.println(two);
                }
            }
            else {
                System.out.println(two);
                if (three < one)
                {
                    System.out.println(three);
                    System.out.println(one);
                }
                else
                {
                    System.out.println(one);
                    System.out.println(three);
                }
            }
        } else if (one<three) {

            System.out.println(one);
            if (three < two) {
                System.out.println(three);
                System.out.println(two);
            } else {
                System.out.println(two);
                System.out.println(three);
            }

        } else { System.out.println(three);
            if (one < two) {
                System.out.println(one);
                System.out.println(two);
            } else {
                System.out.println(two);
                System.out.println(one);
            }
        }
    }
}
