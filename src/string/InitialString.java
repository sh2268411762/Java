/**
 * 
 */
package string;

/**
*  @Description     初始化字符串
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月1日下午10:26:50
*/
public class InitialString 
{
	public static void main(String[] args) 
	{
		//1、直接通过字符串常量引用赋值
		String str = "孙豪无敌";      //引用赋值
		String name = str;         //引用赋值，将str地址赋给name
		String address1,address2;  //先声明变量类型，再引用赋值
		address1 = new String("123456");
		address2 = new String("123456");
		//打印
		System.out.println("str:     " + str);
		System.out.println("name     " + name);
		System.out.println("address1:" + address1);
		System.out.println("address2:" + address2);
		System.out.println("address1与address2是否相同：" + address1 == address2);//== 运算符判断的是内存地址是否相同
		System.out.println("address1与address2是否相同：" + address1.equals(address2));
		
		//2、构造方法初始化
		String str1 = new String();     //创建了一个空的字符串对象
		System.out.println("\n\n创建了一个空的字符串对象:" + str1);
		str1 = new String("孙豪男神");
		System.out.println("使用构造方法创建字符串对象：" + str1);
		str1 = String.valueOf(1);
		System.out.println("将整型数值1转换为字符串：" + str1);
		str1 = String.valueOf(Boolean.TRUE);
		System.out.println("将布尔数值true转换成字符串：" + str1 + "\n\n");
		
		//3、基本数据类型转换方法
		String str3 = String.valueOf('c');
		System.out.println("字符转换为字符串：" + str3);
		str3 = String.valueOf(22.12);
		System.out.println("double类型转换为字符串：" + str3);
		str3 = String.valueOf(str3);
		System.out.println("将对象转换为字符串：" + str3 + "\n\n");
		
		//4、字符数组初始化
		char[] charArray = {'u','i','孙','豪','最','帅'};
		String str4 = new String(charArray);
		System.out.println("用字符数组初始化字符串为：" + str4);
		String str5 = new String(charArray,2,4); //提取元素个数必须少于索引后剩余元素，否则会报错
		System.out.println("由字符数组索引2开始，提取4个元素初始化字符串为：" + str5);
		str5 = String.valueOf(charArray);
		System.out.println("由字符数组通过valueOf（）方法创建字符串为：" + str5);
		str5 = String.valueOf(charArray,2,4);
		System.out.println("由字符数组通过valueOf（）方法，从索引2开始，提取4个元素初始化字符串为：" + str5);
	}
}
