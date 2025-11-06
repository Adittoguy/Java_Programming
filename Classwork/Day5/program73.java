import java.util.Scanner;

class program73
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        
        System.out.println("Enter number: ");
        iNo = sobj.nextInt();

        int i = 0;

        for(i = 1; i <= (iNo/2); i++)
        {
            if((iNo % i) == 0)
            {
                System.out.println(i);
            }
        }
    }
}