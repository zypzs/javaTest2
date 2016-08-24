package 程序员面试指南;

import java.util.ArrayList;
import java.util.List;

public class 矩阵的最小路径和 {
	public static int minPahtSum1(int [][]m){
		if(m == null || m.length == 0 || m[0] == null || m[0].length == 0){
			return 0;
		}
		int row = m.length;
		int col = m[0].length;
		int [][]dp = new int[row][col];
		dp[0][0] = m[0][0];
		for(int i=1;i<row;i++)
			dp[i][0] = dp[i-1][0] + m[i][0];
		for(int i=1;i<col;i++)
			dp[0][i] = dp[0][i-1] + m[0][i];
		for(int i=1;i<row;i++)
			for(int j=1;j<col;j++){
				int x = dp[i-1][j] > dp[i][j-1] ? i : i-1;
				int y = dp[i-1][j] > dp[i][j-1] ? j-1 : j;
				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + m[i][j];
			}
		return dp[row-1][col-1];
	}

	public static void main(String[] args) {
		int [][]m = {{1,2,3,4},{4,3,2,1},{5,6,7,8}};
		System.out.println(minPahtSum1(m));
	}
}
