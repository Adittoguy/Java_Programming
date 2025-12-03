////////////////////////////////////////////////////////////////////////
//
//  Required Import Files
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public int CountOccurance(String str)
    {   
        int iCnt = 0;
        int iCount = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 'a')
            {
                iCount++;
            }
        }
        return iCount;
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program249
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        // String sobj = '\0';
        int iRet = 0;

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();           // sobj is variable of string

        StringX strobj = new StringX();

        iRet = strobj.CountOccurance(sobj);

        System.out.println("Occurance count is : "+iRet);

        scanobj.close();
        System.gc();
    }
}