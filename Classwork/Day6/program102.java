import java.util.*;

class ArrayX
{
    public void Display(int Brr[])
    {
        int iCnt = 0;
        System.out.println("Elements of the array are: ");
        
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }

    public int CountEven(int Brr[])
    {
        int i = 0, iCount = 0;
        for(i = 0; i < Brr.length; i++)
        {
            if((Brr[i] % 2)==0)
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int Summation(int Brr[])
    {
        int i = 0, iSum = 0;

        for(i = 0; i < Brr.length; i++)
        {
            iSum += Brr[i]; 
        }

        return iSum;
    }
}

class program102
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iSize = 0;
        int iRet = 0;
        int i = 0;

        System.out.println("Enter the Number of elements: ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements: ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);
        iRet = aobj.Summation(Arr);

        System.out.println("Sum of elements is: " +iRet);

        // Important

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}