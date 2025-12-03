////////////////////////////////////////////////////////////////////////
//
//  Required Import Files
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program243
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        for(iCnt = 0; iCnt < str.length(); iCnt++)          // Iteration|| str.length gives size of string
        {
            System.out.println(str.charAt(iCnt));
        }

        sobj.close();
        System.gc();
    }
}