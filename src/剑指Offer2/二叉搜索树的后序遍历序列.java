package ��ָOffer2;

public class �����������ĺ���������� {
	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0)
            return false;
        return isPost(sequence,0,sequence.length-1);
    }
    private boolean isPost(int []arr,int start,int end){
        if(start >= end)
            return true;
        int i = start;
        for(;i<end;i++){
            if(arr[i] > arr[end]){
                break;
            }
        }
        for(int j = i;j<end;j++){
            if(arr[j] < arr[end])
                return false;
        }
        return isPost(arr,start,i-1) && isPost(arr,i,end-1);
    }
}
