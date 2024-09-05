class Demo
{
	static int a=10;
	static class Sample
	{
		void m1(){
			System.out.println("Inside m1 method");
		}
	}
}
class Example13
{
	public static void main(String[] args) 
	{
		Demo.Sample ss=new Demo.Sample();
		ss.m1();
	}
}
