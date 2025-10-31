////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   PrintOddNumbers
//  Description     :   Used to check given number is Odd or not
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   31/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void PrintOddNumbers(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2)!=0)
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

class Program18_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintOddNumbers(20);
    }
}