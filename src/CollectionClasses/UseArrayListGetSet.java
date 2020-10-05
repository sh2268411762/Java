/**
 * 
 */
package CollectionClasses;

import java.util.*;

/**
*  @Description     ArrayList可以使用get()和set()方法类对指定索引获取、设置特定元素
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月5日下午9:43:44
*/
public class UseArrayListGetSet
{
	public static void main(String[] args)
	{
		List<Integer>list = new ArrayList<Integer>();
		list.add(3);
		list.add(1,4);
		list.add(2,8);
		list.add(3,88);
		list.add(4,9);
		for (Integer integer : list)
		{
			System.out.println(integer);
		}
		list.set(1,0);
		System.out.println("零：" + list.get(0));
		System.out.println("一：" + list.get(1));
		System.out.println("二：" + list.get(2));
		System.out.println("三：" + list.get(3));
		System.out.println("四：" + list.get(4));
	}
}
