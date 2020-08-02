/**
 * 
 */
package string;

/**
*  @Description     字符串常见操作
*  @author          孙豪
*  @version         版本
*  @Date            2020年8月2日下午2:48:13
*/
public class StringOperation 
{
	public static void main(String[] args) 
	{
		//1、字符串连接
		String str1 = "孙豪" + "无敌";
		System.out.println("使用 + 连接字符串：" + str1);
		String segment = str1 + "biubiubiu";
		System.out.println("变量连接字符串常量：" + segment);
		System.out.println(str1 + ",一起在" + segment);
		str1 += "biubiubiu";  //str1 = str1 + "biubiubiu";
		System.out.println("+=可以运用于字符串拼接：" + str1);
		str1 = "软件工程" + 1802 + "孙豪";  //整型 1802 被转换为 String
		System.out.println("连接字符串与整型：" + str1);
		str1 = "数学成绩：" + 99.9;  //double类型 99.9 被转换为 String
		System.out.println("连接字符串与浮点型：" + str1);
		str1 = "判断结果：" + true;  //Boolean：true 被转换为 String
		System.out.println("连接字符串与布尔型：" + str1);
		str1 = "软件工程" + 1802 + 9;  //整型1802和9依次被转换为String进行连接
		System.out.println("连接字符串与整型                                ：" + str1);
		str1 = "软件工程" + (1802 + 9);  //1802和9 先进行运算再进行结果转换，字符串拼接
		System.out.println("连接字符串与整型（括号改变顺序）：" + str1);
		str1 = "软件工程" + 1802;
		str1 = str1.concat("孙豪");
		System.out.println("将字符串\"孙豪\"连接到指定字符串末尾结果为：" + str1); //进行了赋值操作
		str1.concat("不会改变str对象内容");
		System.out.println("str1对象内容不会被上面语句更改，为：" + str1);
		System.out.println("\n");
		
		
		//2、字符串长度
		String str2 = "此后锦书休寄，画楼云雨无凭";
		int length = str2.length();
		System.out.println("字符串对象\"" + str2 + "\"长度为：" + length);
		String str = " ";
		System.out.println("一个空格的字符串对象长度为：" + str.length());
		System.out.println("\n");
		
		
		//3、查找字符串
		//charAT()
		String str3 = "终是庄周梦了蝶，你是恩赐也是劫abc";
		for(int i = 0;i < str3.length();i++)
		{
			//按索引依次打印出str3 字符串中的字符
			System.out.println("依次查询str3字符串中字符，第" + i + "索引字符为\""  + str3.charAt(i)+ "\"\n");
		}
		
		//indexOf()
		System.out.println("“周”在str3对象中出现的索引位置为：" + str3.indexOf("周"));
		System.out.println("从索引4开始查询，“周”在str3对象中出现的索引位置为：" + str3.indexOf("周",4));//周 的索引为3，从4开始无法查找到改字符串
		int ascii = (int)'a';  //获取a的ASCII值
		System.out.println("'a'在str3中出现的索引位置为：" + str3.indexOf(ascii));
		System.out.println("从索引1开始查询，'a'在str3中出现的索引位置为：" + str3.indexOf(ascii,1));
		
		str3 = "终是abc庄周梦了abc蝶，你是恩abc赐也是abc劫abc";//可以通过多次使用indexOf()方法确定入参字符串在指定String对象中出现的次数
		int i = 0;
		int count = 0;//计数器，存储'a'出现的次数
		while(i < str3.length())
		{
			int index = str3.indexOf(ascii,i);
			//int index = str3.indexOf("abc",i);  //修改入参查询其他值
			System.out.println("从索引1开始查询，'a'在str3对象中出现的索引位置为：" + index);
			if(index > 0)
			{
				i = index + 1;//步进赋值，使得下一次循环从当前找到字符串的索引+1的位置开始查询
				count++;
			}//更新
			else
			{
				break;//未查找到'a',跳出循环
			}
		}
		System.out.println("'a'字符串在str3对象中共出现次数：" + count);
		
		//lastIndex()：反向搜索
		System.out.println("“是”在str3对象中最后一次出现的索引位置为：" + str3.lastIndexOf("是"));
		System.out.println("从索引1开始,“庄”在str3中最后一次出现的索引位置为：" + str3.lastIndexOf("庄",1));
		System.out.println("'a'在str3对象中最后一次出现的索引位置为：" + str3.lastIndexOf(ascii));
		System.out.println("从索引1开始,'a'在str3中最后一次出现的索引位置为：" + str3.lastIndexOf(ascii,1));
		System.out.println("\n");
		
		
		
		//4、字符串替换
		String str4 = "shwd";
		str4 = str4.replace("s", "孙");
		str4 = str4.replace("h", "豪");
		System.out.println("str4替换后结果为：" + str4);
		String newStr4 = str4.replace("aaa", "newChar");
		System.out.println("newStr4找不到替换字符串，返回原来字符串：" + newStr4);
		System.out.println("newStr4湖人str4引用内存地址是一个吗？：" + newStr4 == str4);
		str4 = "三里春风abc三里路abc步步春风abc再无你abc";
		str4 = str4.replaceAll("a", ",");
		System.out.println("将str4中字母a都替换成逗号：" + str4);
		str4 = str4.replaceAll("[a-zA-Z]+", ":");
		System.out.println("将str4中多个紧挨的字母都替换成一个冒号：" + str4);
		str4 = "三里a春风abc三a里路,abc步步春风abc再无你abc9876";
		str4 = str4.replaceAll("[a-zA-Z]+", "");
		System.out.println("将str4中多个紧挨的字母删除：" + str4);
		str4 = "三里春风abc三里路abc,步步春风abc再无你abc8765";
		newStr4 = str4.replaceAll("[\\da-zA-Z]+", "");
		System.out.println("将newstr4中的数字和字母都删除：" + newStr4);
		str4 = "三里春风abc三里路abc,步步春风abc再无你abc8765";
		str4 = str4.replaceFirst("[a-zA-Z]+","");
		System.out.println("将str4中出现第一组多个紧挨的字母删除：" + str4);
		System.out.println("\n");
				
		
		//5、字符串截取
		String str5 = "11111本是青灯不归客，却因浊酒恋红尘22222";
		String newstr5 = str5.substring(5);
		System.out.println("str5从索引5出开始截取到结尾的子字符串：" + newstr5);
		String newStr5 = str5.substring(5, 20);
		System.out.println("str5从索引5到索引20之间的子字符串：" + newStr5);//左闭右开，5到底19个字符
		System.out.println("\n");
		
		
		//6、字符串分割
		String str6 = "Code,我与春风皆过客,你携秋水揽星河,";
		String[] str6Arrey = str6.split(",");
		for(String element:str6Arrey)
		{
			System.out.println("分割后字符串数组中内容依次为：" + element);
		}
		str6 = "Code111我与春风皆过客a你携秋水b揽c星河";
		String[] strArrey1 = str6.split("[\\d-z]+", 1);//限定拆分一次
		System.out.println("分割一次后得到数组长度：" + strArrey1.length);
		for(String element:strArrey1)
		{
			System.out.println("分割1次后字符串数组中内容依次为：" + element);
		}
		String[] strArrey2 = str6.split("[\\da-z]+", 3);//限定拆分3次
		System.out.println("分割三次后得到数组长度：" + strArrey2.length);
		for(String element:strArrey2)
		{
			System.out.println("分割3次后字符串数组中内容依次为：" + element);
		}
		System.out.println("\n");
		
		
		//7、字符串首尾内容判断
		//前缀
		String str7 = "白茶清欢无别事，我在等风也等你";
		System.out.print("是否以“白茶”前缀开始：");
		System.out.println(str7.startsWith("白茶"));
		System.out.print("是否以“别事”前缀开始：");
		System.out.println(str7.startsWith("别事"));
		System.out.print("从索引4处开始，是否以“无”前缀开始：");
		System.out.println(str7.startsWith("无",4));
		//后缀
		System.out.print("是否以“等你”后缀结尾：");
		System.out.println(str7.endsWith("等你"));
		System.out.print("是否以“别事”后缀结尾：");
		System.out.println(str7.endsWith("别事"));
		System.out.println("\n");
		
		
		//8、字符串首尾去空格
		String str8 = "  食 一 碗 人 间 烟 火，饮 几 杯 人 生 起 落  ";
		System.out.println(str8);
		str8 = str8.trim();
		System.out.println("首尾去除空格：\n" + str8);
		System.out.println("\n");
		
		//9、字符串大小写转换
		
		//10、字符串比较
		//11、字符串格式化输出
		//12、其他字符串操作
	}
}
