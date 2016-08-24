package 剑指Offer通过的代码;

public class 替换空格 {
	/*
	 * 空格替换
	 */
	public  String replaceSpace(StringBuffer str){
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
}
