/**
 * 
 */
package ObjectOriented;

/**
*  @Description     多重继承两个接口
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月2日下午6:34:00
*/
public class AnimalServiceImpl implements ACatService,AnimalService
{

	@Override
	public void sleep()
	{
		System.out.println("猫猫睡觉");
	}
	
	public void playBall()
	{
		System.out.println("猫咪玩球球");
	}
	public static void main(String[] args)
	{
		AnimalServiceImpl a1 = new AnimalServiceImpl();
		a1.sleep();
		a1.playBall();
	}


}
