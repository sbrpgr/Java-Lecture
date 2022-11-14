package ch07;

public abstract class Ex21_Phone {
	
	public String owner;
	
	public Ex21_Phone(String onwer) {
		this.owner = owner;
	}
	
	void turnOn () {
		System.out.println("켭니다");
	}
	void turnOff () {
		System.out.println("끕니다");
	}
}

class SmartPhone extends Ex21_Phone {
	
	SmartPhone(String owner) {
		super(owner);
		
	}
	void internetSearch() {
		System.out.println("검색합니다.");
	
	}
	
}




