////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckEvenOdd
//  Description     :   Used to check N is even or odd
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   30/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CheckEvenOdd(int iNo)
    {
        if((iNo % 2)==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program16_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckEvenOdd(7);
    }
}