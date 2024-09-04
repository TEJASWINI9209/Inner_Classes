class Outer
{
	private int a= 100;
    private float b=200.5f;
	
	class Inner
	{
		int a=10;
		float b=20.5f;  
		void m1(int a, float b){
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(Outer.this.a+Outer.this.b);
		}
	}
}
class Example6 
{
	public static void main(String[] args) 
	{
		/* Outer o=new Outer();
		System.out.println(o.a);
		Outer.Inner i=o.new Inner();
		System.out.println(i.b);
		i.m1(); */
		new Outer.new Inner.m1(1,2.5f);
		i.m1(1, 2.5f);
	}
}
