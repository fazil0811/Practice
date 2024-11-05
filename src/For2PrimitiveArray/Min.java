package For2PrimitiveArray;
public class Min {
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		int min=nums[0];
		for(int i=nums.length-1;i>=0;i--) {
			if(nums[i]<=min) {
				min=nums[i];
			}
		}
		System.out.println(min);
	}
}
