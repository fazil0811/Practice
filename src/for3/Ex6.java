package for3;
public class Ex6 {
	public static void main(String[] args) {
		String name="program";
		char[] a=name.toCharArray();
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]='$';
					count=count+1;					
				}
			}
			if(count==0 && a[i]!='$') {
				System.out.println(a[i]);				
			}
		}
	}

}
