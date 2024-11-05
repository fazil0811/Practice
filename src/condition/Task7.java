package condition;
public class Task7 {
	public static void main(String[] args) {
		int mark1=60;
		int mark2=70;
		int mark3=80;
		int mark4=90;
		if(mark1>mark2&&mark1>mark3&&mark1>mark4) {
			System.out.println(mark1+" is higher");
		}
		else if(mark2>mark1&&mark2>mark3&&mark2>mark4) {
			System.out.println(mark2+" is higher");
		}
		else if(mark3>mark1&&mark3>mark2&&mark3>mark4) {
			System.out.println(mark3+" is higher");
		}
		else if(mark4>mark1&&mark4>mark2&&mark4>mark3) {
			System.out.println(mark4+" is higher");
		}
		
		}
	}

