import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FactorDifference
//  Description     :   Used to Display difference between sum of factor and sum ofnon factors
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public int FactorDifference(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0;
        int iFacAdd = 0;
        int iNonFacAdd = 0;
        int iDiff = 0;

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt)==0)
            {
                iFacAdd = iFacAdd + iCnt;
            }
        }

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt)!= 0)
            {
                iNonFacAdd = iNonFacAdd + iCnt;
            }
        }

        iDiff = iFacAdd - iNonFacAdd;
        return iDiff;
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program4_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.print("Enter number: ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();
        iRet = dobj.FactorDifference(iValue);

        System.out.print(iRet);
    }
}