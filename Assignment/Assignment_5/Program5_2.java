import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FindMaxNumber
//  Description     :   Used to Display largest number among two
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public int FindMaxNumber(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            return iNo1;
        }
        else
        {
            return iNo2;
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program5_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0;
        int iValue2 = 0;
        int iRet = 0;

        System.out.println("Enter first number: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        iValue2 = sobj.nextInt();

        Demo dobj = new Demo();
        iRet = dobj.FindMaxNumber(iValue1, iValue2);

        System.out.print("Greater number is: "+iRet);
    }
}