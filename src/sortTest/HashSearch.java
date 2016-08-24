package sortTest;

public class HashSearch {
	private static void insertHash(int []hash,int hashLength,int data){
		int hashAddress = data % hashLength;
		while(hash[hashAddress] != 0){
			hashAddress = (++hashAddress) % hashLength;
		}
		hash[hashAddress] = data;
	}
	
	private static int searchHash(int []hash,int hashLength,int key){
		int hashAddress = key % hashLength;
		while(hash[hashAddress] != 0 && hash[hashAddress] != key){
			hashAddress = (++hashAddress) % hashLength;
		}
		if(hash[hashAddress] == 0){
			return -1;
		}
		return hashAddress;
	}
	
	public static int hashSearch(int []arr,int key){
		int hashLength = 11;
		int []hash = new int[hashLength];
		for(int i=0;i<arr.length;i++){
			insertHash(hash,hashLength,arr[i]);
		}
		return searchHash(hash,hashLength,key);
	}
	public static void main(String[] args) {
		
		int []arr = {13,29,27,28,26,30,38};
		int key = 26;
		System.out.println( hashSearch(arr,key));
	}

}
