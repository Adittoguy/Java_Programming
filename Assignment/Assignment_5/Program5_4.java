import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckNumberType
//  Description     :   Used to check weather number is positive,negative or zero
//  Input           :   Integer
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void CheckNumberType(int iNo)
    {
        if(iNo > 0)
        {
            System.out.print("It is Positive Number");
        }
        else if(iNo < 0)
        {
            System.out.print("It is Negative Number");
        }
        else
        {
            System.out.print("It is Zero");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program5_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNum = 0;
        System.out.println("Enter Number: ");
        iNum = sobj.nextInt();

        Demo dobj = new Demo();
        dobj.CheckNumberType(iNum);
    }
}