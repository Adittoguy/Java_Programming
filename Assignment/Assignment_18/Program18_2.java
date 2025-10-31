////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   PrintEvenNumbers
//  Description     :   Used to check given number is even or not
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   31/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void PrintEvenNumbers(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2)==0)
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

class Program18_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintEvenNumbers(20);
    }
}