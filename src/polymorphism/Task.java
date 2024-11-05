package polymorphism;
public class Task {
	public int findmax(String a,String b ) {
		if(a.length()>b.length()) {
		return a.length();
		}
		else {
			return b.length();
		}
	}
		public int findmax(int a,int b) {
			if(a>b) {
				return a;
			}
			else {
				return b;
		}
	}

}
