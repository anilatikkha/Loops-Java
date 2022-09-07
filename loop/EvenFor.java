package loop;
import java.util.Scanner;
public class EvenFor {
    public static void main(String[] args)
    { Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            if(i%2==0)
            {
                System.out.print(i+", ");
            }
        }
        sc.close();
    }
}
// learn how to exclude the extra character in the result.