import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   MultiplyFactor
//  Description     :   Used to multiply all the factors 
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public int MultiplyFactor(int iNo)
    {
        if(iNo<=0)
        {
            iNo = -iNo;
        }

        int iCnt = 0;
        int iMulti = 1;

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt)==0)
            {
                iMulti = iMulti * iCnt;
            }
        }

        return iMulti;
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program4_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.print("Enter number: ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        iRet = dobj.MultiplyFactor(iValue);

        System.out.println(iRet);
    }
}