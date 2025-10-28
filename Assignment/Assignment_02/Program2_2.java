import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Description     :   Used to print number of star given by user
//  Input           :   Integer
//  Output          :   *
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   17/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void Display(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            System.out.print("*");
            iNo--;
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program2_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.print("Enter number : ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.Display(iValue);
    }
}