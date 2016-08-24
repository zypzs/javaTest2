package NewCodeOffer;

public class Test2 {
	/*
	 * ¿Õ¸ñÌæ»»
	 */
	public static String replaceSpace(StringBuffer str){
		if(str==null){
			return null;
		}
		
		int num = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
               num++;
			}
		}
        int len = str.length() + num*2;
        char []chars = new char[len];
        int j = len-1;
        for(int i = str.length()-1;i>=0;i--){
        	if(str.charAt(i) != ' '){
                chars[j--] = str.charAt(i);		
        	}else{
        		chars[j--] = '0';
        		chars[j--] = '2';
        		chars[j--] = '%';
        	}
        }
		return new String(chars);
	}
	
	public static void main(String[] args) {
		Test2 test = new Test2();
		System.out.println(test.replaceSpace(new StringBuffer(" We Are Happy .")));
	}
}
