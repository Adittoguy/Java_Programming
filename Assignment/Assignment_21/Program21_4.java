////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CountFactors
//  Description     :   Used to count the factors of given number
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   2/11/2025
//
////////////////////////////////////////////////////////////////////////


class Logic
{
    public void CountFactors(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt ==0)
            {
                iCount++;
            }
        }
        System.out.print(iCount);
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program21_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountFactors(20);
    }
}