class Outer
{
	int a= 10;
	void m1(){
			System.out.println("Inside Inner class method");
			Inner i=new Inner();
			System.out.println(a+i.b);
		}
	class Inner
	{
		float b=20.5f;
		
	}
}

class Example3 
{
	public static void main(String[] args) 
	{
		/* Outer o=new Outer();
		System.out.println(o.a);
		Outer.Inner i=o.new Inner();
		System.out.println(i.b);
		i.m1(); */
		new Outer().m1();
	}
}
