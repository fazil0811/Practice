package basicsexceptional;

public class Ex6 {
	public static void main(String[] args) {
		Ton t = new Ton();
		System.out.println(t.getStack());
	}
}

class Ton {
	public String getStack() {
		System.out.println(getStack());
		return "hi";
	}
}