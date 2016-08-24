package ��Ϊ����;

import java.util.Scanner;

public class �ϳ��� {
 
    //�������� �������ÿ��λ����ߵ���������鳤�ȣ�ʱ�临�Ӷ�O(nlnn)
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
     
    //��������������ÿ��λ���ұߵ�����������鳤�ȣ�ʱ�临�Ӷ�O(nlnn)
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
            //���ÿ��λ�÷��Ϻϳ��Ӷ��εĳ��ȣ�����¼��ģ�ʱ�临�Ӷ�O��n��
            for(int i=0;i<n-1;i++){
                int k=left[i]+right[i+1];
                max=Math.max(max, k);
            }
             
            System.out.println(n-max);
        }
         
    }
 
}
