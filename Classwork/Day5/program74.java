// CheckedException

import java.io.*;

class program74
{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iNo = 0;
        
        System.out.println("Enter number: ");
        iNo = Integer.parseInt(bobj.readLine());

        int i = 0;

        for(i = 1; i <= (iNo/2); i++)
        {
            if((iNo % i) == 0)
            {
                System.out.println(i);
            }
        }
    }
}