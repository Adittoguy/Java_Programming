////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckPrime
//  Description     :   Used to check given number is prime or not
//  Input           :   Integer
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   31/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CheckPrime(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt)==0)
            {
                iCount++;
            }
        }

        if(iCount == 2)
        {
            System.out.print("It is Prime");
        }
        else 
        {
            System.out.print("It is not Prime");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program18_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(11);
    }
}