class Outer
{
	int a= 10;
	class Inner
	{
		float b=20.5f;
		void m1(){
			System.out.println("Inside Inner class method");
			System.out.println(a+b);
		}
	}
}

class Example2 
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
