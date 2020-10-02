/**
 * 
 */
package ObjectOriented;

/**
*  @Description     功能
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午6:14:01
*/
public class CatCopyExample_new
{
	public static void main(String[] args)
	{
		try
		{
			Cat_new catA = new Cat_new();
			catA.setName("大花");
			catA.setAge(3);
			CatAction_new catActionA = new CatAction_new();
			catActionA.setEat("吃猫粮");
			catA.setCatAction(catActionA);
			System.out.println("    catA为：" + catA);
			
			Cat_new catB = (Cat_new)catA.deepClone();
			System.out.println("复制后catB为：" + catB);
			catB.setName("小黑");
			catB.setAge(4);
			CatAction_new catActionB = catB.getCatAction();
			catActionB.setEat("玩球球");
			catB.setCatAction(catActionB);
			System.out.println("修改后catB为：" + catB);
			System.out.println("修改后catA为：" + catA);
		} catch (Exception e)
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
