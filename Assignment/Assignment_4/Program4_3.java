import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   NonFactor
//  Description     :   Used to Display non factors of number
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void NonFactor(int iNo)
    {
        if(iNo <= 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0;

        for(iCnt = 1; iCnt<= iNo; iCnt++)
        {
            if((iNo % iCnt)!= 0)
            {
                System.out.print(iCnt + "\t");
            }
        } 
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program4_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.print("Enter number: ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.NonFactor(iValue);
    }
}