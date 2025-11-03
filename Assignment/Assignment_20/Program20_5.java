////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FindSmallestDigit
//  Description     :   Used to Find smallest digit from given number
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   2/11/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void FindSmallestDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 9;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit < iMax)
            {
                iMax = iDigit;
            }

            iNo /= 10;
        }
        System.out.print("Smallest digit is " + iMax);
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program20_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindSmallestDigit(83429);
    }
}