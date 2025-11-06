import java.util.Scanner;

class Number
{
    public int CalculateFactorial(int iNo)
    {
        int iCnt = 0;
        int iFact = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        // Reversse loop

        // for(iCnt = iNo; iCnt >= 1; iCnt--)
        // {    
        //     iFact *= iCnt;                       
        // }

        // Forward loop

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact *= iCnt;
        }


        // iCnt = iNo;
        // while(iCnt >= 1)
        // {
        //     iFact *= iCnt;
        //     iCnt--;
        // }

        // while(iCnt <= 1)
        // {
        //     iFact *= iCnt;
        //     iCnt++;
        // }

        return(iFact);                    // change

    }
} // End of Number class

class program87
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;
        
        System.out.println("Enter number: ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        iRet = nobj.CalculateFactorial(iValue);

        System.out.println("Factorial is : "+iRet);

        // Important
        sobj = null;
        nobj = null;

        System.gc();
    }
}