import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   DisplayConvert
//  Description     :   Used to convert lowercase to uppercase and vice versa
//  Input           :   Character
//  Output          :   Character
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void DisplayConvert(char cValue)
    {
        if(cValue>= 'A' && cValue<='Z')
        {
            System.out.print((char)(cValue+32));
        }
        else if(cValue>='a' && cValue<='z')
        {
            System.out.print((char)(cValue-32));
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program3_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';
        System.out.print("Enter character: ");
        cValue = sobj.next().charAt(0);

        Demo dobj = new Demo();
        dobj.DisplayConvert(cValue);
    }
}