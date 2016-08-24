package 剑指Offer2;

public class 把字符串转换成整数 {
	  public static int StrToInt(String str) {
	  
		  if(str == null || str.length() == 0){
			  return 0;
		  }
		  int res = 0;
		  boolean flg = false;
		  int temp1 = Integer.MAX_VALUE / 10;
		  int temp2 = Integer.MAX_VALUE % 10;
		  if(str.charAt(0) == '-'){
			  flg = true;
		  }else if(str.charAt(0) == '+'){
			  
		  }
		  else{
			  res = str.charAt(0)-'0';
		  }
		  int cur;
		  for(int i = 1;i < str.length();i++){
			  cur =  str.charAt(i) - '0';
			  if(cur > 9)
				  return 0;
			  if(res > temp1 || (!flg && res == temp1 && cur > temp2) 
					  || (flg && res == temp1 && cur > temp2 + 1)){
				  return 0;
			  }
			  res = (res * 10 + cur); 
		  }
		  return flg ? res * -1 : res;
	  }
	  public static void main(String[] args) {
//		System.out.println(Integer.MAX_VALUE / 10);
//		System.out.println(Integer.MAX_VALUE % 10);
//		System.out.println(Integer.MIN_VALUE / 10);
		System.out.println(Integer.MIN_VALUE % 10);
		  System.out.println(StrToInt("-2147483648"));
	}
}
