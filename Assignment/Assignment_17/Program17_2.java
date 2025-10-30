////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckPalindrom
//  Description     :   Used to check given number is palindrom or not
//  Input           :   Integer
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   31/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CheckPalindrom(int iNo)
    {
        int iTemp = iNo;
        int iDigit = 0;
        int iRev = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo /= 10;
        }
        System.out.println(iTemp);
        System.out.println(iRev);

        if(iRev == iTemp || iRev == -iTemp)
        {
            System.out.print("This is palindrom");
        }
        else
        {
            System.out.print("This is not palindrom");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program17_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPalindrom(121);
    }
}