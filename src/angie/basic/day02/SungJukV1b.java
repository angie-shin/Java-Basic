package angie.basic.day02;

import java.util.Scanner;

/**
 * 
 * @author angie
 * @category java basic
 * @version 1.0 자바프로그램 기초 - 성적 처리 프로그램 입력: 이름과 성적데이터를 키보드로 직접 입력받아 결정
 */

public class SungJukV1b {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//변수선언
		String name; // 이름
		int kor; // 국어점수
		int eng; // 영어점수
		int math; // 수학점수
		int tot; // 총점
		double avg; // 평균
		char grd; // 학점

		// 처리
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

		// 총점 평균 처리
		tot = kor + eng + math;
		// avg=(kor+eng+math)/3;
		avg = tot / 3;
		if (avg >= 90) {
			grd = 'A';
		} else if (avg >= 80) {
			grd = 'B';
		} else if (avg >= 70) {
			grd = 'C';
		} else if (avg >= 60) {
			grd = 'D';
		} else {
			grd = 'F';
		}
		System.out.println("총점 =" + tot);
		System.out.println("평균 =" + avg);
		System.out.println("학점 =" + grd);

		// 출력
		// 이름: ??, 국어:??, 영어:??,수학:??
		// 총점: ??, 평균:??, 학점:??
		System.out.printf("이름은? %s 국어는? %d 영어는? %d 수학은? %d\n", name, kor, eng, math);
		System.out.printf("총점: %d 평균:%f, 학점:%c", tot, avg, grd);
		// 다른방식
		String fmt = "이름은? %s 국어는? %d 영어는? %d 수학은? %d\n";
		System.out.printf(fmt, name, kor, eng, math);
		String fmt = "총점: %d 평균:%f, 학점:%c\n";
		System.out.printf(fmt, tot, avg, grd);
	}

}
