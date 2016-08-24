package 剑指Offer通过的代码;

public class 二进制中1的个数 {
	 public int NumberOf1(int n) {

         int result=0;
    	 
    	 while(n!=0){
    	   result++;
    	   n = (n-1)&n;
    	 }
    	 return result;
    }
}
