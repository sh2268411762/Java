/**
 * 
 */
package ObjectOriented;

/**
*  @Description     Person类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月16日上午12:36:19
*/
public class Person_1
{
	//数据
		String name;
		int age;
		float height;
		float weight;
		public String name_1 = "名字";
		
		public Person_1()  //构造方法1
		{
			super();
		}
		
		//算法方法
		public Person_1(String _name, int _age, float _height, float _weight)  //构造方法2
		{
			super();
			this.name = _name;
			this.age = _age;
			this.height = _height;
			this.weight = _weight;
		}
		
		//算法方法
		private void printPerson_1()
		{
			System.out.println(name + age + height + weight);
		}
		
		public static void main(String[] args)
		{
			Person_1 p1 = new Person_1("zs",22,187.3f,67.0f);
			p1.printPerson_1();
		}
		
		public void print()
		{
			System.out.println("继承父类的方法");
		}
		public final void finalPrint()   //final修饰方法
		{
			System.out.println("继承父类的final方法");
		}
		private final void privatePrint()
		{
			System.out.println("不能被继承的final方法");
		}
}
