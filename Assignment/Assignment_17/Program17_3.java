////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FindMax
//  Description     :   Used to print the max number among 2
//  Input           :   Integer
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   31/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void FindMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.print(iNo1 + " is bigger");
        }
        else
        {
            System.out.print(iNo2 + " is bigger");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program17_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindMax(20, 15);
    }
}