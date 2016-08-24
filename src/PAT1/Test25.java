package PAT1;

import java.util.Arrays;
import java.util.Scanner;
 
/*
 * PAT 插入和归并
 */
public class Test25 {
    static int[] num;
    static int[] num0;
    static int[] num1;
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        num = new int[100]; // 原数据
        num0 = new int[100]; // 处理后数据
        num1 = new int[100];
        while (input.hasNextInt()) {
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                num[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                num0[i] = input.nextInt();
            }
            num1 = Arrays.copyOf(num, num.length);
            if (Insert(n)) {
                System.out.printf("Insertion Sort\n");
                for (int i = 0; i < n; i++) {
                    if (i != n - 1)
                        System.out.printf("%d ", num1[i]);
                    else
                        System.out.printf("%d\n", num1[i]);
                }
            }
 
            else if (Merge(n)) {
                System.out.printf("Merge Sort\n");
                for (int i = 0; i < n; i++) {
                    if (i != n - 1)
                        System.out.printf("%d ", num1[i]);
                    else
                        System.out.printf("%d\n", num1[i]);
                }
            }
        }
    }
 
    // /插入排序
    static boolean Judge(int number) {
        for (int i = 0; i < number; i++)
            if (num1[i] != num0[i])
                return false;
        return true;
    }
 
    static boolean Insert(int number) {
        boolean flag = false;
        for (int i = 0; i < number; i++) {
            num1[i] = num[i];
        }
        for (int i = 0; i < number; i++) {
            int j;
            int temp = num1[i];
            for (j = i - 1; j >= 0; j--) {
                if (temp >= num1[j]) {
                    break;
                } else
                    num1[j + 1] = num1[j];
            }
            num1[j + 1] = temp;
            if (flag && !Judge(number))
                return true;
            if (Judge(number)) {
                flag = true;
            }
 
        }
        return flag;
    }
 
    // /归并排序
    static boolean Merge(int number) {
        int interval = 2;
        for (int i = 0; i < number; i++) {
            num1[i] = num[i];
        }
        int i;
        boolean flag = false;
        boolean sec = false;
        while (interval <= number) {
            // 每一轮排序
            for (i = 0; i < number; i += interval) {
                if (i + interval > number)// change
                {
                    break;
                }
                for (int j = i; j < i + interval; j++) {
                    int de = num1[j];
                    int k;
                    for (k = j - 1; k >= i; k--) {
                        if (de >= num1[k]) {
                            break;
                        } else
                            num1[k + 1] = num1[k];
                    }
                    num1[k + 1] = de;
                    if (Judge(number)) {
                        flag = true;
                    }
                }
            }
            // 剩下几个进行排序
            if (i + interval > number && i < number) {
                // i-=interval;
                // 进行插入排序
                for (int j = i; j < number; j++) {
                    int k;
                    int qe = num1[j];
                    for (k = j - 1; k >= i; k--) {
                        if (qe >= num1[k])
                            break;
                        else
                            num1[k + 1] = num1[k];
                    }
                    num1[k + 1] = qe;
                    if (Judge(number)) {
                        flag = true;
                    }
                }
 
            }
            // ~~~~~~
            if (sec && !Judge(number)) {
                return true;
            }
            if (flag)
                sec = true;
            interval *= 2;
        }
        // if(sec)
        // 最后一次总体排序
        for (int k = 0; k < number; k++) {
            int j;
            int te = num1[k];
            for (j = k - 1; j >= 0; j--) {
                if (te >= num1[j]) {
                    break;
                } else
                    num1[j + 1] = num1[j];
            }
            num1[j + 1] = te;
            if (flag && !Judge(number))
                return true;
            if (Judge(number)) {
                flag = true;
                return true;
            }
        }
        return false;
    }
}