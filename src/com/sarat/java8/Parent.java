package com.sarat.java8;

public class Parent {
	static {
		System.out.println("Parent Static block..");
	}
	{
		System.out.println("Parent Instance block..");
	}

	public Parent() {
		super();
		System.out.println("Parent Constructer..");
	}
	public static void StatMethod() {
		System.out.println("parent Static  method..");
		
	}

	public void show() {
		System.out.println(" Parent Instance method..");
		
	}
	public void show(int a) {
		System.out.println(" ParentInstance method..");
		
	}
	public Object show(String string) {
		System.out.println("Parent Instance method..");
		return "Parent Sarat.";

	}
	
	public static <T extends Integer> int print(int a) {
        System.out.println("here - Integer");
        return 0;
    }
	public static <T extends Short> short print(short a) {
        System.out.println("here - Short");
        return 0;
    }
    public static <T extends Byte> byte print(byte a) {
        System.out.println("here - Byte");
        return 0;
    }
    public static <T extends Void> void print() {
        System.out.println("here - Void");
    }
	
    public static void main(String... args) {
        
    }
	
}
