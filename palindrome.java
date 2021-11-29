package module1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:  ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String revstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			revstr=ch+revstr;
		}
		if(str.equals(revstr))
			System.out.println("The String is a Paliendrome");
		else
			System.out.println("The String is not a Paliendrome");
		
		
	}
     
}
