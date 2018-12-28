package com.wyklovelf.gen01_116;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 非泛型类中	定义泛型方法
 * @author weiyikai
 *
 */
public class Method {
	public static <T extends List> void test(T t) {
		System.out.println(t);
		t.add("123"); 
	}
	
	public static <T>void main(String[] args) throws IOException {
		test(new ArrayList());
		
		File file = new File("E:\\a.txt");
		
		InputStream input = new FileInputStream(file);
		
//		int len;
//		
//		while((len = input.read()) != -1){
//			System.out.println(len);//读出来的 是ascii码
//		}
		
//		read() :  从输入流中读取数据的下一个字节，返回0到255范围内的int字节值。如果因为已经到达流末尾而没有可用的字节，则返回-1。在输入数据可用、检测到流末尾或者抛出异常前，此方法一直阻塞。
//
//		read(byte[] b) :  从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。以整数形式返回实际读取的字节数。在输入数据可用、检测到文件末尾或者抛出异常前，此方法一直阻塞。
//
//		如果 b 的长度为 0，则不读取任何字节并返回 0；否则，尝试读取至少一个字节。如果因为流位于文件末尾而没有可用的字节，则返回值 -1；否则，至少读取一个字节并将其存储在 b 中。
//
//		将读取的第一个字节存储在元素 b[0] 中，下一个存储在 b[1] 中，依次类推。读取的字节数最多等于b 的长度。设 k 为实际读取的字节数；这些字节将存储在 b[0] 到 b[k-1] 的元素中，不影响 b[k] 到b[b.length-1] 的元素。
//		
		int length;
		
		byte[] bytes = new byte[1024];
		
		System.out.println(input.read(bytes));
		
		while((length = input.read(bytes))!= -1) 
		{
			System.out.println(length);
			System.out.println(new String(bytes,0,length));
		}
		
		test1(input);
	}
	
	//释放资源
	public static <T extends Closeable>void test1(T... a){//T... <=> T[]
		for(T temp:a) {//若T类型的对象不为空则进行关闭
			if(null != temp) {
				try {
					temp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}
	}
}
