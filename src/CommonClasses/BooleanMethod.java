/**
 * 
 */
package CommonClasses;

/**
*  @Description     Boolean类常用方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午10:28:03
*/
public class BooleanMethod
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean(false);
		Boolean b3 = new Boolean(true);
		boolean b4 = true;
		boolean b5 = false;
		
		System.out.println("比较此对象与指定对象是否值相同：" + b1.equals(b2) + " " + b1.equals(b3)) ;
		System.out.println("（静态方法）比较数值——>相等为0，大于为1，小于为-1：" + Boolean.compare(b1, b2) + " " + Boolean.compare(b2, b1) + " " + Boolean.compare(b1, b3));
		System.out.println("比较两个Boolean对象：" + b1.compareTo(b2) + " " + b2.compareTo(b1) + " " + b1.compareTo(b3));
		System.out.println("（静态方法）返回指定boolean数值的Boolean对象：" + Boolean.valueOf(b5) + " " + Boolean.valueOf(b4));
		System.out.println("(静态方法）将指定字符串解析成boolean基本类型，不区分字母大小写：" + Boolean.parseBoolean("false") + " " + Boolean.parseBoolean("true"));
		System.out.println("（静态方法）返回指定String数值的Boolean对象：" + Boolean.valueOf("true") + " " + Boolean.valueOf("uuuuu"));
		System.out.println("返回该Boolean对象值的String对象：" + b1.toString());
		System.out.println("（静态方法）返回返回指定boolean数值的String对象：" + Boolean.toString(b4));
		System.out.println("返回该Boolean对象的boolean基本类型值：" + b1.booleanValue());
		System.out.println("返回两个布尔值的“与”运算结果：" + Boolean.logicalAnd(b4,b5));
		System.out.println("返回两个布尔值的“或”运算结果：" + Boolean.logicalOr(b4,b5));
		System.out.println("返回两个布尔值的“异或”运算结果：" + Boolean.logicalXor(b4,b5));
	}
}
