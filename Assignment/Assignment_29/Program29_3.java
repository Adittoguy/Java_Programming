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
//  Output          :   Pattern
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   23/11/2025
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char cCh = 'a';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, cCh = 'a'; j <= iCol; j++, cCh++)
            {
                if((i % 2)!= 0)
                {
                    System.out.print(cCh +"\t");
                }
                else
                {
                    System.out.print(j +"\t");
                }
            }
            System.out.println("");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program29_3
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
//  Input   :   iRow : 5    iCol : 5 
//
//  Output  :   a       b       c       d       e
//              1       2       3       4       5
//              a       b       c       d       e
//              1       2       3       4       5
//              a       b       c       d       e
//
////////////////////////////////////////////////////////////////////////
