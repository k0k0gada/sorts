package uprajneniqOtKnijkata;

import java.util.Arrays;

public class bubbleSortDemo {
	public static void main(String[] args) {
		// �������� ����� � �����
		int[] num = { 6, 82, 12, 1, 4, 59, -32, 61 };
		bubbleSort(num);
		// ��������� ���������� �����
		System.out.println(Arrays.toString(num));
		}//�����,

//	����� ��
//	������� �������
//	���� ��������� �����

	public static void bubbleSort(int[] num) {
		// ��������� ������� ����, ������� �� ����������
		for (int i = 0; i < num.length; i++) {
				// �� ������ �� ������������� �������
			for (int j = 0; j < num.length - 1; j++) {
			// ���������� ������� ������� ��� ���������
				// ��� �� �� � ���������� ����������������, �� ���������
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
	}

}
