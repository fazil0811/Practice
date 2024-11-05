package function;
public class UseSum {
	public static void main(String[] args) {
		Sum s1=new Sum();
		System.out.println(s1.findmax(4.5f, 2.5f, 2.9f, 1.8f));
		System.out.println(s1.findmax(43.55f, 22.35f, 72.99f, 61.28f));
	}
}