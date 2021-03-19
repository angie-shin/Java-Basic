package angie.basic.day04;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		// 조건문
		// 일반적으로 프로그램의 실행순서는 순차적임 sequence
		// 하지만 특수한 상황 발생시 선택적으로 코드를
		// 실행해야 할 필요가 생기는 데 이때 조건문으로 사용함

		// if
		// 조건식의 결과가 true와 false 일때
		// 각각 주어진 명령문을 실행함
		// if(조건식) {
		// 조건이 참일 떄 실행
		// } else{
		// 조건이 거짓일 떄 코드 실행
		// }

		// ex) 1-100사이 정수중 짝수를 출력하세요

		// for (int i = 1; i <= 100; ++i) {
		// if (i % 2 == 0)// i가 짝수라면
		// System.out.println(i + " ");

		// exercise 문항
		Scanner sc = new Scanner(System.in);
		int salary;
		int isMarried;
		double tax;

		System.out.print("연봉은? ");
		salary = sc.nextInt();
		System.out.println("결혼 여부는?(0-아니오,1-예) ");
		isMarried = sc.nextInt();

		if (isMarried == 0) {// 미혼
			if (salary < 3000) {
				tax = salary * 0.1;
			} else
				tax = salary * 0.25;
		} else// 기혼
		if (salary < 6000) {
			tax = salary * 0.15;
		} else
			tax = salary * 0.35;
		String fmt = "연봉은 %d만원이고, 결혼여부는 %d일때\n" + "세금은%.1f만원입니다";
		System.out.printf(fmt, salary, isMarried, tax);
	}
}
