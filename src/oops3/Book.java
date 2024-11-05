package oops3;
public interface Book {
	public int displayPrice(int a);
	public String author(String a);
	public String publication(String a);
	public int publicationYear(int a);
}

class StoryBook implements Book {
	public int displayPrice(int a) {
		return a;
	}
	public String author(String a) {
		return a;
	}
	public String publication(String a) {
		return a;
	}
	public int publicationYear(int a) {
		return a;
	}
	public int price(int a) {
		return a;
	}
}
