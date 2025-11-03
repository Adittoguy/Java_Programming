////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   ProductOfDigit
//  Description     :   Used to check product of digits
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   2/11/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void ProductOfDigit(int iNo)
    {
        int iDigit = 0;
        int iProduct = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iProduct = iProduct * iDigit;

            iNo /= 10;
        }
        System.out.print(iProduct);
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program21_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.ProductOfDigit(234);
    }
}