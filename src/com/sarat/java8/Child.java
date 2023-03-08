package com.sarat.java8;

public class Child extends Parent {
	
	public static void main(String[] args) {
//			Child c=new Child();
//			c.print(1);
			Parent p=new Child();
			p.print(1);
//			Parent pa=new Parent();
//			pa.show();

	}
	static {
		System.out.println("Child Static block..");
	}
	{
		System.out.println("Child Instance block..");
	}
		public Child() {
		super();
		System.out.println("Child Constructer");
	}
		public static void StatMethod() {
			System.out.println("child Static  method..");
			
		}

	public String show(String string) {
		System.out.println("Instance method..");
		return "Child Sarat.";

	}
	public void show() {
		System.out.println(" Child Instance method..");
		
	}
	public static int print(int a) {
        System.out.println("here child paramenter - Integer");
        return 0;
    }
}
