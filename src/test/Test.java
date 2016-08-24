package test;

/*import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

public class Test{
	 public static int countBitDiff(int m, int n) {

		 int count=0;
		 int max=m>n?m:n;
		 while(true){
				 if(m%2!=n%2){
					 count++;
				 }		 
			 m>>=1;
			 n>>=1;
			 max>>=1;
			 if(max==0){
				 break;
			 }
			 System.out.print(m%2);
			 System.out.print(n%2+" ");
			 
		 }
		 int max=m^n;
		 while(max!=0){
			 if((max &1)!=0){
				 count++;
			 }
			 max>>=1;
		 }
		 return count;
	    }
	 public static void main(String[] args) {
//		System.out.println(countBitDiff(16807,282475249));
//		System.out.println(16807^282475249);
//		 Date time=new Date();
		 
//		 System.out.println(time.toString());
		 
//		 int a[]={1,2,3,4,5};
//		 int b[]={3,5,4,2,1};
//		 System.out.println(IsPopOrder(a,b));
		 int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		 int []res= printMatrix(arr,4,3);
		 for (int i : res) {
			System.out.print(i+" ");
		}
	}
	 
	 
	  * 栈的压入弹出顺序，
	  
	 public static boolean IsPopOrder(int [] pushA,int [] popA) {
		错误思路：因为压栈的过程可能不是一次性全部压入的
		 * 
		 int m = pushA.length;
		 int n = popA.length;
	      if(m == 0 || n == 0 || m != n){
	    	  return false;
	      }
	      int i = 0,j = 0,k;
	      while(pushA[i] != popA[j]){
	    	  i++;
	      }
	      for(k=i+1,j=1;k<m;k++){
	    	  if(pushA[k]!=popA[j]){
	    		  return false;
	    	  }
	    	  j++;
	      }
	      for(k=i-1;k>=0;k--,j++){
	    	  if(pushA[k]!=popA[j]){
	    		  return false;
	    	  }
	      }
		 return true;
		 
		 
		  * 正确思路
		  
		 Stack <Integer>stack = new Stack<Integer>();
	        if( pushA.length == 0 && popA.length == 0 ) return true;
	        for( int i=0,j=0; i < pushA.length; i++ ){
	            stack.push( pushA[i] );
	            while( ( !stack.empty() )&& ( stack.peek() == popA[j] ) ){
	                stack.pop();
	                j ++;
	            } 
	        }
	         
	        return stack.empty() == true;
	    }
	 //顺时针打印矩阵
	 public ArrayList<Integer> printMatrix(int [][] matrix) {
		 ArrayList<Integer> result = new ArrayList<Integer> ();
	        if(matrix.length==0) return result;
	        int n = matrix.length,m = matrix[0].length;
	        if(m==0) return result;
	        int layers = (Math.min(n,m)-1)/2+1;//这个是层数
	        for(int i=0;i<layers;i++){
	            for(int k = i;k<m-i;k++) result.add(matrix[i][k]);//左至右
	            for(int j=i+1;j<n-i;j++) result.add(matrix[j][m-i-1]);//右上至右下
	            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(matrix[n-i-1][k]);//右至左
	            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(matrix[j][i]);//左下至左上
	        }
	        return result; 
	    }
	 
	 public static int[] printMatrix(int[][] mat, int n, int m) {
	        // write code here
	        int res[]=new int[m*n];
	        int num=0;
	        boolean flg=true;
	        for(int i=0;i<n;i++){
	           if(flg){
	               for(int k=0;k<m;k++){
	                   res[num++]=mat[i][k];
	               }
	           } else{
	               for(int k=m-1;k>=0;k--){
	                   res[num++]=mat[i][k];
	               }
	           }
	            flg=!flg;
	        }
	        return res;
	    }

}*/
public class Test
{
    public static int aMethod(int i)throws Exception
    {
        try{
            return 10/i;
        }
        catch (Exception ex)
        {
            throw new Exception("exception in a Method");
        } finally{
            System.out.printf("finally");
        }
    }
 
    public static void main(String [] args)
    {
        try
        {
            aMethod(0);
        }
        catch (Exception ex)
        {
            System.out.printf("exception in main");
        }
        System.out.printf("finished");
    }
}
