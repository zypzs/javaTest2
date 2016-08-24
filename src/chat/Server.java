package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * 服务器端：
 * 1.负责客户端的连接
 * 2.负责跟客户沟通
 * 
 */
public class Server {
	Socket socket=new Socket();
	public Server() throws IOException{
		ServerSocket ss=new ServerSocket(10000);
		while(true){
			socket=ss.accept();
			//开辟一个客户端管理线程，负责和所有Socket通信
			System.out.println(socket);
		   new ClientTheread().start();
		}
		
	  
	}
	/**
	 * 
	 * 内部类主要负责和所有客户端IO沟通
	 * 将每一个连接成功的socket加入队列
	 *
	 */
	class ClientTheread extends Thread{
		public ClientTheread(){
			sockets.add(socket);

		}
		@Override
		public void run(){
			try {
				BufferedReader br=new BufferedReader(
						new InputStreamReader(socket.getInputStream(),"UTF-8"));
				String str="";
				PrintWriter pw=new PrintWriter(
						new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
				str=br.readLine();
			//	while((str=br.readLine())!=null){
					System.out.println("客户端输出"+str);
					for(int i=0;i<sockets.size();i++){     
						pw.println(str);
						pw.flush();
					}
				//}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	//建立集合，接受客户端的Socket
	BlockingQueue<Socket> sockets=new LinkedBlockingQueue<Socket>();
	public static void main(String[] args) throws IOException {
		new Server();
	}

}
