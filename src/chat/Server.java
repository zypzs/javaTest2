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
 * �������ˣ�
 * 1.����ͻ��˵�����
 * 2.������ͻ���ͨ
 * 
 */
public class Server {
	Socket socket=new Socket();
	public Server() throws IOException{
		ServerSocket ss=new ServerSocket(10000);
		while(true){
			socket=ss.accept();
			//����һ���ͻ��˹����̣߳����������Socketͨ��
			System.out.println(socket);
		   new ClientTheread().start();
		}
		
	  
	}
	/**
	 * 
	 * �ڲ�����Ҫ��������пͻ���IO��ͨ
	 * ��ÿһ�����ӳɹ���socket�������
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
					System.out.println("�ͻ������"+str);
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
	//�������ϣ����ܿͻ��˵�Socket
	BlockingQueue<Socket> sockets=new LinkedBlockingQueue<Socket>();
	public static void main(String[] args) throws IOException {
		new Server();
	}

}
