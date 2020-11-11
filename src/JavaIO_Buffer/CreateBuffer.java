/**
 * 
 */
package JavaIO_Buffer;

import java.io.*;
/**
*  @Description     BufferedInoutStream类和BufferedOutputStream类创建
*  					BufferedReader类和BufferedWriter类创建
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月24日下午11:05:11
*/
public class CreateBuffer
{
	public static void main(String[] args)
	{
		System.out.println("创建一个BufferInputStream类时，必须先指定一个InputStream类型的实例对象：");
		//BufferedInputStream(InputStream in); //创建一个默认缓存区为8192字节的输入流对象
		//BufferedInputStream(InputStream in,int size);  //创建一个指定缓存区的输入流对象，其中size为缓存区大小，单位为字节
		
		
		System.out.println("创建一个BufferOutputStream类时，必须先指定一个OutputStream类型的实例对象：");
		//BufferedOutputStream(OutputStream in); //创建一个默认缓存区为8192字节的输出流对象
		//BufferedOutputStream(OutputStream in,int size);  //创建一个指定缓存区的输出流对象，其中size为缓存区大小，单位为字节
		
		
		
		System.out.println("创建一个BufferedReader类时，首先需要实例化一个Reader对象：");
		//BufferedReader(Reader in);   //创建一个默认为8192字节的输入流对象
		//BufferedReader(Reader in,int size);  //创建一个指定缓存区的输入流对象，其中size为缓存区大小，单位为字节 
		
		
		System.out.println("创建一个BufferedWriter类时，首先需要实例化一个Writer对象：");
		//BufferedWriter(Writer out);   //创建一个默认为8192字节的输出流对象
		//BufferedWriter(Writer out,int size);  //创建一个指定缓存区的输出流对象，其中size为缓存区大小，单位为字节 
	}
}
