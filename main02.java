
public class P08_Matrix_main2 {
	public static void main(String[] args) {
		
		int[][] A = new int[3][3];
		int[][] B = new int[3][3];
		int[][] result = new int[3][3];
		int i=1;
		
		for(int row=0; row<A.length;row++) {
			for(int col=0;col<A[0].length;col++) {
				A[row][col]=i;
				i++;
			}
		}
		
		for(int row=0; row<B.length;row++) {
			for(int col=0;col<B[0].length;col++) {
				if((row==0&&col==1)||(row==1&&col==0))
					B[row][col]=1;
				else if((row==0&&col==2)||(row==1&&col==1))
					B[row][col]=2;
				else
					B[row][col]=0;
			}
		}
		
		System.out.println("\nMatrix1 is ..");printmatrix(A);
		System.out.println("\nMatrix2 is ..");printmatrix(B);
		
		result = P08_Matrix.Transpose(A);
		System.out.println("\nTranspose is ..");printmatrix(result);
		
		result= P08_Matrix.Diagonal(A);
		System.out.println("\nDiagonal is ..");printmatrix(result);
	
		result= P08_Matrix.Identity();
		System.out.println("\nIdentity is ..");printmatrix(result);
		
		result= P08_Matrix.UpperTriangle(A);
		System.out.println("\nUpperTriangle is ..");printmatrix(result);
		
		result= P08_Matrix.LowerTriangle(A);
		System.out.println("\nLowerTriangle is ..");printmatrix(result);
		
		result= P08_Matrix.Addition(A,B);
		System.out.println("\nAddition is ..");printmatrix(result);
		
		result= P08_Matrix.Subtraction(A,B);
		System.out.println("\nSubtraction is ..");printmatrix(result);
		
		result= P08_Matrix.Multiplication(A,B);
		System.out.println("\nMultiplication is ..");printmatrix(result);
	}
	public static void printmatrix(int[][] M){
		for (int row=0; row<M.length; row++){
			for (int column=0; column<M[0].length; column++)
				System.out.print(M[row][column] + " ");
			System.out.println(" ");
		}
	}
}