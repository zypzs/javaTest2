package test;

public class CodeTest {
	 static int  value1 = 1;
	 int value2 = 0;
	 public void test(){
		 value1 ++;
		 value2 ++;
	 }
	 public static void main(String[] args) {
		 for(int i=0;i<10;i++){
			 CodeTest ct1 =  new CodeTest();
			 ct1.test();
			 System.out.println(ct1.value1 + " " + ct1.value2);
		 }
		
	}

}
