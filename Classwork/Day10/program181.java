/*
    iRow : 4
    iCol : 4

    a   b   c   d
    a   b   c   d
    a   b   c   d
    a   b   c   d
*/

////////////////////////////////////////////////////////////////////////
//
//  Required Import Files
//
////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Description     :   Used to print pattern
//  Input           :   Integer
//  Output          :   Pattern
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   21/11/2025
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int iCnt = 0, jCnt = 0;
        char ch = '\0';

        for(iCnt = 1; iCnt <= iRow; iCnt++)
        {
            for(jCnt = 1, ch = 'a'; jCnt <= iCol; jCnt++, ch++)
            {
                System.out.printf("%c\t", ch);
            }
            System.out.println();
        }
    }
}// End of Class

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program181
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of Rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);

        pobj = null;
        sobj = null;

        System.gc();
    }
}// End of Main