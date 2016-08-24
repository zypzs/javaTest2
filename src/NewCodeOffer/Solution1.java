package NewCodeOffer;

public class Solution1 {
	public static int [][]matrixPower(int [][] m,int p){
		int [][] res=new int[m.length][m[0].length];
		//先把res设为单位矩阵，相当于整数中的1
		for(int i=0;i<res.length;i++){
			res[i][i]=1;
		}
		int [][] tmp=m;
		for(;p!=0;p>>=1){
			if((p & 1)!=0){
				res=muliMatrix(res,tmp);
			}
			tmp=muliMatrix(tmp,tmp);
		}
		return res;
	}
    
	/*
	 * 两个矩阵相乘
	 */
	private static int[][] muliMatrix(int[][] m1, int[][] m2) {
		int [][] res=new int[m1.length][m2[0].length];
		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m2[0].length;j++){
				for(int k=0;k<m2.length;k++){
					res[i][j]+=m1[i][k] * m2[k][j];
				}
			}
		}
		return res;
	}
	public static int f3(int n){
		if(n<1){
			return 0;
		}
		if(n==1 || n==2){
			return 1;
		}
		int [][] base={{1,1},{1,0}};
		int [][] res=matrixPower(base,n-2);
		return res[0][0]+res[1][0];
	}
	
	public static void main(String[] args) {
		//System.out.println(f3(5));
		int m=1234;
		while(m!=0){
			System.out.println(m%2);
			m>>=1;
		}
	}

}
