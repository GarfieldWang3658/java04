public class TernaryOperator{
	public static void main(String[] args){

		int a = 10;

		int b = 99;

		// a>b false
		//返回 b--，先返回b的值，然后再b-1
		//返回的结果为99

		int result = a < b ? a++ :b--;

		System.out.println("result="+result);//10
		System.out.println("a="+a);//11
		System.out.println("b="+b);//99





	}



}