package ��ָOfferͨ���Ĵ���;

public class ��ά�����еĲ��� {

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
