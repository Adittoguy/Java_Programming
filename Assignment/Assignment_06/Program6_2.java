import java.util.*;

class Number
{
    public int iValue = 0;

    public Number()
    {
        System.out.println("constructor");
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number: ");
        iValue = sobj.nextInt();
    }

    public boolean CheckGreater()
    {
        if(iValue > 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void Display()
    {
        if(CheckGreater())
        {
            System.out.println("Greater");
        }
        else
        {
            System.out.println("Smaller");
        }
    }
}

class Program6_2
{
    public static void main(String A[])
    {
        Number nobj = new Number();
        nobj.Accept();
        nobj.Display();
    }
}