package 剑指Offer通过的代码;

public class 二维数组中的查找 {

	public boolean Find(int [][] array,int target) {
	     
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
}
