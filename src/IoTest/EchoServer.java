package IoTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    private static final int ECHO_SERVER_PORT = 6789;

    public static void main(String[] args) {        
        try(ServerSocket server = new ServerSocket(ECHO_SERVER_PORT)) {
            System.out.println("�������Ѿ�����...");
            while(true) {
                Socket client = server.accept();
                new Thread(new ClientHandler(client)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {
        private Socket client;

        public ClientHandler(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {
            try(BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    PrintWriter pw = new PrintWriter(client.getOutputStream())) {
                String msg = br.readLine();
                System.out.println("�յ�" + client.getInetAddress() + "���͵�: " + msg);
                pw.println(msg);
                pw.flush();
            } catch(Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
/*����Ĵ���ʹ����Java 7��TWR�﷨�����ںܶ��ⲿ��Դ�඼��ӵ�ʵ����AutoCloseable�ӿڣ��������ص��ӿڣ���
��˿�������TWR�﷨��try������ʱ��ͨ���ص��ķ�ʽ�Զ������ⲿ��Դ���close()������������д�߳���finally����顣
���⣬����Ĵ�����һ����̬�ڲ���ʵ���̵߳Ĺ��ܣ�ʹ�ö��߳̿��Ա���һ���û�I/O�������������ж�Ӱ�������û��Է������ķ��ʣ�
�򵥵�˵����һ���û����������������������û���������
��Ȼ������Ĵ���ʹ���̳߳ؿ��Ի�ø��õ����ܣ���ΪƵ���Ĵ����������߳�����ɵĿ���Ҳ�ǲ��ɺ��ӵġ�*/