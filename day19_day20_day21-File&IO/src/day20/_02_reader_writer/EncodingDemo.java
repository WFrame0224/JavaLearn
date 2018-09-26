package day20._02_reader_writer;

import java.util.Arrays;

//编码和解码
public class EncodingDemo {
	public static void main(String[] args) throws Exception {
		String msg = "王非";
		//编码操作:String-->byte[]
		byte[] data = msg.getBytes("GBK");
		System.out.println(Arrays.toString(data));//[-51, -11, -73, -57]
		
		//解码操作：byte[]-->String
		String convert_msg = new String(data,"ISO-8859-1");//此时解码未按照编码方式来
		System.out.println(convert_msg);//输出乱码
		//对于中文来说，乱码：??·?
		//++++++++++++++++++++++++++++++++++++++++++++++++
		//解决方案：
		data = convert_msg.getBytes("ISO-8859-1");//先恢复为byte数组
		System.out.println(Arrays.toString(data));
		convert_msg = new String(data,"GBK");//再将该byte数组转为对应的解码方式
		System.out.println(convert_msg);
		//++++++++++++++++++++++++++++++++++++++++++++++++
		
	}
}
