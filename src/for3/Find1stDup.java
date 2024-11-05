package for3;

public class Find1stDup {
	public static void main(String[] args) {
		String a = "rajkumar";
		char[] b = a.toCharArray();
		
		for(int i = 0; i < b.length; i++) {
			int count = 0;
			for(int j = i+1; j < b.length; j++) {
				if(b[i] == b[j]) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println(b[i]);
				break;
			}
		}
	}

}
