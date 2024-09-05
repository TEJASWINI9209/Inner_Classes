abstract class Demo
{
     abstract void m1();
     abstract void m2();
}
class Sample extends Demo
{
	void m1(){
		System.out.println("inside m1 method");
	}
	void m2(){
		System.out.println("inside m2 method");
	}
}
class Example17
{
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.m1();
		s.m2();
		Demo d=new Sample();
		d.m1();
		d.m2();
	}
}
