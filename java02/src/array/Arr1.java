package array;

public class Arr1 {
	public static void main(String[] args) {
		// 배열 : 같은 주제의 변수들을 한곳으로 뭉쳐놓음
		
		// 정수형 배열 
		int numbers[] = {1,2,3,4};		// 정수변수 4개를 numbers로 뭉침
		
		// 실수형 배열
		double dnumbers[] = {1.1,2.2,3.3,4.4};
		
		// 문자형 배열
		String strs[] = {"안녕하세요", "반갑습니다", "감사해요", "잘있어요"};
		
		// 값을 넣진 않고, 공간만 만듦(기본값 또는 임의의값이 들어가 있음)
		int nums[] = new int[5];			// 정수변수 5개를 묶어서 만듦
		double dnums[] = new double[3];
		String ss[] = new String[4];
		
	}
}
