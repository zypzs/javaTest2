package 剑指Offer2;

import java.util.ArrayList;
import java.util.List;
public class 和为S的连续正数序列 {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        List <Integer> list = new ArrayList <Integer> ();
        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer> > ();
        
        getDivitor(list,sum);
        for(int n : list){
            if( (sum*2/n-n+1) % 2 == 0){
            	ArrayList<Integer> temp = new ArrayList<Integer>();
                int temp1 = (sum*2/n-n+1)/2;
                temp.add(temp1);
                for(int i=1;i<n;i++){
                    temp.add(++temp1);
                }
                res.add(temp);
            }
        }
        return res;
    }
    private void getDivitor(List <Integer> list,int sum){
        for(int i=(int)Math.sqrt(sum*2);i>=2;i--){
            if(sum*2 % i == 0){
                list.add(i);
            }
        }
    }
    public static void main(String[] args) {
		和为S的连续正数序列  S = new 和为S的连续正数序列 ();
		ArrayList<ArrayList<Integer>> list = S.FindContinuousSequence(100);
		for(List l : list){
			System.out.println(l.toString());
		}
	}
}