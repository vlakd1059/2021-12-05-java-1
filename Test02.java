package �ڹ��׽�Ʈ;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("���� >> ");
		int[][] arr = new int[5][5];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("90�� ȸ�� >> ");
		int[][] arr2 = new int[5][5];
		int num1 = 5;
		int num2 = 1;
		for (int a = 0, k = 1; a < 5; a++, k++) {
			num2 = num1 * k; // a=0,1,2,3,4 ������ ������ ���� ���ϱ�
			for (int b = 0; b < 5; b++) {
				arr2[b][a] = num2--; // ���η� ���� �ٿ�
			}

		}
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 5; b++) {
				System.out.print(arr2[a][b] + "\t");
			}
			System.out.println();
		}

	}

}
