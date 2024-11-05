package oops3;

public class UseBook {
	public static void main(String[] args) {
		Book b = new StoryBook();
		System.out.println(b.displayPrice(300));
		System.out.println(b.author("fazil"));
		System.out.println(b.publication("xxx"));
		System.out.println(b.publicationYear(2024));
	}

}
