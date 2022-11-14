package ch06;

public class Ex12_Main {

	public static void main(String[] args) {
		Ex12_Car car = new Ex12_Car();
		car.company = "현대자동차";
		car.color = "은색";
		car.model = "아이오닉6";
		car.maxSpeed = 200;
		
		System.out.println(car.company + ","+ car.model);
		System.out.println(car);
		
		Ex12_Car bus = new Ex12_Car();
		bus.company = "기아자동차";
		bus.model = "리무진";
		bus.color = "핑크";
		bus.maxSpeed = 180;
		bus.printField();
		System.out.println(bus.toString());
	}

}
