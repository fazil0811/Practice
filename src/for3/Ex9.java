package for3;
public class Ex9 {
	public static void main(String[] args) {
	int[] arr= {45,20,61,10,35,75,70};
	int firstmax=0;
	int secondmax=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>firstmax) {
			secondmax=firstmax;
			firstmax=arr[i];
		}
			else if(arr[i]>secondmax && arr[i]!=firstmax) {
				secondmax=arr[i];
			}
		}

	System.out.println(firstmax);
	System.out.println(secondmax);
	}
}
