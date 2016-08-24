package ½£Ö¸Offer2;

import java.util.ArrayList;
public class ÆË¿ËÅÆË³Ðò {
    public boolean isContinuous(int [] numbers) {

        if(numbers.length != 5){
            return false;
        }
        ArrayList < Integer> list = new ArrayList <Integer> ();
        int min = 14,max = 0;
        for(int i : numbers){
            if(i != 0 && list.contains(i)){
                return false;
            }else{
                list.add(i);
                if(i > max){
                    max = i;
                }
                if(i < min && i != 0){
                    min = i;
                }
            }
        }
        if(list.size() != 5 || max - min >= 5){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
		ÆË¿ËÅÆË³Ðò s = new ÆË¿ËÅÆË³Ðò();
		int []num = {1,2,6,4,3};
		System.out.println(s.isContinuous(num));
	}
}
