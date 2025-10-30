////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CountDigits
//  Description     :   Used to count digits of given number
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   30/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo /= 10;
        }
        System.out.print(iCount);
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program16_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountDigits(7865);
    }
}