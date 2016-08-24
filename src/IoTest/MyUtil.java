package IoTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 基于字节流实现的两种文件copy方式：
 * 
 * @author Administrator
 *
 */
public final class MyUtil {
    private MyUtil(){
    	throw new AssertionError();
    }
    public static void fileCopy(String source,String target) throws IOException{
    	InputStream in = new FileInputStream(source);
    	OutputStream out = new FileOutputStream(target);
    	byte []buffer = new byte[4096];
    	int bytesToread;
    	while((bytesToread = in.read(buffer)) != -1){
    		out.write(buffer, 0, bytesToread);
    	}
    }
    public static void fileCopyNio(String source,String target) throws IOException{
    	FileInputStream in = new FileInputStream(source);
    	FileOutputStream out = new FileOutputStream(target);
    	FileChannel inChannel = in.getChannel();
    	FileChannel outChannel = out.getChannel();
    	ByteBuffer buffer = ByteBuffer.allocate(4096);
    	while(inChannel.read(buffer) != -1){
    		buffer.flip();
    		outChannel.write(buffer);
    		buffer.clear();
    	}
    }
    
    public static void main(String[] args) {
    	String path1 = "a.txt";
    	String path2 = "d";
    	String path3 = "e";
    	try {
			fileCopy(path1,path2);
			fileCopyNio(path1,path3);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
