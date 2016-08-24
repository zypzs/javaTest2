package wangyi;

public class Test2_1 {
	/*
	 * 比较重量：
	 * 利用图搜素的思路，先根据recodes数组建立有向连通图，然后利用dfs进行遍历
	 */
	public static int cmp(int g1,int g2,int [][]records,int n){
		int N = 0;
		for(int i=0;i<n;i++){
			N = N > records[i][0] ? N : records[i][0];
		    N = N > records[i][1] ? N : records[i][1];
		}
		N++;
		int [][]map = new int[N][N];
		for(int i=0;i<records.length;i++)
				map[records[i][0]][records[i][1]] = 1;
		
		boolean []isVisited = new boolean[N];
		
		if(dfs(g1,g2,map,isVisited))
			return 1;
		
		for(boolean flag : isVisited){
			flag = false;
		}
		
		if(dfs(g2,g1,map,isVisited))
			return -1;
		
		return 0;
	}

	private static boolean dfs(int g1, int g2, int[][] map, boolean[] isVisited) {
		isVisited[g1] = true;
		if(map[g1][g2] == 1){
			return true;
		}else{
			for(int i=0;i<map.length;i++){
				if(map[g1][i] == 1 && !isVisited[i]){
					if(dfs(i,g2,map,isVisited))
						return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int g1 = 3, g2 = 2, n = 4;
		int [][]recodes = {{1,2},{2,4},{1,3},{4,3}};
		System.out.println(cmp(g1,g2,recodes,n));
	}
}
