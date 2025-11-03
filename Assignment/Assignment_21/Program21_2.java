////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CountEvenOddRange
//  Description     :   Used to print even and odd numbers in range
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   2/11/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CountEvenOddRange(int iNo)
    {
        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {

            if(iCnt % 2 ==0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }
        System.out.print(iEven+ "\t");
        System.out.print(iOdd+ "\t");
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program21_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountEvenOddRange(50);
    }
}