
import java.util.*;
public class Matrixtranspose {
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	int r,c,i,j;
	System.out.println("Enter the number of rows of matrix1: ");
    r=in.nextInt();
    System.out.println("Enter the number of columns of matrix1: ");
    c=in.nextInt();
    int a[][]=new int[r][c];
    for(i=0;i<r;i++)
    {
  	  for(j=0;j<c;j++)
  	  {
  		  System.out.println("enter the elements of  matrix");
  		  a[i][j]=in.nextInt();
  		  
  	  }
    }
    System.out.println("ORIGINAL MATRIX");
    for(i=0;i<r;i++)
    {
  	  for(j=0;j<c;j++)
  	  {
  		  System.out.print(a[i][j]+"\t");
  		  
  		  
  	  }
  	System.out.println();
    }
    System.out.println("TRANSPOSE MATRIX ");
    
    for(i=0;i<r;i++)
    {
  	  for(j=0;j<c;j++)
  	  {
  		  System.out.print(a[j][i]+"\t");
  		 
  		  
  	  }
  	  System.out.println();
    }
}
}
	


