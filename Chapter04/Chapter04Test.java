public class Chapter04Test{
	public static void main(String[] args);{

		System.out.println(10/3);//3
		Systemn.out.println(10/5);//2
		System.out.println(10%2);//0
		System.out.println(-10.5%3);//a%b,当a是小数时 公式=a-（int）a/b*b=
		//-10.5%3=-10.5-（-10）/3*3=-10.5- -9=-1.5
		//有小数运算，得到的结果是近似值，
		System.out.println(-10.4%3);//-1.4的近似值

		int i = 66；
		//++i + i=
		//++i先自增再赋值=67 +i（67）= 
		System.out.println(++i+i);//134

//赋值语句正确的事
		int num1 = （int）"18";//错，不能以这样的形式强转字符串，Integer.parselnt("18")，包装类。
		int num2 = 18.0;//错 类型不匹配
		double num3 = 3d;//对 ,数字后面+字母=double类型
		double num4 = 8;//对，整数赋给double，double精度>int,int->double
		int i = 48; char ch = i + 1;//错 int精度 > char
		byte b =19;short s = b+2;//错 原因；int->short ,Byte short char 三者计算时，精度需要提升到int进行计算

		String str = "18.8";//注意字符串是可以转成double的
		double d1 = Double.parseDouble(str)；

		char c1 = '韩'；
		String str2 = c1 +“”；






	}
}