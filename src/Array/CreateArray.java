/**
 * 
 */
package Array;

/**
*  @Description     创建数组
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月10日下午5:30:10
*/
public class CreateArray 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		int[] emptyArray;//定义了数组类型，没有内容，无法被访问
		//直接引用赋值
		int[] intArray = {1,2,3,4};//指定数组长度为4，分配内存
		//使用new初始化数组
		char charArray[] = new char[]{'眼','前','人','已','非','彼','时','人'};
		//使用new初始化数组，然后给数组赋值
		String stringArray[] = new String[4];
		stringArray[0] = "孙";
		stringArray[1] = "1";
		stringArray[2] = "2";
		stringArray[3] = "3";
		
		for (int i = 0; i < intArray.length; i++) 
		{
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		for (char c : charArray) 
		{
			System.out.print(c);
		}
		System.out.println();
		for (String e : stringArray) 
		{
			System.out.print(e + " ");
		}
		System.out.println("\n");
		
		//使用new初始化数组，引用赋值
		char charARRAY[] = new char[] {'1','2','3','4'};
		char anotherARRAY[] = charARRAY;
		boolean flag = (anotherARRAY == charARRAY);
		System.out.println("两个数组的引用地址相同吗？：" + flag);
	}
}
