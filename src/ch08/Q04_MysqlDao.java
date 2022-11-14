package ch08;

public class Q04_MysqlDao implements Q04_DataAccessObject {

	@Override
	public void select() {
		System.out.println("sql에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("sql에서 삽입");
	}

	@Override
	public void update() {
		System.out.println("sql에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("sql에서 삭제");
	}

}
