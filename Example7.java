class Outer
{
	 int a= 1000;
     float b=2000.5f;
	
	class Inner extends Outer
	{
		int a=100;
		float b=200.5f;  
		void m1(int a, float b){
			System.out.println("Inside Inner Class");	
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(super.a+super.b);
		}
	}
}
class Example7 
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
