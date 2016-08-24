package 剑指Offer通过的代码;

public class 数值的整数次方 {
	 public double Power(double base, int n) {
	   	 if(n==0){
	    		 return 1;
	    	 }else if(n>0){
	    		 return power1(base,n);
	    	 }else{
	    		 n=-n;
	    		 return 1/power1(base,n);
	    	 }
	         
	     }
	     public  double power1(double base1,int n){
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
}
