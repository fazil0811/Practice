package For2PrimitiveArray;
public class Max {
	public static void main(String[] args) {
		int[] nums=new int[5];
		nums[0]=10;
		nums[1]=26;
		nums[2]=54;
		nums[3]=24;
		nums[4]=25;
		int max=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=max) {
				max=nums[i];
			}
		}
		System.out.println(max);
	}
}


