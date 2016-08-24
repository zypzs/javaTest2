package 编程2016年真题练习;

import java.util.ArrayList;
import java.util.List;

public class Coder {
	 public String[] findCoder(String[] A, int n) {

		 List <HasCoder> list = new ArrayList<HasCoder> ();
		 for(int i =0 ;i<n;i++){
			 String s = A[i].toLowerCase();
			 int index = 0;
			 int num = 0;
			 while(s.indexOf("coder",index) != -1){
				 num ++;
				 index = s.indexOf("coder",index) + 5;
			 }
			 if(num != 0){
				 list.add(new HasCoder(A[i],num));
			 }
			
		 }
		 return  sortList(list);
	 }

	private String [] sortList(List<HasCoder> list) {
		String []res = new String[list.size()];
		boolean [] flag = new boolean[list.size()];
		int k = 0;
		for(int i=0;i<list.size();i++){
			int  max = Integer.MIN_VALUE;
			int index = 0;
			for(int j=0;j<list.size();j++){
				if(list.get(j).num > max && !flag[j]){
					max = list.get(j).num;
					index = j;
					
				}
			}
			flag[index] = true;
			res[k++] = list.get(index).str;
		}
		return res;
	}
	public static void main(String[] args) {
		 String []A = {"coder","dccoderrlcoderxxpicoderhcoderbiwcoderdcoderrcodermcoderdbvcodertrwvycoderimvcoderuswfccoderczecoderczncoderkfuehcoderocoderiuvccoderfwcodervdiycoderifqjcoder","vxroicoderdqcoderfvcodermtyrcoderlcoderwrygcoder","hcoderwzmjccoderamfmvcoderazmcoderhcodersnuccoderceocodermsmifcoderpwpcodertqbqcoderentbcoderxsgpkcoderrqrbcoderucoder"};
	      int n = 4;
	      Coder cod = new Coder();
	   System.out.println( cod.findCoder(A, n).toString());
	     
	}

}

class HasCoder{
	String str;
	int num;
	public HasCoder(String str,int num){
		this.str = str;
		this.num = num;
	}
	
}
