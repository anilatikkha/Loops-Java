package loop;
import java.util.Scanner;
public class MenuDrivenDo 
{
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter either 1 or 0: ");
        int num=sc.nextInt();
            switch(num)
            {
                case 0:
                break;
                case 1: 
                System.out.print("Enter your marks: ");
                int marks= sc.nextInt();
                sc.close();
                do
                {
                if (marks >=90)
                {
                    System.out.print("This is good!");
                }           
                else if(marks>=60)
                {
                    System.out.print("This is also good!");
    
                }
                else if(marks>=0)
                {
                    System.out.print("This is good as well!");
    
                }
                break;
            }
                while(num>=1);
                break;

                default: System.out.print("Invalid Entry!");   
            }
    }
    
}
