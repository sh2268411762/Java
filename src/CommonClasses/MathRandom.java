/**
 * 
 */
package CommonClasses;

import java.util.Random;

/**
*  @Description     Math类中的random()方法:可以生成大于等于0.0、小于1.0的double型随机数
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月3日下午2:22:39
*/
public class MathRandom
{
	public static void main(String[] args)
	{
		System.out.println("生成一个int型（0到1之间的随机数）：" + (int) (Math.random()));
		System.out.println("生成一个int型（0到100之间的随机数）" + (int) (Math.random() * 100));

		System.out.println("生成a到z之间的随机字符：" + (char) ('a' + Math.random() * ('z' - 'a' + 1)));
		System.out.println("生成a到z之间的随机字符：" + (char) ('a' + Math.random() * ('z' - 'a' + 1)));
		System.out.println("生成a到z之间的随机字符：" + (char) ('a' + Math.random() * ('z' - 'a' + 1)));
		// a + 随机数 * （26） 0即为a
		System.out.println("生成A到Z之间的随机字符：" + (char) ('A' + Math.random() * ('Z' - 'A' + 1)));
		System.out.println("生成A到Z之间的随机字符：" + (char) ('A' + Math.random() * ('Z' - 'A' + 1)));
		System.out.println("生成A到Z之间的随机字符：" + (char) ('A' + Math.random() * ('Z' - 'A' + 1)));

		System.out.println();
		Random random = new Random(); // 随机数生成器，默认为以系统当前时间为种子
//		Random ran = new Random(seedValue);  //也可以自定义随机数生成器的种子
		System.out.println("返回一个随机整数：" + random.nextInt());
		System.out.println("返回一个大于0，小于n（n为入参）的随机整数：" + random.nextInt(8));
		System.out.println("返回一个随机长整型值：" + random.nextLong());
		System.out.println("返回一个随机布尔型值：" + random.nextBoolean());
		System.out.println("返回一个随机浮点型值：" + random.nextFloat());
		System.out.println("返回一个随机双精度型值" + random.nextDouble());
		System.out.println("返回一个概率密度为高斯分布的双精度值：" + random.nextGaussian());

	}
}
