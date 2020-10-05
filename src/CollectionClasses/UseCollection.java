/**
 * 
 */
package CollectionClasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
*  @Description     集合类Collection中iterator（）方法的使用
*  					一系列相同功能接口的共性接口
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月5日下午7:37:18
*/
public class UseCollection
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		Collection<String> c1 = new ArrayList<String>();
		c1.add("one");
		c1.add("two");
		Iterator iterator = c1.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
