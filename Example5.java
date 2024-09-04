class Outer
{
	int a= 100;
	static float b=200.5f;
	
	class Inner
	{
		int x=10;
		float y=20.5f;
		void m1(int p, float q){
			System.out.println("Inside Inner class method");
			System.out.println(p+q);
			System.out.println(x+y);
			System.out.println(a+b);
			
		}
		
	}
}

class Example5 
{
	public static void main(String[] args) 
	{
		/* Outer o=new Outer();
		System.out.println(o.a);
		Outer.Inner i=o.new Inner();
		System.out.println(i.b);
		i.m1(); */
		new Outer().new Inner().m1(1,2.5f);
	}
}
