/**
 * 
 */
package CommonClasses;

/**
*  @Description     装箱与拆箱及自动装箱的一个缺陷
*  					Java会缓存-128~127的数值，在范围内会服用这个对象（内存分配的是同一个地址）
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午8:33:53
*/
public class BoxingAndUnBoxing
{
	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args)
	{
		Integer x = new Integer(10); // 手动装箱
		Integer y = 10; // 自动装箱

		int m = x.intValue(); // 手动拆箱
		int n = x; // 自动拆箱

		// 缺陷
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2); // i1和i2都指向同一个地址，所以为同一个对象
		System.out.println(i1.equals(i2));

		// Java会缓存-128~127的数值，超过了后Java会重新创建一个对象
		Integer i3 = 200;
		Integer i4 = 200;
		System.out.println(i3 == i4);       //false比较地址
		System.out.println(i3.equals(i4));  //true比较值
	}
}
