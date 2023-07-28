public class LogicOperator01{
	public static void main(String[] args){
		//演示逻辑运算符的使用 &&与&案例演示


		//短路与
		int age = 50;
		if (age > 20 && age < 90) {
			System.out.println("ok100");
			
		}
		//逻辑与
		if (age > 20 & age < 90) {
			System.out.println("ok200");
			
		}
		//区别

		int a = 4;
		int b = 9;

		if (a<10 & ++b<50) {
			System.out.println("ok300");

			
		}
		// if (a<10 & ++b<50) {
		// 	System.out.println("ok300");

			
		// }

		//对于 && 短路与而言，如果第一个条件为false，后面的条件不再判断。
		//对于 & 逻辑与而言，如果第一个条件为false，后面的条件仍然会判断。

		System.out.println("a=" + a + "b=" + b );//4。10


	}
}