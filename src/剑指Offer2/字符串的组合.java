package ��ָOffer2;
import java.util.ArrayList;  
import java.util.List;  
public class �ַ�������� {  
    public static void combiantion(char chs[]){  
        if(chs==null||chs.length==0){  
            return ;  
        }  
        List<Character> list=new ArrayList();  
        for(int i=1;i<=chs.length;i++){  
            combine(chs,0,i,list);  
        }  
    }  
    //���ַ������е�begin���ַ���ʼ��ѡnumber���ַ�����list��  
    public static void combine(char []cs,int begin,int number,List<Character> list){  
        if(number==0){  
            System.out.println(list.toString());  
            return ;  
        }  
        if(begin==cs.length){  
            return;  
        }  
        list.add(cs[begin]);  
        combine(cs,begin+1,number-1,list);  
        list.remove((Character)cs[begin]);  
        combine(cs,begin+1,number,list);  
    }  
    public static void main(String args[]){  
        char chs[]={'a','b','c','d'};  
        combiantion(chs);  
    }  
}  
