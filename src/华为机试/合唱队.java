package 华为机试;

import java.util.Scanner;

public class 合唱队 {
 
    //从左向右 遍历求出每个位置左边的最长递增数组长度，时间复杂度O(nlnn)
    public static int[] leftArr(int a[],int n){
        int res[]=new int[n];
        int maxLen[]=new int[n];
        res[0]=1;
        maxLen[0]=a[0];
        int right=0;
        for(int i=1;i<n;i++){
            int l=0;
            int r=right;
            int k=a[i];
             
            while(l<=r){
                 
                int m=(l+r)/2;
                if(maxLen[m]>k) r=m-1;
                else if(maxLen[m]<k) l=m+1;
                else{
                    l=m;
                    break;
                }
                 
            }
            maxLen[l]=k;
            if(l>right) right=l;
            res[i]=right+1;
             
        }
         
         
        return res;
    }
     
    //从右向左遍历求出每个位置右边的最长递增子数组长度，时间复杂度O(nlnn)
    public static int[] rightArr(int[] a,int n){
        int res[]=new int[n];
        res[n-1]=1;
         
        int maxLen[]=new int[n];
        maxLen[0]=a[n-1];
        int right=0;
        for(int i=n-1;i>=0;i--){
            int l=0;
            int r=right;
            int k=a[i];
            while(l<=r){
                int m=(l+r)/2;
                if(maxLen[m]>k) r=m-1;
                else if(maxLen[m]<k) l=m+1;
                else{
                    l=m;
                    break;
                }
            }
             
            maxLen[l]=k;
            if(l>right) right=l;
            res[i]=right+1;
        }
         
         
        return res;
    }
     
    public static void main(String[] args) {
  
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int n=cin.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=cin.nextInt();
            }
             
            int left[]=leftArr(arr,n);
            int right[]=rightArr(arr,n);
             
            int max=0;
            //求出每个位置符合合唱队队形的长度，并记录最长的，时间复杂度O（n）
            for(int i=0;i<n-1;i++){
                int k=left[i]+right[i+1];
                max=Math.max(max, k);
            }
             
            System.out.println(n-max);
        }
         
    }
 
}
