////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   PrintDivisibleBy2And3
//  Description     :   Used to check numbers divisible by 2 and 3
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   2/11/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void PrintDivisibleBy2And3(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 ==0)
            {
                System.out.print(iCnt+ "\t");
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program21_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintDivisibleBy2And3(30);
    }
}