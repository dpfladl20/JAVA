package array;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		
	// 국가와 수도 (5개)
	/*
	 대한민국의 수도는 서울입니다
	 일본의 수도는 도쿄입니다
	 중국의 수도는 베이징입니다
	 미국의 수도는 워싱턴입니다
	 러시아의 수도는 모스크바입니다
	 */
		String nation[] = {"대한민국","일본","중국","미국","러시아"};
		String country[] = new String[5];
	
		country[0] = "서울";
		country[1] = "도쿄";
		country[2] = "베이징";
		country[3] = "워싱턴";
		country[4] = "모스크바";
	
		for(int i = 0; i <nation.length; i++) {
			System.out.println(nation[i]+"의 수도는 "+country[i]+"입니다");
		}
	
		// 사용자 입력으로 국가를 받아서
		// 해당 국가의 수도를 알려주는 프로그램을 만들어보세요
		/*
		 수도를 알고자하는 국가의 이름을 입력하세요 >>
		 대한민국 ==> 서울
		 일본 ==> 도쿄
		 */
		// 같은 문자열을 찾으면 해당 i(방번호)를 백업
		// 백업한 방번호를 통해서 수도를 출력
		
		Scanner sc = new Scanner(System.in);
		String user_input = "";
		int bk_index = -1;
		System.out.println("수도를 알고자 하는 국가의 이름을 입력하세요>> ");
		user_input = sc.next();
		
		// 해당하는 위치를찾는다
		for(int i = 0; i<nation.length; i++) {
			if(user_input.equals(nation[i])) {
				bk_index = 1;
			}
		}
		if(bk_index == -1) {
			//못찾았다
			System.out.println("해당 국가가 없습니다");
			// 찾았으니깐 값이 변경되었겠지
			System.out.println(nation[bk_index]+"의 수도는 "+country[bk_index]+"입니다");
		}
	}	
}
