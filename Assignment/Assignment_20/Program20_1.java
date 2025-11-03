////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   SumEvenNumbers
//  Description     :   Used to calculate sum of even numbers till N
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   2/11/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void SumEvenNumbers(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt  = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 ==0)
            {
                iSum = iSum + iCnt;
            }
        }
        System.out.print(iSum);
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program20_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenNumbers(10);
    }
}