package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 多线程实现文件复制
 * @author Administrator
 *
 */
class MyThread extends Thread{
	private File src;
	private File desc;
	
	public MyThread(){
		
	}
	public void set(File src,File desc){
		this.src = src;
		this.desc = desc;
	}
	
	@Override
	public void run(){
		try{
			copyFile(src,desc);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	private void copyFile(File src, File desc) throws IOException {
		if(!desc.exists()){
			desc.createNewFile();
		}
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try{
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(desc);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			int b = -1;
			while((b = bis.read()) != -1){
				bos.write(b);
			}
		}finally{
			if(bis != null){
				bis.close();
			}
			if(bos != null){
				bos.flush();
				bos.close();
			}
		}
	}
}
public class ThreadTest {
	
	MyThread []threads = new MyThread[10];
	public int n = 0;
	public ThreadTest(){
		for(int i=0;i<threads.length;i++){
			threads[i] = new MyThread();
		}
	}
	
	public void copyDirectiory(File sourceDir,File targetDir) throws Exception{
		if(!targetDir.exists()){
			targetDir.mkdirs();
		}
		File []file = sourceDir.listFiles();
		for(int i=0;i<file.length;i++){
			if(file[i].isFile()){
				File targetFile = new File(targetDir.getAbsolutePath()
						+ File.separator + file[i].getName());
				MyThread t = threads[n++ % 10];
				t.set(file[i], targetFile);
				t.start();
				t.join();
				threads[n % 10] = new MyThread();
			}
			if(file[i].isDirectory()){
				String dir2 = targetDir.getAbsolutePath() + 
						File.separator + file[i].getName();
				copyDirectiory(file[i], new File(dir2));
			}
		}
	}
	public static void main(String[] args) throws Exception {
	    new ThreadTest().copyDirectiory(new File("D:\\其他\\入党材料"), new File("D:\\test"));
	}

}
