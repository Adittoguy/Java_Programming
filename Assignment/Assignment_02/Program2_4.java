import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Description     :   Used to display the same number multiple time provided by user
//  Input           :   Integer, Integer
//  Output          :   Integer, Integer, Integer, .....
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   17/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void Display(int iNo, int iFrequency)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iFrequency < 0)
        {
            iFrequency = -iFrequency;
        }

        for(iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.print(iNo+ "\t");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program2_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iCount = 0;

        System.out.print("Enter number : ");
        iValue = sobj.nextInt();

        System.out.print("Enter count : ");
        iCount = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.Display(iValue, iCount);
    }
}