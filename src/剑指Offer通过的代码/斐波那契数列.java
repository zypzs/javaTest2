package ��ָOfferͨ���Ĵ���;

public class 쳲��������� {
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
	public static void main(String[] args) {
		System.out.println(Fibonacci(16));
		System.out.println(Fibonacci(17));
	}
}
