import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FindLargestNumber
//  Description     :   Used to Display largest number among 3 numbers
//  Input           :   Integer
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public int FindLargestNumber(int iNo1, int iNo2, int iNo3)
    {
        if(iNo1 > iNo2)
        {
            if(iNo1 > iNo3)
            {
                return iNo1;
            }
            else
            {
                return iNo3;
            }
        }
        else
        {
            if(iNo2 > iNo3)
            {
                return iNo2;
            }
            else
            {
                return iNo3;
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program5_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0;
        int iValue2 = 0;
        int iValue3 = 0;
        int iRet = 0;

        System.out.println("Enter first number: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter third number: ");
        iValue3 = sobj.nextInt();

        Demo dobj = new Demo();
        iRet = dobj.FindLargestNumber(iValue1, iValue2, iValue3);

        System.out.print("Greater number is: "+iRet);
    }
}