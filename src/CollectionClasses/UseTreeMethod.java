/**
 * 
 */
package CollectionClasses;

import java.util.*;

/**
*  @Description     TreeSet常用方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月6日上午1:06:53
*/
public class UseTreeMethod
{
	public static void main(String[] args)
	{
		TreeSet<Integer>t1 = new TreeSet<>();
		t1.add(66);
		t1.add(16);
		t1.add(63);
		t1.add(99);
		t1.add(26);
		t1.add(46);
		
		//ceiling(E e)
		System.out.println("返回该集合中大于等于给定元素的最小元素，不存在则返回null：" + t1.ceiling(100) + " " + t1.ceiling(66));
		//floor(E e)
		System.out.println("返回该集合中小于等于给定元素的最大元素，不存在则返回null：" + t1.floor(99) + " " + t1.floor(0));
		//last()
		System.out.println("返回该集合中当前最后一个元素：" + t1.last());
		//first
		System.out.println("返回该集合中当前第一个元素：" + t1.first());
		//descendingIterator()
		Iterator i1 = t1.descendingIterator();
		System.out.println("返回该集合按降序进行迭代的迭代器：");
		while(i1.hasNext())
		{
			System.out.print(i1.next() + " ");
		}
		//higher(E e)
		System.out.println("\n返回该集合中严格大于给定元素的最小元素，不存在则返回null：" + t1.higher(99) + " " + t1.higher(28));
		//lower(E e)
		System.out.println("返回该集合中严格小于给定元素的最大元素，不存在则返回null：" + t1.lower(78) + " " + t1.lower(1));
		//headSet(E toelement)
		TreeSet<Integer>t2 = new TreeSet<>();
		t2 = (TreeSet<Integer>) t1.headSet(45);
		System.out.println("返回部分集合，其元素严格小于入参元素：");
		Iterator i2 = t2.iterator();
		while(i2.hasNext())
		{
			System.out.print(i2.next() + " ");
		}
		//subSet(E start,E end)
		System.out.println("\n返回部分集合，其元素从start到end（左闭右开）：");
		TreeSet<Integer>t3 = new TreeSet<>();
		t3 = (TreeSet<Integer>) t1.subSet(10, 88);
		Iterator i3 = t3.iterator();
		while(i3.hasNext())
		{
			System.out.print(i3.next() + " ");
		}
		//tailSet(E num)
		System.out.println("\n返回部分集合，其元素严格大于等于入参：");
		TreeSet<Integer>t4 = new TreeSet<>();
		t4 = (TreeSet<Integer>) t1.tailSet(30);
		Iterator i4 = t4.iterator();
		while(i4.hasNext())
		{
			System.out.print(i4.next() + " ");
		}
	}
}