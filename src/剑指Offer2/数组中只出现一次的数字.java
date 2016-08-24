package 剑指Offer2;

public class 数组中只出现一次的数字 {
	 public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
         if (array == null || array.length < 2)
            return;
        int temp = 0;
        for (int item : array)
            temp ^= item;
        int firstIndex = findFirstIndex(temp);
        num1[0]=0;
        num2[0]=0;
        for(int i:array){
            if(isBit1(i,firstIndex))
                num1[0]^=i;
            else
                num2[0]^=i;
        }
 
    }
 
    // 二进制数 从右往左 找到第一个 "1"
    public int findFirstIndex(int n) {
        int index = 0;
        while ((1 & n) == 0 && index < 32) {
            n = n >> 1;
            index++;
        }
        return index;
    }
    //判断这个数的二进制形式从左到右index位是否为"1"
    public boolean isBit1(int num, int index) {
        boolean check = false;
        num = num >> index;
        if ((num & 1) == 1)
            check = true;
        return check;
 
    }
}
