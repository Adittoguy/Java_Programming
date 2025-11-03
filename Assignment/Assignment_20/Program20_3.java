////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckPerfect
//  Description     :   Used to check the given number is perfect or not
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   2/11/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt  = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt==0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            System.out.print(iNo+ " is a perfect number");
        }
        else
        {
            System.out.print(iNo+ " is not a perfect number");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program20_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPerfect(6);
    }
}