/**
 * 
 */
package ObjectOriented;

/**
 * @Description 功能
 * @author 孙豪
 * @version 版本
 * @Date 2020年10月2日下午6:28:59
 */
public class AShowAnimal
{
	public static void main(String[] args)
	{
		AbstractAnimal cat = new Acat();
		cat.name = "猫";
		cat.getDesc();
		cat.eat();

		AbstractAnimal dog = new Adog();
		dog.name = "狗";
		dog.getDesc();
		dog.eat();
	}
}
