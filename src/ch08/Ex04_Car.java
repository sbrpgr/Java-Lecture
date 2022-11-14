package ch08;

public class Ex04_Car implements Ex04_Vehicle {

	@Override
	public void run() {
		System.out.println("차량이 달립니다.");
	}

}

class Ex04_Bus implements Ex04_Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
}

class  Ex04_Taxi implements Ex04_Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
}