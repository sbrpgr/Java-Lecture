package mysql.kbo;

import java.time.LocalDate;

public class Player {
	private int backNo;
	private String name;
	private Position position;
	private LocalDate birthDay;
	private int height;
	private int isDeleted;
	
	Player() {}
	Player(int backNo, String name, String position, String birthDay, int height, int isDeleted) {
		this.backNo = backNo;
		this.name = name;
		this.position = Position.valueOf(position);
		this.birthDay = LocalDate.parse(birthDay);
		this.height = height;
		this.isDeleted = isDeleted;
	}
	Player(int backNo, String name, Position position, LocalDate birthDay, int height, int isDeleted) {
		this.backNo = backNo;
		this.name = name;
		this.position = position;
		this.birthDay = birthDay;
		this.height = height;
		this.isDeleted = isDeleted;
	}
	
	@Override
	public String toString() {
		return "Player [" + backNo + ", " + name + ", " + position + ", " + birthDay
				+ ", " + height+ ", " + isDeleted + "]";
	}
	public int getBackNo() {
		return backNo;
	}
	public void setBackNo(int backNo) {
		this.backNo = backNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
}