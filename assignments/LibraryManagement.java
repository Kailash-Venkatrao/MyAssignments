package week2.day1.assignments;

public class LibraryManagement {

	public static void main(String[] args) {
		Library LibOptions = new Library();
		String title = LibOptions.addBook("CHEMISTRY");
		System.out.println(title);
		LibOptions.issueBook();
	}
}
