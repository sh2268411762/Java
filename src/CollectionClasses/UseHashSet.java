/**
 * 
 */
package CollectionClasses;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
*  @Description     HashSet使用
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月5日下午10:56:40
*/
public class UseHashSet
{
	public static void main(String[] args)
	{
		Set<Integer>h1 = new HashSet<>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(2);  //Set中只会保留一个2
		h1.remove(4);  //移除 4
		
		System.out.println("集合大小：" + h1.size());
		
		//遍历
		for (Integer integer : h1)
		{
			System.out.println("foreach遍历：" + integer);
		}
		
		Iterator<Integer> iterator = h1.iterator();
		while(iterator.hasNext())
		{
			System.out.println("迭代器遍历：" + iterator.next());
		}
	}
	
	public static void main1(String[] args)
	{
		Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("B"); // Set中只会保留一个“B”值的元素
        hashSet.remove("D");
        System.out.println("集合大小为：" + hashSet.size()); //2
        // foreach遍历HashSet对象
        for (String elemet : hashSet) {
            System.out.println("foreach遍历：" + elemet);
        }
        // Iterator迭代器遍历
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("迭代器遍历：" + iterator.next());
        }
    }
}
