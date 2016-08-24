package NewCodeOffer;

import java.util.ArrayList;
import java.util.Stack;

import LinkTest.Node;

public class Solution {

	/*
	 *  二维数组中的查找
	 */
	private static boolean find(int[][] array, int target) {
		int row=0;
		int col=array[0].length-1;
		while(row<array.length && col>-1){
			if(array[row][col]==target){
				return true;
			}else if(array[row][col]>target){
				col--;
			}else{
				row++;
			}
		}
		return false;
	}
	
	public ArrayList<Integer> printListFromTailToHead(Node listNode) {
		Stack<Integer> stack = new Stack<>();
	    while (listNode != null) {
	        stack.push(listNode.data);
	        listNode = listNode.next;
	    }

	    /*
	     * 从尾到头打印列表
	     */
	    ArrayList<Integer> resultList = new ArrayList<>();
	    while (!stack.isEmpty()) {
	    	resultList.add(stack.pop());
	    }
	    return resultList;  
		}
	
	/*
	 * 空格替换
	 */
	public static String replaceSpace(StringBuffer str){
		if(str==null){
			return null;
		}
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				str.replace(i, i+1,"20%");
			}
		}
		String result=str.toString();
		return result;
	}
	
	/*
	 * 用两个栈实现队列
	 */

	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        while(!stack1.isEmpty()){
        	stack2.push(stack1.pop());
        }
        stack1.push(node);
        while(!stack2.isEmpty()){
        	stack1.push(stack2.pop());
        }
    }
    
    public int pop() {
    		return stack1.pop();  	   
    }
    
    
    /*
     * 旋转数组的最小值
     */
    public static int minNumberInRotateArray(int [] array) {
    	if(array.length==0){
    		return 0;
    	}
    	for (int i=0 ;i<array.length-1;i++) {
			if(array[i]>array[i+1]){
				return array[i+1];
			}
		}
    	return array[0];
    }
    /*
     * 旋转数组的最小值：二分查找
     */
    public int getMin(int []arr){
    	int low=0;
    	int high=arr.length-1;
    	int mid=0;
    	while(low<high){
    		if(low==high-1){
    			break;
    		}
    		if(arr[low] <arr[high]){
    			return arr[low];
    		}
    		mid=(low+high)/2;
    		if(arr[low]>arr[mid]){
    			high=mid;
    			continue;
    		}
    		if(arr[mid]>arr[high]){
    			low=mid;
    			continue;
    		}
    		while(low<mid){
    			if(arr[low]==arr[mid]){
    				low++;
    			}else if(arr[low]<arr[mid]){
    				return arr[low];
    			}else{
    				high=mid;
    				break;
    			}
    		}
    	}
    	return Math.min(arr[low],arr[high]);
    	}
    
    /*
     * 斐波那契数列
     */
    public static int Fibonacci(int n) {

    	if(n<1){
    		return 0;
    	}
    	if(n==1||n==2){
    		return 1;
    	}
    	int result=1,pre=1,temp=0;
    	for(int i=3;i<=n;i++){
    		temp=result;
    		result+=pre;
    		pre=temp;
    	}
    	return result;
    }
    
    /*
     * 变态跳台阶
     */
     public static int jumpFloorII(int n) {
        int result[]=new int[n+1];
        if(n==0){
        	return 0;
        }
        result[0]=1;
        result[1]=1;
        for(int i=2;i<=n;i++){
        	result[i]=0;
        	for(int j=0;j<i;j++){
        		result[i]+=result[j];
        	}
        }
        return result[n];
    }
     
     /*
      * 矩形覆盖:依然是斐波那契数列的变形
      */
     public static int rectCover(int n){
    	 if(n<1){
             return 1;
         }
         if(n==1 || n==2){
             return n;
         }
         int res=2;
         int pre=1;
         int tmp=0;
         for(int i=3;i<=n;i++){
             tmp=res;
             res=res+pre;
             pre=tmp;
         }
         return res;
     }
     
     /*
      * 二进制中1的个个数
      */
     public static int numberOf1(int n){
    	 /*
    	  * 常规解法
    	  */
    	/* int result=0;
    	 
    	 while(n!=0){
    			 result+=(n & 1);
    		 n>>>=1;
    	 }
    	 return result;*/
    	 
    	 /*
    	  * 特殊解法1
    	  */
    	 int res=0;
    	 while(n!=0){
    		 n &= (n-1);
    		 res++;
    	 }
    	 return res;
    	 
     }
     
     /*
      * 数值的整数次方
      */
     public static double power(double base, int n) {   	 
    	 if(n==0){
    		 return 1;
    	 }else if(n>0){
    		 return power1(base,n);
    	 }else{
    		 n=-n;
    		 return 1/power1(base,n);
    	 }
         
     }
     public static double power1(double base1,int n){
    	 double res=1,tmp=base1;
    	 while(n!=0){
			 if((n & 1)!=0){
				 res*=tmp;
			 }
			 tmp=tmp*tmp;
			 n>>=1;
		 }
		return res; 
     }
     /*
      * 调整数组顺序，使奇数在前偶数在后
      */
     public static void reOrderArray(int [] array) {
    	 Stack <Integer> stack1=new Stack<Integer>();
    	 Stack <Integer> stack2=new Stack<Integer>();
    	 for (int i=0;i<array.length;i++) {
			if(array[i]%2==0){
				stack1.push(array[i]);
			}else{
				stack2.push(array[i]);
			}
		}
    	 int i=array.length-1;
    	 while(!stack1.isEmpty()){
    		 array[i]=stack1.pop();
    		 i--;
    	 }
    	 while(!stack2.isEmpty()){
    		 array[i]=stack2.pop();
    		 i--;
    	 }       
     }
     
     /*
      * 打印链表的倒数第k个节点
      */
     public Node FindKthToTail(Node head,int k) {
         if(k<=0) return null;
         Node p1 = head;
         Node p2 = head;
         //p2向前移动k个节点
         for(int i=0;i<k-1;i++) {
             if(p2==null) return null;
             p2 = p2.next;
         }
         if(p2==null) return null;
         while(p2.next!=null) {
             p1=p1.next;
             p2=p2.next;
         }
         return p1;
 
    }
     
 
    	    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	        if(root2 == null)
    	            return false;
    	        boolean flg = false;
    	        if(root1.val == root2.val){
    	            flg = check(root1,root2);
    	        }
    	        if(!flg){
    	            flg = HasSubtree(root1.left,root2);
    	            if(!flg){
    	                flg = HasSubtree(root1.right,root2); 
    	            }
    	        }
    	        return flg;
    	        
    	    }
    	    
    	    private boolean check(TreeNode t1,TreeNode t2){
    	        if(t2 == null)
    	            return true;
    	        if(t1 == null && t2 != null)
    	            return false;
    	        if(t1.val != t2.val){
    	        	  return false;
    	           
    	        }
    	        return check(t1.left,t2.left) && check(t1.right,t2.right);
    	    }
    	   
    
    public static void main(String[] args) {
    	/*System.out.println(Integer.toBinaryString(-31));
    	System.out.println(Integer.toBinaryString(31));*/
//		System.out.println(numberOf1(31));
//    	System.out.println(power(3.1415,0));
    	int arr[]={2,3,4,5,6,7,8,9,10,15};
    	reOrderArray(arr);
    	for (int i=0;i< arr.length;i++) {
			System.out.print(arr[i]);
		}

	}
}
class TreeNode{
	int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
