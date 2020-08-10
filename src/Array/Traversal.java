/**
 * 
 */
package Array;

import java.util.Arrays;

/**
*  @Description     数组遍历
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月10日下午7:27:34
*/
public class Traversal 
{
	public static void main(String[] args) 
	{
		char charArray[] = new char[] {'一','二','三','四'};
		//foreach遍历
		for (char c : charArray) 
		{
			System.out.println("遍历数组charArray：" + c);
		}
		//for遍历
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			System.out.println("遍历数组charArray，第" + i + "索引元素为：" + c);
		}
		System.out.println("\n");
		
		//for遍历多维数组
		char charArray1[][] = new char[][] {{'德','玛','西','亚'},{'人','在','塔','在'},{'未','来','信','仰'}};
		for (int i = 0; i < charArray1.length; i++) {
			for (int j = 0; j < charArray1[i].length; j++) {
				char cs = charArray1[i][j];
//				System.out.print("遍历数组，第" + i + "+" + j + "索引元素为：" + cs);
				System.out.print(cs);
			}
			System.out.println();
		}
		
		System.out.println("\n");
		//Arrays类中的toString静态方法
		char charArray2[] = new char[] {'举','世','皆','惊'};
		System.out.println("使用toString方法输出数组内容：" + Arrays.toString(charArray2));
		//多维数组
		//toString方法输出的是每个维度的数组的内存地址
		System.out.println("使用toString方法输出数组内容：" + Arrays.toString(charArray1));
		//deepToString方法输出的是每个维度的数组的内存地址
		System.out.println("使用deepToString方法输出数组内容：" + Arrays.deepToString(charArray1));
	}
}
