package angie.basic.day01;

public class ClassEX01 {
	public static void main(String[] args) {
		// 1.
		// ->, >= cascadia code font
		System.out.println("*   *    **    ****    ****  *   *    /////");
		System.out.println("*   *   *  *   *   *   *   * *   *   | 0 0 |");
		System.out.println("*****  *    *  ****    ****   * *   (|  ^  |)");
		System.out.println("*   *  ******  *   *   *   *   *     | [_] |");
		System.out.println("*   *  *    *  *    *  *    *  *      -----");

		System.out.println("              +---+");
		System.out.println("              |   |");
		System.out.println("          +---+---+");
		System.out.println("          |   |   |");
		System.out.println("      +---+---+---+        /\\_/\\     -----");
		System.out.println("      |   |   |   |       ( ' ' )   /Hello\\");
		System.out.println("  +---+---+---+---+       (  -  ) < Junior |");
		System.out.println("  |   |   |   |   |        | | |    \\Coder!/");
		System.out.println("  +---+---+---+---+       (__|__)    ------");

		// 3.
		int rate1;
		// int 1st player; 숫자
		// int myprogram.java; //사용가능 기호는 "_" 또는 "$"
		// int long; 변수는 않됨
		int TimeLimit;// 변수명은 소문자 시작 권장
		int numberOfWindows;// 가능

		// 4.
		// 표현식: expression
		// 계산이나 처리를 위해 작성하는 식을 의미
		// 수학에서 말하는 수식과 유사
		// 표현식의 중요한 특징은 평가 evaluate 임
		// 즉, 코드의 결과를 알아내는 과정을 의미
		int x, y, z, s, s0, v, t, g;

		x = 10;
		y = 20;
		z = 30;
		s0 = 5;
		t = 10;
		v = 15;
		g = 20;

		int result;

		result = 3 * x;// 3x
		System.out.print("3x =");
		System.out.println(result);
		result = (3 * x) + y;
		System.out.print("3x+y=");
		System.out.println(result);
		result = (x + y) / 7;
		System.out.print("x+y/7=");
		System.out.println(result);
		result = (3 * x + y) / (z + 2);
		System.out.print("(3x+y)/(z+2)=");
		System.out.println(result);
		result = s0 + (v * t) + (1 / 2) * g * (t ^ 2);
		System.out.print("s0+vt+(1/2)gt^2 =");
		System.out.println(result);
		// 5.
		double number = (1 / 3) * 3;
		System.out.println("(1 / 3) * 3 =" + number);
		// 수식이 서로 다른 종류의 값을 사용할 때, double은 문자형으로 변환됨 -> 묵시적 형변환
		// 예상값 :1 실제감 0.0
		// '정수 나누기 정수'의 결과값은 정수이기 때문!
		int quotient = 7 / 3;
		System.out.println("7 / 3 =" + quotient);
		int remainder = 7 % 3;
		System.out.println("7 % 3 =" + remainder);
		result = 11;
		result /= 2;
		System.out.println("result/ 2 =" + result);
		// 복합대입 연산자
		// 산술연산자와 대입연산자를 합쳐놓은 연산자
		// ex) a = a + 1 => a += 1

		// 6.
		double xx = 2.5;
		double yy = 1.5;
		int m = 18;
		int n = 4;

		double result2 = xx + (n * yy) - (xx + n) * yy;
		// double 이유는 정확한 결과값을 생성하기 위해서는 변수 type값을 맞춰줘야 함
		// 자동형 변환: 작은 크기의 자료형은 큰 크기의 자료형으로 자동 변환 (promotion)
		// 강제형 변환: 예) 정수 나누기 정수의 경우 정확한 결과를 위해 변수를 바꿔주는 경우
		// Java is a strongly typed language
		// Python is a dynamic typed language

		System.out.println("x + n * y - ( x + n ) * y =" + result2);
		result2 = (m / n) + (m % n);
		System.out.println("m / n + m % n =" + result2);
		result2 = (5 * xx) - (n / 5);
		System.out.println("5 * x -n / 5 =" + result2);
		result2 = 1 - (1 - (1 - (1 - (1 - n))));
		System.out.println("1-(1-(1-(1-(1-n))))=" + result2);

	}
}
