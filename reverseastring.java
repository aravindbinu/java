package module1;
import java.util.*;
public class reverseastring {

	public static void main(String[] args) {
	 
	 Scanner sc =new Scanner(System.in);
	 int i;
	 System.out.println("Enter the String");
	 while (true)
	 {
	 String str=sc.nextLine();
	 int l=str.length();
	 for( i=l-1;i>=0;i--)
	 {
	 System.out.print(str.charAt(i));
	 }
	 System.out.println();
	
	 sc.close(); 
	 }
	 
	}
}
