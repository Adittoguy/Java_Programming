////////////////////////////////////////////////////////////////////////
//
//  Required Import Files
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public String Update(String str)
    {   
        char Arr[] = str.toCharArray();

        Arr[0] = '_';

        return new String(Arr);     // Change this compared to previos file
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program253
{
    public static void main(String A[])
    {
        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();           // sobj is variable of string

        StringX strobj = new StringX();

        sRet = strobj.Update(sobj);

        System.out.println("Updated String : "+sRet);

        scanobj.close();
        System.gc();
    }
}