
import java.io.*;

class program76
{
    // Not A good programming practice :- IOException writing in front of main class
    
    public static void main(String A[]) throws IOException
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