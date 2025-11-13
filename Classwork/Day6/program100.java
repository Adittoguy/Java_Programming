import java.util.*;

class ArrayX
{
    public void Display(int Brr[])
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }
}

class program100
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iSize = 0;

        System.out.println("Enter the Number of elements: ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements: ");

        int i = 0;
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

        // Important

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}