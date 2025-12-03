////////////////////////////////////////////////////////////////////////
//
//  Required Import Files
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public void Display(String str)
    {   
        int iCnt = 0;

        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            System.out.println(str.charAt(iCnt));
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program244
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        // String sobj = '\0';

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();           // sobj is variable of string

        StringX strobj = new StringX();

        strobj.Display(sobj);

        scanobj.close();
        System.gc();
    }
}