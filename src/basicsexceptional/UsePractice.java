package basicsexceptional;

public class UsePractice {
	public static void main(String[] args) throws NoException {

		Practice p1 = new Practice("aaa", "2star", 20000, 0);

		Practice p2 = new Practice("bbb", "2star", 25000, 1);

		Practice p3 = new Practice("ccc", "3star", 30000, 2);

		Practice p4 = new Practice("ddd", "4star", 35000, 2);

		Practice p5 = new Practice("eee", "5star", 50000, 3);

		Practice[] f = { p1, p2, p3, p4, p5 };

		try {
			for (Practice x : f) {
				if (x.noWarranty > 0) {
					System.out.println("Warranty claim");
				} else {
					throw new NoException("Not claim");
				}
			}
		} catch (Exception aa) {
			System.out.println(aa.getMessage());
			aa.printStackTrace();
		}
	}
}