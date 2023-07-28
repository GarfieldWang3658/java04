public class ArithmeticOperatorExercise01{
	public static void main(String[] args){
		// int i = 1;// i=1
		// i = i++;//规则使用临时变量：（1）现将i保存在一个临时变量中，temp=i；（2）i = i + 1；（3）i = temp；

		// System.out.println(i);//

		// int i = 1；
		// i = ++i；//规则使用临时变量：（1）先运算，i = i + 1；（2）将i保存在临时变量中，temp = i；（3）赋值i，i = temp；
		// System.out.println(i);//2

		int i1 = 10;
		int i2 = 20;
		int i=i1++;

		System.out.println("i="+i);//10
		System.out.println("i2="+i2);//20

		i = --i2;//先运算再赋值，--i2=19，自减后i2=19，赋值i=--i2=19
		System.out.println("i="+i);//19
		System.out.println("i2="+i2);//19


	}
}