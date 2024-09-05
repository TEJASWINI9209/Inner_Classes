class Demo
{
    static int x=300;
	static class Sample
	{
		static void m1(){
		System.out.println("Inside m1 method "+x);
		}
	}
}
class Example15
{
	public static void main(String[] args) 
	{
		Demo.Sample.m1();
	}
}
