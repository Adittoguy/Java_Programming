////////////////////////////////////////////////////////////////////////
//
//  Required Import Files
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Pattern
//  Description     :   Used to print the Pattern
//  Input           :   Integer, Integer
//  Output          :   Pattern
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   23/11/2025
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int iCnt = 0, jCnt = 0;

        for(iCnt = 1; iCnt <= iRow; iCnt++)
        {
            for(jCnt = 1; jCnt <= iCol; jCnt++)
            {
                if(iCnt == 1 || iCnt == iRow || jCnt == 1 || jCnt == iCol)
                {
                    System.out.printf("*\t");
                }
                else
                {
                    System.out.printf("@\t");
                }
            }
            System.out.printf("\n");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program30_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);

        pobj = null;
        sobj.close();

        System.gc();
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Test case handled by application
//
//  Input   :   iRow : 6    iCol : 5
// 
//  Output  :   *       *       *       *       *
//              *       @       @       @       *
//              *       @       @       @       *
//              *       @       @       @       *
//              *       @       @       @       *
//              *       *       *       *       *
//
////////////////////////////////////////////////////////////////////////