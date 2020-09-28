/**
 * 
 */
package ObjectOriented;

/**
 * @Description final关键字
 * @author 孙豪
 * @version 版本
 * @Date 2020年9月21日上午10:52:12
 */
public final class FinalClass extends Person_1 // final修饰类，该类不能被继承
{ // 继承Person_1
	int count = 0;

	private final int id = 1010;// 基本类型常量定义
	private final Person_1 p1 = new Person_1(); // 对象引用

	public final void privatePrint()
	{
		System.out.println("子类方法，与父类不可被继承的方法名称相同");
	}

	public void print_final(final String name)
	{
		System.out.println(name);
//		name = "ooo";  //报错，final修饰的入参不能被修改
	}

	public static void main(String[] args)
	{
		FinalClass f1 = new FinalClass();
		f1.count++;
		System.out.println("自增：" + f1.count);
		System.out.println("id = " + f1.id);
		System.out.println(f1.p1.name_1);
		f1.p1.name_1 = "更改名字";
		System.out.println(f1.p1.name_1);

		FinalClass f2 = new FinalClass();
		f2.print(); // 父类方法
		f2.finalPrint(); // 父类方法
		f2.privatePrint(); // 子类方法
		f2.print_final("名字");
	}
}
