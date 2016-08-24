package ½£Ö¸Offer2;

import java.util.*;

public class ×Ö·û´®µÄÅÅÁĞ {
	 public ArrayList<String> Permutation (String str){
	    	ArrayList <String> list = new ArrayList<String>();
	    	if(str == null || str.length() == 0){
	    		return list;
	    	}
	    	HashSet<String> set = new HashSet<String>();
	    	addString(set,str.toCharArray(),0);
	    	list.addAll(set);
	    	Collections.sort(list);
	    	
	    	return list;
	    }
		private void addString(HashSet<String> set, char[] str, int k) {

			if(k == str.length){
				set.add(new String(str));
				return ;
			}
			for(int i = k;i<str.length;i++){
				swap(str,i,k);
				addString(set,str,k+1);
				swap(str,i,k);
			}
		}
	    private static void swap(char[] arr, int k, int biggerIndex) {

			char temp = arr[k];
			arr[k] = arr[biggerIndex];
			arr[biggerIndex] = temp;
		}
}
