import java.util.*;

class program293
{
    public static void main(String A[])
    {
        int Arr[] = {45, 21, 90, 54, 78};

        // This is foreach loop
        for(int No : Arr)                   // for-each loop, handy loop
        {
            System.out.println(No);
        }

        Arrays.sort(Arr);

        System.out.println("Array afer sorting: ");
        for(int No : Arr)                
        {
            System.out.println(No);
        }
    }
}