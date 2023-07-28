public class AssignOperator{

	public static void main(String[] args){

		int n1 = 10;
		n1 += 4;//ni = n1 +4

		System.out.println(n1);//14

		n1 /= 3;//n1=n1 / 3

		System.out.println(n1);//4

		byte b = 3;

		b += 2;//等价 b = （byte）（b+2）;

		b++;//b = （byte）（b+1）;



	}
}