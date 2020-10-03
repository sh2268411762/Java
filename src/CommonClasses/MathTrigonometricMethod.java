/**
 * 
 */
package CommonClasses;

/**
*  @Description     Math类三角函数方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月3日下午1:54:19
*/
public class MathTrigonometricMethod
{
	public static void main(String[] args)
	{
		System.out.println("30° 正弦：" + Math.sin(Math.PI / 6));
		System.out.println("30° 反正弦：" + Math.asin(Math.PI / 6));
		System.out.println("90° 余弦：" + Math.sin(Math.PI / 2));
		System.out.println("45° 正切：" + Math.tan(Math.PI / 4));
		System.out.println("60° 的弧度为：" + Math.toRadians(Math.PI / 3));
		System.out.println("π的角度值为：" + Math.toDegrees(Math.PI));
		
		System.out.println("非反函数部分（结果与整数相对应）：");			//非反函数部分提示符
		System.out.println("sin60°等于："+Math.sin(Math.PI/3));
		System.out.println("sin30°等于："+Math.sin(Math.PI/6));
		System.out.println("cos45°等于："+Math.cos(Math.PI/4));
		System.out.println("tan45°等于："+Math.tan(Math.PI/4));
		System.out.println();											//空一行
			
		System.out.println("反函数部分（结果换算为弧度PI相对应）：");		//反函数部分提示符
		System.out.println("arcsin1等于："+Math.asin(1));
		System.out.println("arcsin0.5等于："+Math.asin(0.5));
		System.out.println("arccos1等于："+Math.acos(1));
		System.out.println("arctan1等于："+Math.atan(1));
		System.out.println();											//空一行

		System.out.println("弧度值与角度值：");							//弧度值与角度值
		System.out.println("90度的弧度值为："+Math.toRadians(90));
		System.out.println("π/3的角度为："+Math.toDegrees(Math.PI/3));
	}
}
