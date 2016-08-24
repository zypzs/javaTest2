package chat;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.����socket���ӣ����ӳɹ��Զ�����
		Socket s=new Socket("localhost",10000);
		//2.����Ϣ
		PrintWriter pw=new PrintWriter(
				new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
		pw.println("hello");//��������ÿ���Ƕ�һ�У��������û�л��еĻ�������ζ����һ�����û�н���
	
		pw.flush();
		
		BufferedReader br=new BufferedReader(
				new InputStreamReader(s.getInputStream(),"UTF-8"));
		
		System.out.println("�������������"+br.readLine());
	}

}
