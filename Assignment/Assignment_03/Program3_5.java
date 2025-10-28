import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckVowel
//  Description     :   Used to Check weather character is vowel or not
//  Input           :   Character
//  Output          :   String
//  Author          :   Aditya Bhaskar Sanap
//  Date            :   22/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public boolean CheckVowel(char cValue)
    {
        if(cValue == 'a' || cValue == 'e' || cValue == 'i' || cValue == 'o' || cValue == 'u' || cValue == 'A' || cValue == 'E' || cValue == 'I' || cValue == 'U' || cValue == 'O')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program3_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';
        boolean bRet = false;

        System.out.print("Enter Character: ");
        cValue = sobj.next().charAt(0);

        Demo dobj = new Demo();
        bRet = dobj.CheckVowel(cValue);

        if(bRet == true)
        {
            System.out.print("It is vowel");
        }
        else 
        {
            System.out.print("It is not vowel");
        }
    }
}