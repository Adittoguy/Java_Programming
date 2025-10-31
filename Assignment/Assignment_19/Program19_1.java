////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckLeapYear
//  Description     :   Used to check the given year is leap or not
//  Input           :   Integer
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   31/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CheckLeapYear(int iNo)
    {
        if((iNo % 400)==0 || (iNo % 4)==0 && (iNo % 100)!=0)
        {
            System.out.print("This is Leap Year");
        }
        else 
        {
            System.out.print("This is not a Leap Year");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program19_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2024);
    }
}