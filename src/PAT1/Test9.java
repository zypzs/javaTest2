package PAT1;

import java.util.Arrays;
import java.util.Scanner;

public class Test9 {

	/**
	 * PAT 数字黑洞
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int num=input.nextInt();
			operate(num);	
		}
	}
    public static String change(int min){
    	String min1="";
		if(min<1000){
			if(min<10)
				min1="000"+min;
			else if(min<100)
				min1="00"+min;
			else
				min1="0"+min;
		}else
			min1=String.valueOf(min);
		return min1;
    }
	private static void operate(int num) {
		int arr[]=new int[4];
		arr[0]=num/1000;
		arr[1]=(num%1000)/100;
		arr[2]=(num%100)/10;
		arr[3]=num%10;
		Arrays.sort(arr);
		int max=1000*arr[3]+100*arr[2]+10*arr[1]+arr[0];
		int min=1000*arr[0]+100*arr[1]+10*arr[2]+arr[3];
		int res=max-min;
		
		System.out.println(max+" - "+change(min)+" = "+change(res));
		if(res==6174||res==0){
			return;
		}else{
			operate(res);
		}		
	}
}

/**
 * 
 * 最快的解法
 * 
 */

/*import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static int STOP = 6174;
 
    static class Four {
        char a, b, c, d;
 
        public Four(char a, char b, char c, char d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
 
        public boolean equals(Four f) {
            if (a == f.a && b == f.b && c == f.c && d == f.d) return true;
            return false;
        }
 
        public Four reverse() {
            return new Four(d, c, b, a);
        }
 
        public int toInt() {
            return (a - '0') * 1000 + (b - '0') * 100 + (c - '0') * 10 + d - '0';
        }
 
        public String toString() {
            return "" + a + b + c + d;
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        if (Integer.parseInt(num) == STOP) return;
        char[] input = {'0', '0', '0', '0'};
        int size = 4 - num.length();
        for (char ch : String.valueOf(num).toCharArray()) {
            input[size++] = ch;
        }
        Arrays.sort(input);
        Four ascend = new Four(input[0], input[1], input[2], input[3]);
        Four descend = ascend.reverse();
        if (ascend.equals(descend)) {
            System.out.println(descend.toString() + " - " + ascend.toString() + " = " + "0000");
            return;
        }
        int tmp = descend.toInt() - ascend.toInt();
        while (tmp != STOP) {
            int num1 = descend.toInt(), num2 = ascend.toInt();
            tmp = num1 - num2;
            String res = tmp < 1000 ? "0" : "" + tmp;
            System.out.println(descend.toString() + " - " + ascend.toString() + " = " + res);
            input = res.toCharArray();
            Arrays.sort(input);
            ascend = new Four(input[0], input[1], input[2], input[3]);
            descend = ascend.reverse();
 
        }
    }
}*/
