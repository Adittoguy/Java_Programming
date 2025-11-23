////////////////////////////////////////////////////////////////////////
//
//  Required Import Files
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Pattern
//  Description     :   Used to print Pattern
//  Input           :   Integer, Integer
//  Output          :   Character
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   23/11/2025
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int iCnt = 0, jCnt = 0;
        char cCh = 'A';
        
        for(iCnt = 0; iCnt <= iRow; iCnt++)
        {
            cCh = 'A';
            for(jCnt = 0; jCnt < iCol; jCnt++)
            {
                System.out.printf("%c\t", cCh);
                cCh++;
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

class Program28_1
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
//  Input   :   iRow : 4    iCol : 4
// 
//  Output  :   A   B   C   D
//              A   B   C   D
//              A   B   C   D
//              A   B   C   D
//
////////////////////////////////////////////////////////////////////////