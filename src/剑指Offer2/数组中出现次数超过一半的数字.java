package 剑指Offer2;

import java.util.Arrays;

public class 数组中出现次数超过一半的数字 {
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
