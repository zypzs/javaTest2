package 华为机试;

import java.util.Scanner;
public class 密码验证 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			boolean []flag = {false,false,false,false};
			int num = 0; 
			String str = scan.nextLine();
			if(str.length() <= 8){
				System.out.println("NG");
			//	continue;
			}else{
				char []chars = str.toCharArray();
				for(int i=0;i<chars.length;i++){
					if(chars[i]>=48 && chars[i]<=57){
						flag[0] = true;
					}else if(chars[i]>=65 && chars[i]<=90){
						flag[1] = true;
					}else if(chars[i]>=97 && chars[i]<=122){
						flag[2] = true;
					}else{
						flag[3] = true;
					}
				}
				for(boolean b : flag){
					if(b){
						num++;
					}
				}
				
				boolean flag1 = false;
				 for(int i=0 ;i<str.length()-2 ;i++){
			            String substr1 =str.substring(i, i+3);
			            for (int j = i+1; j <str.length()-2; j++) {
			                if (str.substring(j).contains(substr1)){
			                	flag1 = true;
			                	break;
			            }
			        }
			    }
				 if(num < 3 || flag1 == true){
						System.out.println("NG");
						continue;
					}
				 System.out.println("OK");
			}
		}
	}

	 // 2.包括大小写字母.数字.其它符号,以上四种至少三种
    public static boolean checkCharKinds(String password){
        int Digit=0 , lowercase=0,uppercase=0,others=0;
        char[] ch = password.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='0'&&ch[i]<='9') {
                Digit=1;
                continue;
            }
            else if (ch[i]>='a'&&ch[i]<='z') {
                lowercase=1;
                continue;
            }
            else if (ch[i]>='A'&&ch[i]<='Z') {
                uppercase=1;
                continue;
            }else {
                others=1;
                continue;
            }
        }
        int total = Digit+lowercase+uppercase+others;
        return total>=3 ? true : false;
    }
     // 3.不能有相同长度超2的子串重复
	 public static boolean checkCharRepeat(String password){
	        for(int i=0 ;i<password.length()-2 ;i++){
	            String substr1 =password.substring(i, i+3);
	            for (int j = i+1; j <password.length()-2; j++) {
	                if (password.substring(j).contains(substr1))
	                    return false;
	            }
	        }
	        return true;
	    }
}
