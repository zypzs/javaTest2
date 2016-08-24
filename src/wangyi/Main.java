package wangyi;
import java.util.*;
public class Main{
	public static void combiantion(int chs[],Set<Integer>set){  
        if(chs==null||chs.length==0){  
            return ;  
        }  
        List<Integer> list=new ArrayList<Integer>();  
        for(int i=1;i<=chs.length;i++){  
            combine(chs,0,i,list,set);  
        }  
    }  
    //从字符数组中第begin个字符开始挑选number个字符加入list中  
    public static void combine(int []cs,int begin,int number,List<Integer> list,Set<Integer>set){  
        if(number==0){  
        	int num = 0;
			for(int i : list){
				num += cs[i];
			}
			set.add(num);
			return ;
        }  
        if(begin==cs.length){  
            return;  
        }  
        list.add(begin);  
        combine(cs,begin+1,number-1,list,set);  
        list.remove(begin);  
        combine(cs,begin+1,number,list,set);  
    }  
//	private static void addString(HashSet<Integer> set, int[] str, int k,int len,List<Integer>list) {
//		if(list.size() == len){
//			int num = 0;
//			for(int i : list){
//				num += str[i];
//			}
//			set.add(num);
//			list.clear();
//			return ;
//		}
//			
//		for(int i = k;i<str.length;i++){
//			if(!list.contains(i)){
//				list.add(i);
//			}
//			addString(set,str,k+1,len,list);
//		}
//	}
	public static void process(int []arr,int i,int sum,HashSet<Integer>set){
		if(i == arr.length){
			set.add(sum);
			return;
		}
		process(arr,i+1,sum,set);
		process(arr,i+1,sum+arr[i],set);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		HashSet<Integer> set = new HashSet<Integer>();
		List<Integer>list = null;
		while(scan.hasNext()){
			n = scan.nextInt();
			int []arr = new int [n];
			for(int i=0;i<n;i++){
				arr[i] = scan.nextInt();
			}
			combiantion(arr,set);
//			
//			int res = 1;
//			while(set.contains(res)){
//				res++;
//			}
////			System.out.println(res);
//			process(arr,0,0,set);
			for(int i : set){
				System.out.print(i + " ");
			}
//			
		}
	}
}
