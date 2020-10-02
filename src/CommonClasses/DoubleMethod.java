/**
 * 
 */
package CommonClasses;

/**
*  @Description     Double类中的常用方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午9:59:46
*/
public class DoubleMethod
{
	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args)
	{
		Double i1 = new Double(1000.3);
		Double i2 = new Double(1000.3);
		Double i7 = new Double(200.2);
		Double i8 = new Double(300.2);
		double i3 = new Double(200.2);
		double i4 = new Double(300.3);
		double i5 = new Double(1000.3);
		double i6 = new Double(1000.3);
		
		System.out.println("比较此对象与指定对象是否值相同：" + i1.equals(i2) + "\t" + i1.equals(i4));
		System.out.println("（静态方法）：比较数值——>相等为0，大于为1，小于为-1：" + Double.compare(i5, i6) + "\t" + Double.compare(i4, i3)
				+ "\t" + Double.compare(i3, i4));
		System.out.println("比较两个Double对象：" + i1.compareTo(i2) + "\t" + i1.compareTo(i7) + "\t" + i7.compareTo(i1));
		System.out.println("（静态方法）返回指定double数值的Double对象：" + Double.valueOf(i3));
		System.out.println("（静态方法）将指定字符串解析成有符号的double基本类型：" + Double.parseDouble("234.909"));
		System.out.println("（静态方法）返回指定String数值的Double对象：" + Double.valueOf("234.909"));
		System.out.println("返回该Double对象值的String对象：" + i8.toString());
		System.out.println("（静态方法）返回指定double数值的String对象：" + Double.toString(i6));
		System.out.println("（静态方法）以十六进制字符串形式返回String对象：" + Double.toHexString(i4));
		System.out.println("返回该Double对象值是否非数字值（NaN）：" + i2.isNaN());
		System.out.println("返回该Double对象值在数值上是否无穷大：" + i2.isInfinite());
		System.out.println("以byte类型返回该Double对象的值：" + i2.byteValue());
		System.out.println("以short类型返回该Double对象的值：" + i2.shortValue());
		System.out.println("以int类型返回该Double对象的值：" + i2.intValue());
		System.out.println("以long类型返回该Double对象的值：" + i2.longValue());
		System.out.println("以float类型返回该Double对象的值：" + i2.floatValue());
		System.out.println("以double类型返回该Double对象的值：" + i2.doubleValue());
		System.out.println("（静态方法）返回两个double数值的最大值，该方法调用了Math.max方法：" + Double.max(i5, i4));
		System.out.println("（静态方法）返回两个double数值的最小值，该方法调用了Math.min方法：" + Double.min(i5, i4));
		System.out.println("（静态方法）返回两个double数值相加的结果：" + Double.sum(i5, i4));
	}
}
