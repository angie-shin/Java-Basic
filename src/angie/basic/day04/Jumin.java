package angie.basic.day04;

import java.util.Scanner;

public class Jumin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하시오 ");
		String jumin = sc.next();
		char gender = jumin.charAt(7);
		String result;
		result = (gender == '1') ? "1999 남자" : (gender == '2') ? "1999 여자" : (gender == '3') ? "2000 남자" : "2000 여자";
		System.out.println(result);
	}

}
