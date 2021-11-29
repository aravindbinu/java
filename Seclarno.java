import java.util.*;
public class Seclarno {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		int l,i;
        System.out.println("Enter the length of array");
        l=s1.nextInt();
        int a[]=new int[l];
        for(i=0;i<l;i++)
        {
        	System.out.println("Enter the elements");
        	a[i]=s1.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Second largest element="+a[l-2]);
	}

}
	


