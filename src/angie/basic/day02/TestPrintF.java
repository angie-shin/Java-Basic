package angie.basic.day02;

public class TestPrintF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double pi = 3.14;
		// 4개의 출력문을사용해서 메시지 출력
		System.out.print("x =");
		System.out.print(x);
		System.out.print(" and pi =");
		System.out.println(pi);

		// + 연산자를이용해서 2개의 출력문을 사용
		System.out.print("x =" + x);
		System.out.println(" and pi =" + pi);

		// printf의 메서드를이용해서 1개의 출력문을 사용
		// 형식지정자
		// %d: decimal 정수를 표기할 때 사용
		// %f: float 실수를표기할 때 사용
		// %c: character 문자 하나를 표기할 때 사용
		// %s: String 문자열을 표기할 때 사용
		System.out.printf("x =%d and pi = %f \n", x, pi);

		String fmt = "x =%d and pi = %f \n";
		System.out.printf(fmt, x, pi);

	}

}
