package for3;
public class Doubt {
	public static void main(String[] args) {
		String name="onesoft";
		char[] a=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			int count=0;
			for(int j=0;j<name.length();j++) {
				if(i!=j && a[i]==a[j]) {
					count=count+1;
				}
			}
			if(count>0 ) {
				System.out.println(a[i]);				
			}
		}
	}
}
