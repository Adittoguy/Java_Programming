import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   SumNonFactors
//  Description     :   Used to Display sum of non factors of number
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public int SumNonFactors(int iNo)
    {
        int iCnt = 0;
        int iSumNonFac = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt)!= 0)
            {
                iSumNonFac = iSumNonFac + iCnt;
            }
        }

        return iSumNonFac;
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program4_4
{
    public static void  main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.print("Enter number: ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();
        iRet = dobj.SumNonFactors(iValue);

        System.out.println(iRet);
    }
}