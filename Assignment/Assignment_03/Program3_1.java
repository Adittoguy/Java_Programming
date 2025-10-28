import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   PrintEven
//  Description     :   Used to Print even numbers
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void PrintEven(int iNo)
    {
        int iCnt = 0;

        if(iNo <= 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt<= iNo; iCnt++)
        {
            System.out.print(iCnt*2 +"\t");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program3_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.print("Enter number: ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.PrintEven(iValue);
    }
}