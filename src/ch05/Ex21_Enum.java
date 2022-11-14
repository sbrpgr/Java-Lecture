package ch05;

public class Ex21_Enum {
	public enum Week {mon, tue, wed, thu, fir, sat, sun};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = Week.thu;
		System.out.println(today.name());
		System.out.println(today.ordinal());
	}

}
