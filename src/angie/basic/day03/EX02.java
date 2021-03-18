package angie.basic.day03;

public class EX02 {

	public static void main(String[] args) {
		// 7번 문제

		// 논리연산: 주어진 논리식을 판단
		// 논리연산의 결과는도 true false 논리값(참, 거짓)으로 변환 {and or not}
		// 보통 2개 이상의 비교연산식으로 구성됨
		// 논리곱연산 : &, &&(short-circuit 지원)
		// 논리합연산 : |, ||
		// 논리부정연산 : !
		// 단축식 평가 short circut
		// 여러개의 논리식 중에 어떤 식에 의해 참 거짓이 확정되면
		// 나머지 온리식을 평가하지 않음

		// boolean result = (x > y) & (x != y);
		// System.out.println("(x > y) and (x ≠ y) " + result);

		double result;
		result = 3 + (4.5 * 2) + (27 / 8);
		System.out.println("3 + 4.5 * 2 + 27 / 8=" + result);

		boolean result1 = true || false && 3 < 4 || !(5 == 7);
		System.out.println("true || false && 3 < 4 || !(5 == 7) =" + result1);

		// System.out.println(!true>A); 잘못된 비교대상으로 오류

		result1 = true || (3 < 5 && 6 >= 2);
		System.out.println("true || (3 < 5 && 6 >= 2) =" + result1);
		String result2;

		result = (7 % 4) + 3 - (2 / 6) * 'Z';
		System.out.println("7 % 4 + 3 - 2 / 6 * 'Z' =" + result);
		// 자동형변환하면서 큰따옴표 문자열은 변환불가
		// 단일문자는 수식에 사용하면 자동으로 숫자형으로 바뀜 (char 작은따옴표만 가능)
		// ASCII code로 Z는 90, D: 68, M:77 이됨, O:48, A:65, a:97
		result = 'D' + 1 + ('M' % 2 / 3);
		System.out.println("'D' + 1 + 'M' % 2 / 3 =" + result);
		result = 5.0 / 3 + 3 / 3;
		System.out.println("5.0 / 3 + 3 / 3 =" + result);

		result1 = 53 % 21 < 45 / 18;
		System.out.println("53 % 21 < 45 / 18 =" + result1);
		result1 = (4 < 6) || true && false || false && (2 > 3);
		System.out.println("(4 < 6) || true && false || false && (2 > 3) =" + result1);
		result = 7 - (3 + 8 * 6 + 3) - (2 + 5 * 2);
		System.out.println("7 - (3 + 8 * 6 + 3) - (2 + 5 * 2) =" + result);

		// 8번 문제

		System.out.print(" May 13, 1988 fell on day number ");
		// 달력 날짜 만드는 법(특정연도-1의 12월 31일의 요일을 출력)
		// 0:일, 1:월, 2:화, 3:수, 4:목,5:금,6:토
		// 1월 1일의 요일은 계산식 결과에 +1을 해주면 됨
		// H:72, I:73 임, 145,151.5
		System.out.println(
				((13 + (13 * 3 - 1) / 5 + 2021 % 100 + 2021 % 100 / 4 + 2021 / 400 - 2 * (2021 / 100)) % 7 + 7) % 7);
		System.out.print(" Check out this line  ");
		System.out.println(" //hello there " + '9' + 7);
		System.out.print('H' + 'I' + " is " + 1 + "more example");
		System.out.print('H' + 6.5 + 'I' + " is " + 1 + "more example");
		System.out.print("Print both of us");
		System.out.print("Reverse " + 'I' + 'T');
		System.out.print("No! Here is" + 1 + "more example");
		System.out.println("Here is " + (10 * 10)); // that’s 100 ;
		System.out.println("Not x is " + true); // that’s true.
		System.out.print("Print both of us" + "Me too");
		// System.out.print(); 전달값이 없으면 실행 불가, 출력해 "무엇을" 이라고 이야기 해야하는 데
		// 출력할 대상이 없음

	}
}
