abstract class Demo
{
     abstract void m1();
     abstract void m2();
}

class Example18
{
		Demo d=new Demo()  // Object creation of Anonymous class
		{
			void m1(){System.out.println("inside m1 method");  }
	     
	        void m2(){ System.out.println("inside m2 method"); }
		};
		
	public static void main(String[] args) 
	{
		Example18 ref=new Example18();
		ref.d.m1();
		ref.d.m2();
	}
}
