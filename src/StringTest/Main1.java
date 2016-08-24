package StringTest;

public class Main1 {
	public static void main(String[] args) {
		String s = "dafegsd";
		String s1 = "dafe" + "gsd";
		System.out.println(s == s1);
		final String  s2 = "dafe";
		final String  s3 = "gsd";
		String s4 = s2 + s3;
		System.out.println(s == s4);
	}

}
