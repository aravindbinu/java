package module1;

import java.util.Scanner;

public class transposeofamatrix {

	public static void main(String[] args) {
		int i,j,p,q,m,n,k,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows and columns of matrix1");
		p=sc.nextInt();
		q=sc.nextInt();
		System.out.println("Enter the no of rows and columns of matrix2");
		m=sc.nextInt();
		n=sc.nextInt();
        
		int matrix1[][]=new int[p][q];
		int matrix2[][]=new int[m][n];
		int matrix3[][]=new int[p][n];
		System.out.println("Enter thelements in matrix1");
		for(i=0;i<p;i++)
		{ 
			for(j=0;j<q;j++)
			matrix1[i][j]=sc.nextInt();
		}
		
		System.out.println("Enter thelements in matrix2");
		for(i=0;i<m;i++)
		{ 
			for(j=0;j<n;j++)
			matrix2[i][j]=sc.nextInt();
		}
		
		if(q!=m)
		{ 
			System.out.println("matrix multiplication is not possible");
		}
		else
		{
			System.out.println("resultant matrix");
			for(i=0;i<m;i++)
			{ 
				for(j=0;j<q;j++)

				{
				  matrix3[i][j]=0;
				  for( k=0;k<q;k++)
				  {
	                  sum = sum + matrix1[i][k]*matrix2[k][j];
	               }
	 
	               matrix3[i][j] = sum;
	               sum = 0;
	            }
	         }
	 
	         System.out.println("Product of the matrices:");
	 
	         for (i = 0; i < m; i++)
	         {
	            for (j = 0; j < q; j++)
	               System.out.print(matrix3[i][j]+"\t");
	 
	            System.out.print("\n");
		sc.close();
	}
	}	
}
}
