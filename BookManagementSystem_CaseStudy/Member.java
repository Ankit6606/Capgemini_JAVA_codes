package BookManagementSystem_CaseStudy;

public class Member extends Person {
	
	public Member(int id, String name) {
		super(id, name);
	}

	@Override
	public void showRole() {
		System.out.println("Library Member");
	}
}
