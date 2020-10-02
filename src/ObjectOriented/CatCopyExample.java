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
			Cat cata = new Cat();
			cata.setName("大花");
			cata.setAge(3);
			CatAction catActionA = new CatAction();
			catActionA.setEat("吃猫粮");
			cata.setCatAction(catActionA);
			System.out.println("    cata为：" + cata);

			Cat catb = (Cat) cata.clone();
			System.out.println("复制后catb为：" + catb);
			catb.setName("小黑");
			catb.setAge(4);
			CatAction catActionB = new CatAction();
			catActionB.setEat("玩球球");
			catb.setCatAction(catActionB);
			System.out.println("修改后catb为：" + catb);
			System.out.println("修改后cata为：" + cata);
		} catch (CloneNotSupportedException e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

	public static void main1(String[] args)
	{
		try
		{
			Cat catA = new Cat();
			catA.setName("大花");
			catA.setAge(3);
			System.out.println("catA为：" + catA); // tostring()

			Cat catB = (Cat) catA.clone(); // 把catA的信息克隆到catB
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
