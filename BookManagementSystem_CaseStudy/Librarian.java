package BookManagementSystem_CaseStudy;

public class Librarian extends Person{

	public Librarian(int id, String name) {
		super(id, name);
	}
	
	@Override
	public void showRole() {
		System.out.println("Librarian");
	}
}
