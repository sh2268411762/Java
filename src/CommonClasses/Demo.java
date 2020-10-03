/**
 * 
 */
package CommonClasses;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
*  @Description     高精度数字类（这两个类并没有对应的基本类型，它们都是以String字符串的形式进行保存和传入）
*  					Number数字类是一个抽象类，它是所有数值型包装类的父类（Byte、Integer、Short、Long、Float、Double）
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月3日下午1:15:44
*/
public class Demo<T> extends Number
{


	public int intValue(T num)
	{
		int n = (int)num;
		return n;
	}

	public long longValue(T num)
	{
		long n = (long)num;
		return n;
	}

	public float floatValue(T num)
	{
		float n = (float)num;
		return n;
	}

	public double doubleValue(T num)
	{
		double n = (double)num;
		return n;
	}

	public byte byteValue(T num)
	{
		byte n = (byte)num;
		return n;
	}
	
	public short shortValue(T num)
	{
		short n = (short)num;
		return n;
	}

	@Override
	public int intValue()
	{
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public long longValue()
	{
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public float floatValue()
	{
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public double doubleValue()
	{
		// TODO 自动生成的方法存根
		return 0;
	}
	
	public static void main(String[] args)
	{
		BigInteger bigInteger = new BigInteger("1010");
		System.out.println("创建一个Biginteger对象：" + bigInteger.toString());
		bigInteger.add(new BigInteger("101"));
		System.out.println("BigInteger对象加上101结果为：" + bigInteger.toString());
		bigInteger = bigInteger.add(new BigInteger("101"));
		System.out.println("BigInteger对象加上101结果为：" + bigInteger.toString());
		
		BigDecimal bigDecimal = new BigDecimal("3.1415926");
		System.out.println("创建BigDecimal对象：" + bigDecimal.toString());
		System.out.println("BigDecimal对象精度为：" + bigDecimal.precision());
		
		int a = 1000;
	}
}
