package week2.day1.assignments;

public class Library {
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}

	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library BookOptions = new Library();
		String title = BookOptions.addBook("PHYSICS");
		System.out.println(title);
		BookOptions.issueBook();
	}
}
