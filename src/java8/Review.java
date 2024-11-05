package java8;

public class Review {

	public static void main(String[] args) {

		Rev r = Review::findMileage;

		int mileage = r.findMileage(100);
		System.out.println(mileage);
	}

	public static int findMileage(int mileage) {
		return mileage;
	}
}

interface Rev {
	int findMileage(int mileage);
}
