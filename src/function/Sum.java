package function;
public class Sum {
	public float findmax(float a, float b, float c,float d) {
		if(a>b && a>c && a>d) {
			return(a);
		}
		else if(b>a && b>c && b>d) {
			return(b);
		}
		else if(c>a && c>b && c>d) {
			return(c);
		}
		else {
			return(d);
		}
	}
}