package For2PrimitiveArray;
public class MinEnhanced {
	public static void main(String[] args) {
		int[] nums=new int[5];
		nums[0]=10;
		nums[1]=26;
		nums[2]=54;
		nums[3]=24;
		nums[4]=5;
		int min=nums[0];
		for(int x:nums) {
			if(x<=min) {
				min=x;
			}
		}
		System.out.println(min);
	}
}


