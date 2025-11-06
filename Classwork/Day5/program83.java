import java.util.Scanner;

class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        if(iNo < 0)                             // Updator
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum += iCnt;                   // internally works as iSum = iSum + iCnt;
            }
            if(iSum > iNo)
            {
                break;
            }
        }

        return(iSum == iNo);                    // change

    }
} // End of Number class

class program83
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;
        
        System.out.println("Enter number: ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        bRet = nobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+ " is perfect number");
        }
        else
        {
            System.out.println(iValue+ " is not a perfect number");
        }

        // Important
        sobj = null;
        nobj = null;

        System.gc();
    }
}