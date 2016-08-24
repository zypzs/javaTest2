package tengxun;

import java.util.Scanner;
public class Test1 {
	/**
	 * 删除字符串中的某些字符，使得字符串成回文结构
	 * 思路：利用动态规划思想
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String str = input.nextLine();
			System.out.println(str.length() - LCS(str));
		}
	}

	private static int LCS(String str) {
		String reStr = new StringBuilder(str).reverse().toString();
		int len = str.length();
		int [][]dp = new int[len+1][len+1];
		for(int i=1; i<=len;i++){
			for(int j=1;j<=len;j++){
				if(str.charAt(i-1) == reStr.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1] + 1;
				}else{
					dp[i][j] = dp[i-1][j] >  dp[i][j-1] ? dp[i-1][j] : dp[i][j-1];
				}
			}
		}
		return dp[len][len];
	}

}
