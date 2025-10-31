////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   SumEvenOddDigits
//  Description     :   Used to print sum of even digits and odd digits
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   31/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void SumEvenOddDigits(int iNo)
    {
        int iDigit = 0;
        int iEvensum = 0;
        int iOddSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if((iDigit % 2)==0)
            {
                iEvensum += iDigit;
            }
            else
            {
                iOddSum += iDigit;
            }

            iNo /= 10;
        }
        System.out.println(iEvensum+ " is sum of all even numbers");
        System.out.println(iOddSum+ " is sum of all odd nnumbers");
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program18_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddDigits(123456);
    }
}