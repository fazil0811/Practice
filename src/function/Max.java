package function;
public class Max {
	public void findmax(int[] a) {
		int temp=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>temp) {
				temp=a[i];
			}
		}
				System.out.println(temp);
	}
}
