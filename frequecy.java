package module1;

import java.util.Scanner;

public class frequecy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c;
		int co=0;
		String str=new String();
		System.out.println("Enter the string:  ");
		 str=sc.nextLine();
		System.out.println("Enter thealphabet:  ");
		c=sc.next().charAt(0);
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			if(str.charAt(i)==c)
			{
				co=co+1;
			}
		}
		System.out.println("The Frequency of Character is  "+co);
	}

}
