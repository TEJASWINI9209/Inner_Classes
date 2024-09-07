interface It1
{
	void m1();
	void m2();
} 


class Example19
{
		It1 i=new It1()  // Object creation of Anonymous class
		{
			public void m1(){System.out.println("inside m1 method");  }
	     
	       public void m2(){ System.out.println("inside m2 method"); }
		};
		
	public static void main(String[] args) 
	{
		Example19 ref=new Example19();
		ref.i.m1();
		ref.i.m2();
	}
}
