
public class Miin_max {

	public static void main(String[] args) {
		
		int a, b, c, d, e;
		a = 8;
		b = 8;
		c = 8;
		d = 8;
		e = 8;
		int max = 0;
		int min = 0;	
		
	if (a >= b && a >= c && a >= d && a >= e) {
		max = a;
	}
	else if (b >= a && b >= c && b >= d && b >= e) {
			max = b;
		} 
		else if (c >= a && c >= b && c >= d && c >= e) {
				max = c;
			}
			else if (d >= a && d >= b && d >= c && d >= e) {
					max = d;
				}
				else if (e >= a && e >= b && e >= d && e >= c) {
						max = e;
				}
	
	if (a <= b && a <= c && a <= d && a <= e) {
		min = a;
	}
	else if (b <= a && b <= c && b <= d && b <= e) {
			min = b;
		} 
		else if (c <= a && c <= b && c <= d && c <= e) {
				min = c;
			}
			else if (d <= a && d <= b && d <= c && d <= e) {
					min = d;
				}
				else if (e <= a && e <= b && e <= d && e <= c) {
						min = e;
				}
	if (min == max) {
		System.out.println(max);
	}
	else {
		System.out.println(max);
		System.out.println(min);
	}
	}
}