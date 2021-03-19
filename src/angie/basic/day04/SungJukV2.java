package angie.basic.day04;

//성적처리프로그램 v2
//반복문을 이용해서 성적데이터 입력을 계속 수행함

import java.util.Scanner;

public class SungJukV2 {

	public static void main(String[] args) {
		// 변수선언

		String name; // 이름
		int kor, eng, math; // 국어점수
		int tot; // 총점
		double avg; // 평균
		char grd; // 학점
		String fmt = "%s, %d, %d, %d\n" + "%d, %.1f, %c \n";

		// 처리
		int i = 1;
		// 조건식을 true로 설정하면
		// 끝없이 코드를 계속 실행함 while(true)
		while (i <= 3) {
			Scanner sc = new Scanner(System.in);
			// 키보드를 이용해서 성적데이터를 입력받기 위해
			// Scanner 클래스를 초기화함

			System.out.print("이름은? ");
			name = sc.next();
			// 키보드로 문자데이터를 입력받아 name 변수에 대입
			System.out.print("국어는? ");
			kor = sc.nextInt();
			// 키보드로 숫자데이터를 입력받아 kor 변수에 대입
			System.out.print("영어는? ");
			eng = sc.nextInt();
			System.out.print("수학은? ");
			math = sc.nextInt();

			// 총점 평균,학점 처리
			tot = kor + eng + math;
			// avg=(kor+eng+math)/3;
			avg = (double) tot / 3;
			grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';

			System.out.printf(fmt, name, kor, eng, math, tot, avg, grd);
			System.out.println("----- -----");
			++i;
		} // while문의 가로

	}// main의 가로

}// class의 가로

// do while is not very important, but it is used, when condition is false
// with the do code, you can run the code at least once
//초기식
//while(조건식) {
//반복코드
//증감식
//}
//조건식이 처음부터 false면 while은 코드를 반복실행하지 않음
//반면, do while문은 일단 코드를 먼저 실행하고 
//조건을 검사하기 때문에
//조건식이 false라도 최소 한번정도는 코드를 실행할 수 있음
