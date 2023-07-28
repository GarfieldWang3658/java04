public class ArithmeticOperator{
	public static void main(String[] args){
		System.out.println(10 / 4);//从数学来看应该等于2.5，
		System.out.println(10.0 / 4);
		// 计算机中10为整数，4为整数，Java中运行结果也将成为整数
		double d = 10 / 4;//java中为2；10/4=2 将2赋给double =》2.0
		System.out.println(d);//是2.0

		// % 取模=取余数
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);//1? 取模的本质 a % b =a-a/b*b
		//-10%3 = -10 - （-10）/3*3=-10+9=-1
		//10%-3 = 10-（10）/（-3）*（-3）=10-9=1

		System.out.println(-10 % -3);
		//-10%-3=-10-（-10）/（-3）*（-3）=-10+9=-1

		int i = 10;
		i++;//自增 等价于 i = i + 1；
		++i;//自增 等价于 i = i + 1；=》i=12
		//如果++语句独立使用，那么前++和后++ 都是 i = i + 1
		System.out.println("i="+i);//11

		//作为表达式使用
		//前++；++i先用自增后赋值
		//后++；i++先赋值后自增

		int j = 8;
		// int k = ++j;//等价 先自增j=j+1；再赋值k=j；k=9 j=9

		int k = j++;//等价，先赋值k=j 再自增j=j+1；k=8 j=9



		System.out.println("k=" + k +"j=" + j);

	}
}