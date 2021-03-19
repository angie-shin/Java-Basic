package angie.basic.day04;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 칠단
		// 구구단 출력
//7단을 출력하세요 v2 for

		for (int i = 1; i <= 9; ++i) {
			System.out.println("7 x " + i + "=" + (7 * i));
		}

		System.out.println("----- -----");

		// 7단을 출력하세요 v3 while
		int h = 1;
		while (h <= 9) {
			System.out.println("7 x " + h + "=" + (h * 7));
			++h;
		}
		System.out.println("----- -----");
		String fmt = "7 x %d = %d\n";
		int i = 1;
		while (i <= 9) {
			System.out.printf(fmt, i, 7 * i);
			++i;
		}

		System.out.println("----- -----");

		h = 1;
		String kmt = "3 x %d = %d\n";
		while (h <= 9) {
			System.out.printf(kmt, h, (3 * h));
			++h;
		}

		Scanner sc = new Scanner(System.in);
		// 키보드를 이용해서 성적데이터를 입력받기 위해
		// Scanner 클래스를 초기화함

		System.out.println("출력할 구구단 단을 입력하시오 ");
		char dan2 = sc.next().charAt(0);
		// 입력받은 문자의 첫번째 글짜만 뽑아서
		// char 변수에 대입

		// 입력받은 문자의 ASCII 값이 49-57인지 검사
		String result = (dan2 >= 49 && dan2 <= 57) ? "구구단출력" : "잘못입력하셨습니다";
		System.out.println(result);

		System.out.println(dan2 + " " + (int) dan2);

		int dan = sc.nextInt();

		i = 1;
		kmt = "%d x %d = %2d\n";
		while (i <= 100) {
			System.out.printf(kmt, dan, i, (i + dan));
			++i;
			// 구구단 입력 프로그램 vs3

			System.out.println("출력할 구구단 단을 입력하시오 ");
			String dan3 = sc.next();

			i = 1;
			try {
				while (i <= 9) {
					System.out.printf(fmt, dan3, i, (Integer.parseInt(dan3 + i)));
					++i;
				}
			} catch (Exception ex) {
				System.out.println("잘못입력하셨습니다!");
				// 예외처리로 try catch 이용

				// ex) 주민번호를 통해서 성별을 출력할 수 있는 코드를 작성하세요
				// 주민번호 123456 - 1234567에서 7이 성별을 나타내는 코드
				// 1: 1999년 이전 출생한 남자
				// 2: 1999년 이전 출생한 여자
				// 3: 2000년 이후 출생한 남자
				// 4: 2000년 이후 출생한 여자

				System.out.println("주민번호를 입력하시오 ");
				String jumin = sc.next();
				char gender = jumin.charAt(7);
				result = (gender == '1') ? "1999 남자"
						: (gender == '2') ? "1999 여자" : (gender == '3') ? "2000 남자" : "2000 여자";
				System.out.println(result);

			}
		}
	}

}
