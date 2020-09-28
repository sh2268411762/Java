/**
 * 
 */
package ObjectOriented;

/**
 * @Description 浅克隆--基本类型
 * @author 孙豪
 * @version 版本
 * @Date 2020年9月28日下午11:35:38
 */
public class CatCopyExample
{
	public static void main(String[] args)
	{
		try
		{
			Cat catA = new Cat();
			catA.setName("大花");
			catA.setAge(3);
			System.out.println("catA为：" + catA); // tostring()

			Cat catB = (Cat) catA.clone();
			System.out.println("复制后catB为：" + catB);
			catB.setName("小黑");
			catB.setAge(4);
			System.out.println("修改后catB为：" + catB);
			System.out.println("修改后catA为：" + catA);
		} catch (CloneNotSupportedException e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}
}
