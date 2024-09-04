class Outer
{
	int a= 10;
	static float b=200.5f;
	
	class Inner
	{
		void m1(){
			System.out.println("Inside Inner class method");
			System.out.println(a+b);
		}
		
	}
}

class Example4 
{
	public static void main(String[] args) 
	{
		/* Outer o=new Outer();
		System.out.println(o.a);
		Outer.Inner i=o.new Inner();
		System.out.println(i.b);
		i.m1(); */
		new Outer().new Inner().m1();
	}
}
