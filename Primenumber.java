import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args)
    {
		Scanner s1=new Scanner(System.in);
       System.out.println("enter the number to check whether prime or not "); 
       int fact=0;
       int num=s1.nextInt();
      
       for(int i=2;i<num/2;i++)
       {
           if(num%i==0)
           {
           fact=1;
           break;
           }
       }
           if(fact==0)
           {
            System.out.println(num+" is a prime number");
           }
           else 
           {
System.out.println(num+" is not a prime number");
           }
    }
}