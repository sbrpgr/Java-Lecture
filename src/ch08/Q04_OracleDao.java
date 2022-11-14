package ch08;

public class Q04_OracleDao implements Q04_DataAccessObject {

	@Override
	public void select() {
		System.out.println("오라클에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("오라클에서 삽입");
	}

	@Override
	public void update() {
		System.out.println("오라클에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("오라클에서 삭제");
	}

}
