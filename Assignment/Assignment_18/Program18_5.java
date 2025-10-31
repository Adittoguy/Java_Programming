////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckSign
//  Description     :   Used to check Sign given number 
//  Input           :   Integer
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   31/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CheckSign(int iNo)
    {
        if(iNo > 0)
        {
            System.out.print("It's positive");
        }
        else if(iNo < 0)
        {
            System.out.print("It's negative");
        }
        else
        {
            System.out.print("Zero");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program18_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckSign(-8);
    }
}