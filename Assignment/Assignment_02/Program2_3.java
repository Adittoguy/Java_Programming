import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Description     :   Used to Display string based of condition
//  Input           :   Integer
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   17/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void Display(int iNo)
    {
        if(iNo < 10)
        {
            System.out.print("Hello");
        }
        else
        {
            System.out.print("Demo");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program2_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.print("Enter number: ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.Display(iValue);
    }
}