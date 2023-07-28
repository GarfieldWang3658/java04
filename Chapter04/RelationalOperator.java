public class RelationalOperator{
	public static void main(String[] args){
		int a = 9;//实际开发中，工作中，不可以使用a，b，a1，bc，n1，n2；
		int b = 8;
		System.out.println(a > b);//T
		System.out.println(a >= b);//T
		System.out.println(a <= b);//F
		System.out.println(a < b);//F
		System.out.println(a == b);//F
		System.out.println(a != b);//T
		boolean flag = a > b;//t

		System.out.println("flag="+flag);

	}
}