package day21._08_pipedStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//创建A线程--发送数据给B线程
class AThread extends Thread {
	private PipedOutputStream out = new PipedOutputStream();
	public PipedOutputStream getOut() {
		return out;
	}
	@Override
	public void run() {
		try {
			for(int i = 65;i < 65 + 26;i ++){
				out.write(i);
			}
			out.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
}
//创建B线程，接收A线程发送的数据
class BThread extends Thread{
	private PipedInputStream in = null;
	
	public BThread(AThread athread) throws Exception {
		in = new PipedInputStream(athread.getOut());
	}
	
	@Override
	public void run() {
		int len = -1;
		try {
			while((len = in.read()) != -1){
				System.out.println((char)len);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//管道流
public class PipedStreamDemo {
	public static void main(String[] args) throws Exception {
		AThread a = new AThread();
		BThread b = new BThread(a);
		a.start();
		b.start();
		
	}
}
