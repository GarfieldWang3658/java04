public class Test {
	public static void main(String[]args ){

	int x = 5;
	int y = 5;

	if(x++==6 & ++y==6) {x = 11;
		
	}

	System.out.println("x="+x+"y="+y);


	int a = 5;
	int b = 5;

	if (a++==6 && ++b==6) {a = 11;
		
	}

	System.out.println("a="+a+"b="+b);


	int c = 5;
	int d = 5;

	if(c++==5 | ++d==5) {c = 11;
		
	}

	System.out.println("c="+c+"d="+d);


	int e = 5;
	int f = 5;

	if(e++==5 || ++f==5) {e = 11;
		
	}

	System.out.println("e="+e+"y="+f);



	boolean g = true; 
	boolean h = false;
	short z = 46;

	if((z++==46)&&(h=true))z++;
	if((g=false)||(++z==49))z++;

	System.out.println("z="+z);//50




}



}