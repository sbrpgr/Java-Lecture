package mysql.customer2;

import java.time.LocalDate;

/**
 * DTO(Data Transfer Object)
 */
public class People {
	private String bname;
	private int bnumber;
	private String bpos;
	private LocalDate bir;
	private int h;
	
	People(){}
	
	People(String bname, int bnumber, String bpos, LocalDate bir, int h) {
		super();
		this.bname = bname;
		this.bnumber = bnumber;
		this.bpos = bpos;
		this.bir = bir;
		this.h = h;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getBnumber() {
		return bnumber;
	}

	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}

	public String getBpos() {
		return bpos;
	}

	public void setBpos(String bpos) {
		this.bpos = bpos;
	}

	public LocalDate getBir() {
		return bir;
	}

	public void setBir(LocalDate bir) {
		this.bir = bir;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	@Override
	public String toString() {
		return "People [bname=" + bname + ", bnumber=" + bnumber + ", bpos=" + bpos + ", bir=" + bir + ", h=" + h + "]";
	}
	
	
	
}