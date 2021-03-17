package angie.basic.day02;

public class Calculation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 8.
		double result;
		result = 3 + (4.5 * 2) + (27 / 8);
		System.out.println("3 + 4.5 * 2 + 27 / 8=" + result);
		boolean result1;
		result1 = true || false && 3 < 4 || !(5 == 7);
		System.out.println("true || false && 3 < 4 || !(5 == 7) =" + result1);
		result1 = true || (3 < 5 && 6 >= 2);
		System.out.println("true || (3 < 5 && 6 >= 2) =" + result1);
		String result2;
		result2 = !true > 'A';
		System.out.println("!true > 'A' =" + result2);
		result = (7 % 4) + 3 - (2 / 6) * 'Z';
		System.out.println("7 % 4 + 3 - 2 / 6 * 'Z' =" + result);
		result = 'D' + 1 + ('M' % 2 / 3);
		System.out.println("'D' + 1 + 'M' % 2 / 3 =" + result);
		result = 5.0 / 3 + 3 / 3;
		System.out.println("5.0 / 3 + 3 / 3" + result);

		result1 = 53 % 21 < 45 / 18;
		System.out.println("53 % 21 < 45 / 18 =" + result1);
		result1 = (4 < 6) || true && false || false && (2 > 3);
		System.out.println("(4 < 6) || true && false || false && (2 > 3) =" + result1);
		result = 7 - (3 + 8 * 6 + 3) - (2 + 5 * 2);
		System.out.println("7 - (3 + 8 * 6 + 3) - (2 + 5 * 2) =" + result);

	}

}
