
public class Operators {

	public static void main(String[] args) {
		int a, b, c, d;
		a = 5;
		b = 5;
		c = 5;
		d = 5;
		int biggest_one = 0;
		int big_number = 0;
		if (a == 0 && b == 0 && c == 0 && d == 0) {
			System.out.println("Все по 0");
		}
			else if (a >= b &&  a >= c && a >= d) {
				biggest_one = a;
			}
				else if (b >= a && b >= c && b >= d) {
					biggest_one = b;
				}
					else if (c >= a && c >= b && c >= d) {
						biggest_one = c;
					}
						else if (d >= a && d >= b && d >= c) {
							biggest_one = d;
						}
			System.out.println("Самое большое число " + biggest_one);
		if (biggest_one == a) {
			big_number = big_number +1;
		}
		if (biggest_one == b) {
			big_number = big_number +1;
		}
		if (biggest_one == c) {
			big_number = big_number +1;
		}
		if (biggest_one == d) {
			big_number = big_number +1;
		}
		System.out.println ("Самое большое число повторяется " + big_number + " раза");
	}
}
					
	

