////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CalculateSum
//  Description     :   Used to calculate sum of N natural numbers
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   30/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CalculateSum(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum += iCnt;
        }
        System.out.println(iSum);
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program16_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj. CalculateSum(10);
    }
}