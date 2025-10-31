////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   DisplayGrades
//  Description     :   Used to Display Grades for obtained marks
//  Input           :   Integer
//  Output          :   Character
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   31/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void DisplayGrade(int iNo)
    {
        if(iNo <= 100 && iNo >= 91)
        {
            System.out.print("A");
        }
        else if(iNo <= 90 && iNo >= 81)
        {
            System.out.print("B");
        }
        else if(iNo <= 80 && iNo >= 71)
        {
            System.out.print("C");
        }
        else if(iNo <= 70 && iNo >= 61)
        {
            System.out.print("D");
        }
        else if(iNo <= 60 && iNo >= 51)
        {
            System.out.print("E");
        }
        else
        {
            System.out.print("F");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program19_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(82);
    }
}