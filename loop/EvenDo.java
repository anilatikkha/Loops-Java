package loop;
import java.util.*;
public class EvenDo {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the number: ");
         int n=sc.nextInt();
         sc.close();
         int i=1;
         do{
             if(i%2==0)
             {
                 System.out.print(i+", ");
             }
             i++;
         }while(i<=n);
    }
}
