package 剑指Offer2;

public class 构建乘积数组 {
	public int[] multiply(int[] A) {
        int []res = new int [A.length];
        res[0] = A[0];
        for(int i=1;i<A.length;i++){
            res[i] = res[i-1] * A[i];
        }
        //temp记录第i项后的累积
        int temp = 1;
        for(int i = A.length-1;i>0;i--){
            res[i] = res[i-1] * temp;
            temp *= A[i];
        }
        res[0] = temp;
        return res;
    }
}
