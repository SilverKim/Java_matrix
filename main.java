
public class P08_Matrix {
	
	public static int[][] Transpose(int[][] a) {
		int[][] x = new int[3][3];
		for(int row=0; row<a.length;row++) {
			for(int col=0;col<a.length;col++) {
				x[row][col]=a[col][row];
			}
		}
		return x;
	}

	public static int[][] Diagonal(int[][] a) {
		int[][] x = new int[3][3];
		for(int row=0; row<a.length;row++) {
			for(int col=0;col<a.length;col++) {
				if(row==col) 
					x[row][col]=a[row][col];
				else 
					x[row][col]=0;
			}
		}
		return x;
	}
	
	public static int[][] Identity() {
		int[][] x = new int[3][3];
		for(int row=0; row<x.length;row++) {
			for(int col=0;col<x.length;col++) {
				if(row==col) 
					x[row][col]=1;
				else 
					x[row][col]=0;
			}
		}
		return x;
	}

	public static int[][] UpperTriangle(int[][] a) {
		int[][] x = new int[3][3];
		for(int row=0; row<a.length;row++) {
			for(int col=0;col<a.length;col++) {
				if(row<=col) 
					x[row][col]=a[row][col];
				else 
					x[row][col]=0;
			}
		}
		return x;
	}

	public static int[][] LowerTriangle(int[][] a) {
		int[][] x = new int[3][3];
		for(int row=0; row<a.length;row++) {
			for(int col=0;col<a.length;col++) {
				if(row>=col) 
					x[row][col]=a[row][col];
				else 
					x[row][col]=0;
			}
		}
		return x;
	}

	public static int[][] Addition(int[][] a, int[][] b) {
		int[][] x = new int[3][3];
		if(a.length!=b.length)
			return null;
		for(int row=0; row<a.length;row++) {
			for(int col=0;col<a.length;col++) {
				x[row][col]=a[row][col]+b[row][col];
			}
		}
		return x;
	}

	public static int[][] Subtraction(int[][] a, int[][] b) {
		int[][] x = new int[3][3];
		if(a.length!=b.length)
			return null;
		for(int row=0; row<a.length;row++) {
			for(int col=0;col<a.length;col++) {
				if(a[row][col]>b[row][col])
					x[row][col]=a[row][col]-b[row][col];
			}
		}
		return x;
	}

	public static int[][] Multiplication(int[][] a, int[][] b) {
		int[][] x = new int[3][3];
		if(a.length!=b.length)
			return null;
		for(int row=0; row<a.length;row++) {
			for(int col=0;col<a.length;col++) {
				for(int i=0;i<3;i++)
					x[row][col]+=a[row][i]*b[i][col];
			}
		}
		return x;
	}
}
