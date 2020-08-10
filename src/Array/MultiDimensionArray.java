/**
 * 
 */
package Array;

import java.util.Arrays;

/**
*  @Description     多维数组
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月10日下午7:16:43
*/
public class MultiDimensionArray 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		int intArray[][] = new int[2][2];//创建整型二维数组
		String[][] strArray = new String[4][4];//创建二维数组
		strArray[0][0] = "德";
		strArray[0][0] = "玛";
		strArray[0][0] = "西";
		strArray[0][0] = "亚";
		String[][][] strArraY = new String[2][3][];//创建三维数组
		
		char[][] charArray = new char[3][];//创建二维数组，可以只定义第一维
		charArray[0] = new char[] {'德','玛','西','亚'};
		charArray[1] = new char[3];
		charArray[2] = new char[7];
		System.out.println("第0索引维度内容：" + Arrays.toString(charArray[0]));
	}
}
