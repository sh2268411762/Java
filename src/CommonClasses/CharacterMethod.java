/**
 * 
 */
package CommonClasses;

/**
*  @Description     Character常用方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月3日下午12:52:45
*/
public class CharacterMethod
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Character c1 = new Character('c');
		Character c2 = new Character('c');
		Character c3 = new Character('b');
		Character c8 = new Character('d');
		char c4 = new Character('c');
		char c5 = new Character('c');
		char c6 = new Character('b');
		char c7 = new Character('d');

		System.out.println("比较此对象与指定对象值是否相等：" + c1.equals(c2) + " " + c1.equals(c3) + " " + c1.equals(c1));
		System.out.println("（静态方法）比较两个char对象：" + Character.compare(c4, c5) + " " + Character.compare(c4, c6) + " "
				+ Character.compare(c4, c7));
		System.out.println("比较两个Character对象：" + c1.compareTo(c2) + " " + c1.compareTo(c3) + " " + c1.compareTo(c8));
		System.out.println("（静态方法）返回指定char数值的Character对象：" + Character.valueOf(c4));
		System.out.println("返回该Character对象值的String：" + c1.toString());
		System.out.println("（静态方法）返回指定char数值的String对象：" + Character.toString(c7));
		System.out.println("返回该Character对象的char基本类型值：" + c1.charValue());
		System.out.println("（静态方法）判断入参字符是否小写：" + Character.isLowerCase(c7) + " " + Character.isLowerCase('A'));
		System.out.println("（静态方法）判断入参字符是否大写：" + Character.isUpperCase(c7) + " " + Character.isUpperCase('A'));
		System.out.println("（静态方法）判断入参字符是否为空格：" + Character.isWhitespace(' ') + Character.isWhitespace('\t')
				+ Character.isWhitespace(c7));
		System.out.println("（静态方法）将小写字符转换为大写：" + Character.toLowerCase('A'));
		System.out.println("（静态方法）将大写字符转换为小写：" + Character.toUpperCase(c7));
	}
}
