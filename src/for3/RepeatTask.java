package for3;

public class RepeatTask {
	
	public static void main(String[] args) {
		
		String a="fazil";
		
		char[] b=a.toCharArray();
		
		int repeated=0;
		int nonrepeated=0;
		
		for(int i=0;i<a.length();i++) {
			int count=0;
			for(int j=0;j<a.length();j++) {
				if(i!=j && b[i]==b[j]) {
					count++;
				}
			}
			if(count>0) {
				repeated++;
			}
			else {
				nonrepeated++;
			}
		}
		System.out.println(repeated);
		System.out.println(nonrepeated);
	}
}
