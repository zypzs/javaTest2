package ��ָOfferͨ���Ĵ���;

public class ��������1�ĸ��� {
	 public int NumberOf1(int n) {

         int result=0;
    	 
    	 while(n!=0){
    	   result++;
    	   n = (n-1)&n;
    	 }
    	 return result;
    }
}
