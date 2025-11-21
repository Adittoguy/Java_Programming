/*
    iRow : 4
    iCol : 4

    a   b   c   d
    e   f   g   h
    i   j   k   l
    m   n   o   p
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
        char ch = 'a';

        for(iCnt = 1; iCnt <= iRow; iCnt++)
        {
            for(jCnt = 1; jCnt <= iCol; jCnt++)
            {
                System.out.printf("%c\t", ch);
                ch++;               // Important
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

class program179
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