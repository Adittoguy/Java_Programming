////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FindMin
//  Description     :   Used to print the min number among 3
//  Input           :   Integer
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   31/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void FindMin(int iNo1, int iNo2, int iNo3)
    {
        if(iNo1 < iNo2)
        {
            if(iNo1 < iNo3)
            {
                System.out.print(iNo1 + " is smallest");
            }
            else 
            {
                System.out.print(iNo3 + " is smallest");
            }
        }
        else 
        {
            if(iNo2 < iNo3)
            {
                System.out.print(iNo2 + " is smallest");
            }
            else
            {
                System.out.print(iNo3 + " is smallest");
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program17_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindMin(3, 7 ,2);
    }
}