/**
 * 
 */
package CollectionClasses;

import java.util.*;

/**
*  @Description     LinkedList常用方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月5日下午10:19:17
*/
public class UseLinkedList
{
	public static void main(String[] args)
	{
		List<Integer>list = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++)
		{
			list.add(i, i);
		}
		for (int i = 0; i < 10; i++)
		{
			System.out.print(list.get(i) + " ");
		}
	}
}
