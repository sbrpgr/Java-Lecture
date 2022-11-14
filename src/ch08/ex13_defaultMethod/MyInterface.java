package ch08.ex13_defaultMethod;

public interface MyInterface {
	abstract void method1();
	
	
	public default void method2() {
		System.out.println("myinterface = method2");
	}
	
}
