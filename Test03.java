package 자바테스트;

public class Test03 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		char ch = 'A';
		for (int i = 0; i < 5; i++) {
			if (i <= 2) {
				for (int j = i; j <= 4 - i; j++) {
					arr[i][j] = ch++;// ?
				}
			} else {
				for (int j = 4 - i; j <= i; j++) {
					arr[i][j] = ch++;// ?
				}
			}

		}
		// 출력문
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2c", arr[i][j], "\t");// 문자로 출력, \t: 수평 탭
			}
			System.out.println();
		}

	}

}
