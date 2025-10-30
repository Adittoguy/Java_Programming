////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   ReverseNumber
//  Description     :   Used to print given number in reverse
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   30/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void ReverseNumber(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit);
            iNo /= 10;
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program16_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.ReverseNumber(1234);
    }
}