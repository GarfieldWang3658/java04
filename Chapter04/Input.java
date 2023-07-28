import java.util.Scanner;//表示把java.util下的Scanner类导入
public class Input{
	public static void main(String[] args){
		//演示接受用户输入
		//步骤
		//Scanner类 表示 简单文本扫描器，在java.util包
		//1、引入/导入Scanner类所在
		//2、创建Scanner 对象,new 创建一个对象，体会
		// myscanner 就是 Scanner类的对象

		Scanner myScanner = new Scanner(System.in);
		//3、接收用户的输入,使用相关的方法

		System.out.println("请输入名字");

		//当程序执行到next方法时，会等待用户用户输入，如果用户不输入会停着。
		String name = myScanner.next();//表示接收用户的输入

		System.out.println("请输入年龄");
		int age = myScanner.nextInt();//表示接收用户的输入的int

		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();//表示接收用户的输入的double

		System.out.println("人的信息如下");
		System.out.println("名字=" + name + "年龄=" + age + "薪水=" + sal);
	}
}