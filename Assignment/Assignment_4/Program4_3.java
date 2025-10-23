import java.util.Scanner;

class Demo
{
    public void NonFactor(int iNo)
    {
        if(iNo <= 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0;

        for(iCnt = 1; iCnt<= iNo; iCnt++)
        {
            if((iNo % iCnt)!= 0)
            {
                System.out.print(iCnt + "\t");
            }
        } 
    }
}

class Program4_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.print("Enter number: ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.NonFactor(iValue);
    }
}