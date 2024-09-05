class Demo
{
    int a=1000;
	static class Sample
	{
		void m1(){
			Demo d=new Demo();
			System.out.println("Inside m1 method "+d.a);
		}
	}
}
class Example14
{
	public static void main(String[] args) 
	{
		Demo.Sample ss=new Demo.Sample();
		ss.m1();
	}
}
