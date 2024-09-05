class Demo
{
      void m1(){
		System.out.println("Inside m1 method ");
		Sample s=new Sample();
		System.out.println(s.a+s.b);
	}
	static class Sample
		{
			int a=10;
			float b=20.5f;
		}
}
class Example16
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.m1();
	}
}
