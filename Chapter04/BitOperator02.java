public class BitOperator02{
	public static void main(String[] args){
		int a = 1 >> 2;//1=>> 00000000 00000000 000000000 000000001=>
		//00000000 00000000 00000000 00000000 01=本质1/2/2=0
		
		System.out.println(1>>2);



		int c = 1 << 2;//1=00000000 00000000 00000000 0000000100
		//本质1*2*2=4

		System.out.println(1<<2);

		//4=00000000 00000000 00000000 00000100
		//4<<3=000 00000000 00000000 00000000 00100000
		//4<<3=32
		//本质4*2*2*2

		System.out.println(4<<3);//32

		//15=00000000 00000000 00000000 00001111
		//15>>2=00000000 00000000 00000000 00000011 11
		//15>>2=3
		//本质15/2/2

		System.out.println(15>>2)//3


	}
} 