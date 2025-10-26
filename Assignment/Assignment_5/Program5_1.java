import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckEvenOdd
//  Description     :   Used to Check even or odd number
//  Input           :   Integer
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void CheckEvenOdd(int iNo)
    {
        if((iNo % 2)==0)
        {
            System.out.print(iNo+" is Even");
        }
        else
        {
            System.out.print(iNo+ " is Odd");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program5_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;
        System.out.println("Enter number: ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();
        dobj.CheckEvenOdd(iValue);
    }
}