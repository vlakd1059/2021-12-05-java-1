package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) { //¦���� �״�� ���� ��
					arr[i][j] = value;
				}
				else { //Ȧ���� �������� ����
					arr[i][(arr[i].length-1)-j]=value; // �������� �ø���
				}
				value++;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+"\t"); // \t: ���� ��
			}
			System.out.println();
		}

	}

}
