package loop;
import java.util.Scanner;
public class EvenWhile {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        sc.close();
        int i=1;
        while(i<=n)
        {
          if(i%2==0)
          {
              System.out.print(i+", ");
          }    
          i++;             
        }
      sc.close();
    } 
}
