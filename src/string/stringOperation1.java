/**
 * 
 */
package string;

import java.util.Scanner;

import jdk.nashorn.api.tree.ForInLoopTree;

/**
*  @Description     可变更的字符串序列
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月4日下午10:31:18
*/
public class stringOperation1 
{
	public static String fun(String s1,String s2)
	{
		return s1 + s2;
	}
	@SuppressWarnings("resource")
	public static void main1(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = fun(str1,str2);
		System.out.println(str3);
	}
	public static void main(String[] args) 
	{
		//1、创建StringBuilder对象
		StringBuilder str1 = new StringBuilder();//空对象
		StringBuilder str2 = new StringBuilder(32);//创建初始容量为32的对象
		StringBuilder str3 = new StringBuilder("终是项羽斩了缘，你是依偎也是缘");//创建带初始值的对象
		StringBuilder str4 = new StringBuilder(str3);//创建包括入参字符序列的对象
		System.out.println("创建对象为：" + str1);
		System.out.println("创建对象为：" + str2);
		System.out.println("创建对象为：" + str3);
		System.out.println("创建对象为：" + str4);
		str2.append("添加boolean值：");
		str2.append(true);
		str2.append("\n");//添加换行
		str2.append("添加字符值：");
		str2.append('c');
		str2.append("\n");//添加换行
		str2.append("添加整型值：");
		str2.append(1111);
		str2.append("\n");//添加换行
		str2.append("添加浮点值：");
		str2.append(12.33f);
		str2.append("\n");//添加换行
		str2.append("添加StringBuilder对象值：");
		str2.append(new StringBuilder("别离"));
		System.out.println(str2 + "\n");
		//
		str3.insert(0,true);//索引0处添加true
		str3.insert(1, 1100);//索引1处添加整型
		str3.insert(11, "别离");//索引11处添加StringBuilder对象
		System.out.println(str3 + "\n");
		//如果delete入参数字相等，则不会产生任何操作
		System.out.println("删除前：" + str3);
		str3.delete(0, 8);
		str3.delete(3, 5);
		System.out.println("删除后：" + str3 + "\n");
		//
		System.out.println("StringBuilder对象中索引3位置的字符为：" + str3.charAt(3) + "\n");
		//
		System.out.println("空对象容量为：" + str1.capacity());
		str1.append("风吹北巷南街伤，花落南亭北国凉...........");
		System.out.println("添加内容后    ：" + str1.capacity() + "\n");
		//
		System.out.println("替换前：" + str1);
		str1.replace(15, str1.length(), "");
		System.out.println("替换后：" + str1 + "\n");
		//
		System.out.println("反转前：" + str1);
		str1.reverse();//反转序列
		System.out.println("反转后：" + str1 + "\n");
		//
		System.out.println(str4);
		System.out.println(str4.toString());
		System.out.println(String.valueOf(str4) + "\n");
		
		
		
		//StringBuffer类
		StringBuffer str5 = new StringBuffer("以归属于是的");
		str5.append("jisdh");
		System.out.println("创建StringBuffer对象" + str5);
		System.out.println("容量：" + str5.capacity());
		System.out.println("长度：" + str5.length());
		str5.replace(0, str5.length(), "Java学习");
		System.out.println("替换后：" + str5);
		str5.insert(6, "工程师");
		System.out.println("insert方法插入后：" + str5);
	}
}
