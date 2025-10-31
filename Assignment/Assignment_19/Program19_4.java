////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   PrintDigits
//  Description     :   Used to print the digits of givrn number
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   31/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void PrintDigits(int iNo)
    {
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo /= 10; 
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program19_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintDigits(9876);
    }
}