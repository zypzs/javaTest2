package 剑指Offer通过的代码;

public class 旋转数组的最小数字 {
	public int minNumberInRotateArray(int [] array) {
	    if(array.length==0){
	    		return 0;
	    	}
	        
	    	int start = 0, end = array.length-1, mid = 0;
	        if(array[start] < array[end]){
	            return array[start];
	        }
	        	while(start < end){
	        		mid = (start + end)/2;
	                if(array[start] == array[end] && array[mid] == array[end]){
	                    int res = array[start];
	                    for(int i=start;i<=end;i++){
	                        if(array[i] < res)
	                            res = array[i];
	                    }
	                    return res;
	                }
	            	if(array[mid] >= array[start]){
	            		start = mid;
	            	}
	            	else if (array[mid] <= array[end]){
	            		end = mid;
	            	}
	                if(end-start == 1){
	                    break;
	                }
	        	}
	    	return array[end];
	    }
}
