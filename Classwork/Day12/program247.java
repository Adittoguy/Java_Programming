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

class program246
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();  

        char Arr[] = sobj.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}