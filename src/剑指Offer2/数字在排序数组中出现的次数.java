package ��ָOffer2;

public class ���������������г��ֵĴ��� {
	public int GetNumberOfK(int [] array , int k) {
	       int res = 0;
	       char c = (char) (k + '0');
	       for(int a : array){
	    	   char []chars = String.valueOf(a).toCharArray();
	    	   for(int i =0;i<chars.length;i++){
	    		   if(chars[i] == c){
	    	    		  res ++;
	    	    	  }
	    	   }
	       }
	       return res;
	    }
}
