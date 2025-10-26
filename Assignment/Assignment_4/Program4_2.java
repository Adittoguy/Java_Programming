import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   ReverseFactor
//  Description     :   Used to Display factors in reverse order
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void FactorReverse(int iNo)
    {
        if(iNo <= 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0;

        for(iCnt = (iNo/2); iCnt>=1; iCnt--)
        {
            if((iNo % iCnt)==0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program4_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.print("Enter number: ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.FactorReverse(iValue);
    }
}