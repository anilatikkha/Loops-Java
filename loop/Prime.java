package loop;

public class Prime {
    public static void main(String[] args)
    {
        int n=8;
        boolean flag= true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag =false;
                break;
            }
        }   
        if(flag==true)
{
    System.out.println(n+ " is Prime");

}
            else
            {
                System.out.println(n+" is not a prime number.");
            }
        }
        
    }
