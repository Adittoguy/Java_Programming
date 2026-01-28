import java.util.Scanner;

class StringX
{
    boolean CheckAlpha(char ch)
    {
        boolean bFlag = false;

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            bFlag = true;
        }
        else
        {
            bFlag = false;
        }
        return bFlag;
    }
}

class Program33_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        boolean bRet = false;

        System.out.println("Enter the Character: ");
        String cValue = sobj.nextLine();

        StringX sxobj = new StringX();

        bRet = sxobj.CheckAlpha(cValue);

        if(bRet == true)
        {
            System.out.println("It is Character");
        }
        else
        {
            System.out.println("It is not Character");
        }

        sxobj = null;
        sobj.close();

        System.gc();
    }
}