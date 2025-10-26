import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckLeapYear
//  Description     :   Used to check given year is leap year or not
//  Input           :   Integer
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void CheckLeapYear(int iYr)
    {
        if((iYr % 4==0) && (iYr % 100 != 0) || (iYr % 400 == 0))
        {
            System.out.print(iYr+ " is a leap year"); 
        }
        else
        {
            System.out.print(iYr+ " is not a leap year");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program5_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iYear = 0;
        System.out.println("Enter Year: ");
        iYear = sobj.nextInt();

        Demo dobj = new Demo();
        dobj.CheckLeapYear(iYear);
    }
}