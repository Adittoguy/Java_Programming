////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   DisplayFactors
//  Description     :   Used to Display  factors of given number
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   2/11/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt ==0)
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

class Program21_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.DisplayFactors(12);
    }
}