import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckEven
//  Description     :   Used to Check the number is even or not
//  Input           :   Integer
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   17/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public boolean CheckEven(int iNo)
    {
        if((iNo % 2)==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program2_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.print("Enter number : ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        boolean bRet = false;

        bRet = dobj.CheckEven(iValue);

        if(bRet == true)
        {
            System.out.print(iValue+ " is a Even number");
        }
        else
        {
            System.out.print(iValue+ " is a Odd number");
        }

    }
}