package ��ָOffer2;

import java.util.Arrays;

public class �����г��ִ�������һ������� {
	public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0)
            return 0;
        Arrays.sort(array);
        int length = array.length;
        int temp = array[0];
        int num = 0;
        for(int x : array){
            if(temp == x){
                num++;
                if(num*2 > length){
                    return x;
                }
            }else{
                temp = x;
                num = 1;
            }
        }
        return 0;
    }
}
