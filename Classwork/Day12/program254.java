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

        return new String(Arr);
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program254
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();         

        StringX strobj = new StringX();

        sobj = strobj.Update(sobj);                 //  Changed compared to previous file(not preferable coz loss of data)

        System.out.println("Updated String : "+sobj);

        scanobj.close();
        System.gc();
    }
}