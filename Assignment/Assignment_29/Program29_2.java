////////////////////////////////////////////////////////////////////////
//
//  Required Import Files
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Pattern
//  Description     :   Used to Print Pattern
//  Input           :   Integer, Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   23/11/2025
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
                if((i % 2)!= 0)
                {
                    System.out.print(j *2 +"\t");
                }
                else
                {
                    System.out.print((j * 2)-1 +"\t");
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

class Program29_2
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
//  Input   :   iRow : 4    iCol : 5
//
//  Output  :   2       4       6       8       10
//              1       3       5       7       9
//              2       4       6       8       10
//              1       3       5       7       9
//
////////////////////////////////////////////////////////////////////////