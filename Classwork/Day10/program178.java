/*
    Input   :   8
    Output  :   z   y   x   w   v   u   t   s
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
//  Output          :   Character
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   21/11/2025
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'z';

        for(iCnt = 1; iCnt <= iNo; iCnt++, ch--)
        {
            System.out.printf("%c\t", ch);
        }
        System.out.println();
    }
}// End of Class

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program178
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Frequency: ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue);

        pobj = null;
        sobj = null;

        System.gc();
    }
}// End of Main