package function;
public class Task {
	public String findmax(String x) {
		String[] names=x.split(" ");
		String a="";
		for(int i=names.length-1;i>=0;i--) {
			if(i%2==0) {
			a=a+names[i].toUpperCase()+ " ";
			}
			else {
				a=a+names[i]+" ";
			}
		}
		return a;
	}
}