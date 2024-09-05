class Demo
{
	void test(){
		class Sample
		{
			int a=10;
			void m1(){
				System.out.println("Inside m1 method "+a);
			}
		}
		Sample ref=new Sample();
			ref.m1();
	}
}
	
class Example11
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.test();
	}
}
