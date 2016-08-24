package 编程2016年真题练习;

public class LongestDistance {

	 public static int getDis(int[] A, int n) {
	        // write code here
	        int res = 0 ;
	        for(int i = 0;i < n-1;i++){
	            for(int j = i+1;j < n;j++){
	                if(A[j] - A[i] > res){
	                    res = A[j] - A[i];
	                }
	            }
	        }
	        return res;
	    }
	 public static void main(String[] args) {
		int []A = {5386,5384,11054,6345,5816,11757};
		int n = 6;
		System.out.println(getDis(A,n));
	}
}
