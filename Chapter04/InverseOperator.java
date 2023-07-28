//!he ^演示
public class InverseOperator{
	public static void main(String[] args){

		//取反操作，T-> F->T
		System.out.println(60>20);//T
		System.out.println(!(60>20));//F


		//a^b 逻辑异或，当 a 和 b 不同时，结果为true，否则为false

		Boolean b = ( 10 > 1 ) ^ ( 3 < 5 );//T F 不同，满足条件，结果为true
		System.out.println("b="+ b);//T



	}
}