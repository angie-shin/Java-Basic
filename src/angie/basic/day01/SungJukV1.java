package angie.basic.day01;

/**
 * 
 * @author angie
 * @category java basic
 * @version 1.0 자바프로그램 기초 - 성적 처리 프로그램 입력:이름,국어,영어,수학 처리:총점,평균,학점 출력:
 *          이름,국어,영어,수학,총점,평균,학점 단, 학점: 수우미양가, ABCDF
 */

public class SungJukV1 {

	public static void main(String[] args) {
		// 변수선언

		String name;
		int kor;
		int eng;
		int math;
		int tot;

		double avg;
		String grd;

		// 처리
		name = "홍길동";
		kor = 98;
		eng = 78;
		math = 91;
		tot = kor + eng + math;
		// avg=(kor+eng+math)/3;
		avg = tot / 3;
		grd = "";
		// 결과 처리
		System.out.print("이름: ");
		System.out.println(name);
		System.out.print("국어: ");
		System.out.println(kor);
		System.out.print("영어: ");
		System.out.println(eng);
		System.out.print("수학: ");
		System.out.println(math);

		System.out.print("총점: ");
		System.out.println(tot);
		System.out.print("평균: ");
		System.out.println(avg);
		System.out.print("학점: ");
		System.out.println(grd);

	}

}
