package module1;
import java.util.*;
public class freguency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:  ");
		String str=sc.nextLine();
		int[] freq = new int[str.length()];//ARRAY TO COUNT THE FREQUENCY
		char str1[] = str.toCharArray(); //CONVERT STRING TO A CHARACTER ARRAY
		for(int i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(int j = i+1; j <str.length(); j++) 
            {  
                if(str1[i] == str1[j])
                {  
                    freq[i]++;  
                      
                    //Set str1[j] to 0 to avoid printing visited character  
                    str1[j] = '0';
                }
            }
		}
		
		System.out.println("The Frequency of Characters are:");
		 for(int i = 0; i <freq.length; i++) 
	        {  
	            if(str1[i] != ' ' && str1[i] != '0')  
	                System.out.println(str1[i] + "--->" + freq[i]);  
	        }  

}
}	