package 자바테스트;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) { //짝수면 그대로 숫자 업
					arr[i][j] = value;
				}
				else { //홀수면 역순으로 하향
					arr[i][(arr[i].length-1)-j]=value; // 역순으로 올리기
				}
				value++;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+"\t"); // \t: 수평 탭
			}
			System.out.println();
		}

	}

}
