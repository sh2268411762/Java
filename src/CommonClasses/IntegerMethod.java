/**
 * 
 */
package CommonClasses;

/**
*  @Description     Integer类常用方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午9:05:39
*/
public class IntegerMethod
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Integer i1 = new Integer(1000);
		Integer i2 = new Integer(1000);
		Integer i7 = new Integer(200);
		Integer i8 = new Integer(300);
		int i3 = new Integer(200);
		int i4 = new Integer(300);
		int i5 = new Integer(1000);
		int i6 = new Integer(1000);

		System.out.println("比较此对象与指定对象是否值相同：" + i1.equals(i2) + "\t" + i1.equals(i4));
		System.out.println("（静态方法）：比较数值——>相等为0，大于为1，小于为-1：" + Integer.compare(i5, i6) + "\t" + Integer.compare(i4, i3)
				+ "\t" + Integer.compare(i3, i4));
		System.out.println("比较两个Integer对象：" + i1.compareTo(i2) + "\t" + i1.compareTo(i7) + "\t" + i7.compareTo(i1));
		System.out.println("（静态方法）返回指定int数值的Integer对象：" + Integer.valueOf(i3));
		System.out
				.println("（静态方法）将指定字符串解析成有符号的十进制整数基本类型：" + Integer.parseInt("-1000") + "\t" + Integer.parseInt("1000"));
		System.out.println("（静态方法）返回指定String数值的Integer对象：" + Integer.valueOf("-1000"));
		System.out.println("返回该Integer对象值的String对象：" + i8.toString());
		System.out.println("（静态方法）返回指定int数值的String对象：" + Integer.toString(i8));
		System.out.println("（静态方法）以二进制无符号整数形式返回String对象：" + Integer.toBinaryString(i8));
		System.out.println("（静态方法）以八进制无符号整数形式返回String对象：" + Integer.toOctalString(i8));
		System.out.println("（静态方法）以十六进制无符号整数形式返回String对象：" + Integer.toHexString(i8));
		System.out.println("（静态方法）返回指定int数值的正负符号：" + Integer.signum(i6) + "\t" + Integer.signum(-i6));
		System.out.println("以byte类型返回该Integer对象的值：" + i8.byteValue());
		System.out.println("以short类型返回该Integer对象的值：" + i8.shortValue());
		System.out.println("以int类型返回该Integer对象的值：" + i8.intValue());
		System.out.println("以long类型返回该Integer对象的值：" + i8.longValue());
		System.out.println("以float类型返回该Integer对象的值：" + i8.floatValue());
		System.out.println("以double类型返回该Integer对象的值：" + i8.doubleValue());
		System.out.println("（静态方法）返回两个int数值中的最大值，该方法调用了Math.max方法：" + Integer.max(i6, i5));
		System.out.println("（静态方法）返回两个int数值中的最小值，该方法调用了Math.min方法：" + Integer.min(i5, i6));
		System.out.println("（静态方法）返回int数值相加的结果：" + Integer.sum(i5, i6));
	}
}
