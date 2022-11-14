package ch06;

public class Television {
	
	static String company = "mycompany";
	static String model = "lcd";
	static String info;
	
	static {
		System.out.println("1");
		info = "정보: " + company;
		info += "-" + model;
	}
	
	static {
		System.out.println("2");
	}
}
