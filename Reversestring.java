import java.util.Scanner;
public class Reversestring {
	public static void main(String ag[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string to be reversed");
		String str=s1.nextLine();
		int len=str.length();
		System.out.println("REVERSED STRING \n");
		for(int i=len-1;i>=0;i--)
		{
		System.out.print(str.charAt(i));
		}
	}
	}


