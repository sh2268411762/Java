/**
 * 
 */
package CollectionClasses;

import java.util.*;

/**
*  @Description     ArrayList使用及常用方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月5日下午8:04:16
*/
public class UseArrayList
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.remove(1); // one three

		for (String string : list)
		{
			System.out.println("foreach遍历：" + string);
		}
		System.out.println();
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext())
		{
			System.out.println("迭代遍历：" + iterator.next());
		}
		
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		List<Integer> list3 = new ArrayList<Integer>(3);
		list3.add(4);
		list3.add(66);
		list3.add(33);
		list3.add(14);
		list3.add(99);
		
		//sort排序
		System.out.println("排序前：");
		for (Integer integer : list3)
		{
			System.out.print(integer + " ");
		}
		list3.sort(null);
		System.out.println("\n排序后：");
		for (Integer integer : list3)
		{
			System.out.print(integer + " ");
		}
		
		//根据索引获取指定范围集合内的子集合
		list1 = list3.subList(0, 3);
		System.out.println("\n获取list3【0-3】号元素给list1：");
		for (Integer integer : list1)
		{
			System.out.print(integer + " ");
		}
		System.out.println("list3的内存：" + list3.size());
		
		//查找指定对象，第一个
		System.out.println("查找33的索引：" + list3.indexOf(33));
		//最后一个
		list3.add(99);
		list3.add(99);
		list3.add(99);
		System.out.println("查找99的索引：" + list3.lastIndexOf(99));
		System.out.println("list3的内存：" + list3.size());
	}
}
