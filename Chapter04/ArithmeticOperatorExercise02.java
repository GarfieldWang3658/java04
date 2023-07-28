public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		//假如还有59天放寒假，合多少个星期零多少天？
		//1.理解需求：
		//2.思路分析：
		//（1）使用int 变量 days 保存天数
		//（2）一个星期7天，days /7 =星期数weeks
		//（3）零多少天leftdays= days % 7 输出
		//3.走代码

		int days = 59;
		int weeks = days / 7;
		int leftdays = days % 7;

		System.out.println(days + "天 合"+ weeks + "星期零" + leftdays + "天");

		//定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*（华氏温度-100）
		//求出华氏温度对应的摄氏温度。【234.5】
		//1、理解需求
		//2、思路分析
		//（1）定义一个华氏温度，定义一个double变量，保存华氏温度，double huashi
		//（2）根据给出的公式套用 进行计算，考虑数学公式和java语言的特性
		//（3）将得到的结果保存到一个double sheshi 变量
		//3、走代码

		double huashi = 234.6;
		double sheshi = 5.0 / 9 * (huashi-100);

		System.out.println("华氏温度"+huashi+"对应的摄氏温度="+sheshi);




	}
}