public class LogicOperator02{
	public static void main(String[] args){

		//||短路或，|逻辑或
		//一个为true，则全部输出
		int age =50;

		if (age > 20 || age < 30) {
			System.out.println("ok100");
		}

		if (age > 20 | age < 30) {
			System.out.println("ok200");
}
//区别，
//（1）短路或||如果第一个条件为true，第二个条件不会判断，结果为ture，效率高。
//（2）逻辑或|,不论第一条件是否为true，都需要执行第二个条件，效率低。

// int a = 4;
// int b = 9;
// if (a > 1 || ++ b > 4) {
// 	System.out.println("ok300");
// }

int a = 4;
int b = 9;
if (a > 1 | ++ b > 4) {
	System.out.println("ok300");
}
System.out.println("a="+a+"b="+b);//4 9 
//实际开发基本使用短路
}
}
