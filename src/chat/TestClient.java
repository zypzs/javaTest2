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
		//1.建立socket连接，连接成功自动挂载
		Socket s=new Socket("localhost",10000);
		//2.发消息
		PrintWriter pw=new PrintWriter(
				new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
		pw.println("hello");//服务器端每次是读一行，如果这里没有换行的话，就意味着这一行输出没有结束
	
		pw.flush();
		
		BufferedReader br=new BufferedReader(
				new InputStreamReader(s.getInputStream(),"UTF-8"));
		
		System.out.println("服务器端输出："+br.readLine());
	}

}
