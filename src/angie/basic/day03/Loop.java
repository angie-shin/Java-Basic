package angie.basic.day03;

public class Loop {

	public static void main(String[] args) {
		// 반복문 Loop
		// 프로그램내에서 똑같은 명령을 지정한 횟수만큼
		// 반복하여 수행하도록 작성하는 명령문
		// 사용빈도가 높은 명령어들 중 하나
		// for(횟수 지정후 반복), while(특정 조건을 만족할 때 까지 반복)=> 자주 쓰는 반복 변수

		// 인사말 출력 v1 - 1번만 출력
		System.out.println("Hello World");

		// 인사말 출력 v2 -3번만 출력
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");

		// 인사말 출력 v2.5 -5번 출력
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");

		// 인사말 출력 vs3 -대상변경후 5번 출력
		// World -> Java
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");

		// 반복횟수에 따라 코드를 복붙하기에 번거롭고
		// 반복하는 내용이 바뀌면 수정하기도 번거롭고 귀찮음

		// for 문
		// 초기식, 조건식, 증감식을 이용해서 특정코드를
		// 지정한 횟수만큼 반복하도록 작성하는 명령문
		// for(초기식;조건식;증감식) {
		// 반복할 코드
		// }
		// ex) 1-10까지 정수를 출력하는 코드 v1 - 반복문 사용 X

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);

		// ex) 1-10까지 정수를 출력하는 코드 v2 - 반복문 사용 0
		// for (int i = 1; i <= 10;++i) 로도 표현 가능
		for (int i = 1; i <= 10; i += 1) {
			System.out.println(i);
		}

		// ex) 1-50까지 홀수를 출력하는 코드 v2 - 반복문 사용 0

		for (int b = 1; b <= 50; b += 2) {
			System.out.print(b + " ");
		}
		System.out.println(" ");
		for (int b = 2; b <= 50; b += 2) {
			System.out.print(b + " ");
		}
		System.out.println(" ");

		// ex) 1-100까지 합을 출력하는 코드 v2 - 반복문 사용 0
		int sum = 0;
		for (int a = 1; a <= 100; ++a) {
			sum += a;
		}
		System.out.println("1~100 사이 합 :" + sum);

		// ex)1~100사이에 종합 구해서 출력 v2
		// 가우스 덧셈공식 이용

	}

}
