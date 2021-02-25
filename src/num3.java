import java.util.Scanner;
class num3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int one = in.nextInt();
        System.out.print("Input second number: ");
        int two = in.nextInt();
        System.out.print("Input third number: ");
        int three = in.nextInt();
        int mult=one*two*three;
        System.out.printf("Multiplication :%d \n", mult);
        double  aver = (one+two+three)/3.0;
        System.out.printf("Average :%f \n", aver);
        if (one > two) {
            if (two > three)  {
                System.out.println(three);
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
