class Outer
{
	 int a= 1000;
     float b=2000.5f;
	 void m1(){
			System.out.println("Inside Inner Class");	
			System.out.println(a+b);
			Inner i=new Inner(); 
			System.out.println(i.a+i.b);
	}

	class Inner 
	{
		private int a=100;
		private float b=200.5f;
	}
}
class Example8 
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
