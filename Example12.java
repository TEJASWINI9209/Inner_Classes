class Demo
{
	void test1(){
		class Sample
		{
			void m1(){
				System.out.println("Inside m1 method-test1 ");
			}
		}
		Sample ref=new Sample();
			ref.m1();
	}
	void test2(){
		class Sample
		{
			void m1(){
				System.out.println("Inside m1 method-test2");
			}
		}
		Sample ref=new Sample();
			ref.m1();
	}
}
	
class Example12
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.test1();
		d.test2();
	}
}
