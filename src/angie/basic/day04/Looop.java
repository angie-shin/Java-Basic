package angie.basic.day04;

public class Looop {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {

			System.out.println(i + " ");
			i += 1;
		}

		// ex) 1-50까지 홀수를 출력하는 코드 v2 - 반복문 사용 0

		int b = 1;
		while (b <= 50) {

			System.out.println(b + " ");
			b += 2;// 증감식
		}

		System.out.println(" ");// 줄바꿈용 코드

		int c = 2;
		while (c <= 50) {

			System.out.println(c + " ");
			c += 2;
		}

		System.out.println(" ");

		// ex) 1-100까지 합을 출력하는 코드 v2 - 반복문 사용 0
		int sum = 0;
		int a = 1;

		while (a <= 100) {
			sum += a;
			a++;

		}
		System.out.println("1~100 사이 합 :" + sum);

		i = 1;
		int j = 100;
		sum = (i + j) * j / 2;
		System.out.println("1~100 사이 합 :" + sum);
	}
//가오스 덧셈 공식
	// 특정범위 내 모든 수의 합을 편리하게 구할 수 있으며
	// 종합 sum, 시작범위: i 끝범위 j
	// sum = (i+j)*j/2
	// sum = (i+j) * (j-i+1)/2;

}
