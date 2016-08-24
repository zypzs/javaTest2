package 剑指Offer2;

public class 不用加减乘除做加法 {

	  public static int Add(int num1,int num2) {
	        int temp1,temp2;
	        while((num1 & num2) != 0){
	        	temp1 = num1 ^ num2;
	 	        temp2 = (num1 & num2) << 1;
	 	        num1 = temp1;
	 	        num2 = temp2;
	        }
	       return num1 ^ num2;
	    }
	  public static void main(String[] args) {
		System.out.println(Add(15,7));
	}
}
