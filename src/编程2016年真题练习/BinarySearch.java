package 编程2016年真题练习;

/**
 * 二分查找递归和非递归实现
 * 
 * @author Administrator
 *
 */
public class BinarySearch {
	    public int getPos(int[] A, int n, int val) {
	        int res = -1;
	        return getPos2(A,0,n-1,val);
	    }
	    public int getPos2(int []A , int start, int end, int val){
	        
	    	if(start > end){
	    		return -1;
	    	}
        	int mid = (start + end)/2;
        	if(val > A[mid]){
        		return getPos2(A,mid+1,end,val);
	            
	        }else if(val < A[mid]){
	        	return getPos2(A,start,mid-1,val);
	        }else{
	            while( mid >= 0 && A[mid] == val ){
	            	  mid -- ;
	            }
	            return  mid + 1 ;
	        }
        	
	    }
	    
	    public static int binarySearch(Integer[] srcArray, int des) {
	        int low = 0;
	        int high = srcArray.length - 1;
	     
	        while ((low <= high) && (low <= srcArray.length - 1)
	                && (high <= srcArray.length - 1)) {
	            int middle = (high + low) >> 1;
	            if (des == srcArray[middle]) {
	                return middle;
	            } else if (des < srcArray[middle]) {
	                high = middle - 1;
	            } else {
	                low = middle + 1;
	            }
	        }
	        return -1;
	    }
	    
	    
	    public static void main(String[] args) {
			BinarySearch bs = new BinarySearch();
			int []A = {9,13,21,31};
			int n = 4, val = 9;
			System.out.println(bs.getPos(A, n, val));
		}
}
