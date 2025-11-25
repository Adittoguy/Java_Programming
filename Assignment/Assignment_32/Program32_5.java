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
//  Date            :   25/11/2025
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(j == iCol || i == iRow || i == 1 || j ==1 || i == j)
                {
                    System.out.printf("%d\t", j);
                }
                else
                {
                    System.out.printf(" \t");
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

class Program32_4
{
    public static void main(String A[])
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
//  Output  :   1       2       3       4
//              1       2               4
//              1               3       4
//              1       2       3       4
//
////////////////////////////////////////////////////////////////////////