package stackTest;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyStack1 ms=new MyStack1();
		int []arr={3,4,5,1,2,1,5};
		for (int i = 0; i < arr.length; i++) {
			ms.push(arr[i]);
		}
		System.out.println(ms.getMin());
	}

}
