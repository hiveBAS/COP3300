import java.util.Scanner;

public class TriangleYN
{
    public static void checkTriangle(double a,double b,double c)//our static function will call from
    {
        if(a==0 || b==0 || c==0)
        {
            System.out.println("You have Entered Zero ");//display message if arg is zero
        }
        else
        {
//logic for getting valid or not valid triangle here
            if(((a+b)>c) && ((b+c)>a) && ((a+c)>b))
            {
                System.out.printf("A triangle could measure %.2f, %.2f, by %.2f.",a,b,c);
            }
            else
            {
                System.out.printf("A triangle could not measure %.2f, %.2f, by %.2f.",a,b,c);
            }

        }

    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three sizes, separated by spaces(decimals values are acceptable):");
        double a,b,c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        checkTriangle(a,b,c);//Call Function here
    }
}