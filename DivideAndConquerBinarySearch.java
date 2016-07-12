package uprajneniqOtKnijkata;

import java.util.Scanner;

public class DivideAndConquerBinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] mas = { 0, 1, 2, 3, 4 };
		System.out.println("koe 4islo 6te tursim ?");
		int el = sc.nextInt();
		int place = divideAndConqer(0, mas.length - 1, mas, el);
		if (place > 0 && place < mas.length) {
			System.out.println("elementa e na " + (place + 1) + " mqsto");
		} else {
			System.out.println("elementa ne e nameren");
		}

	}

	static int divideAndConqer(int left, int right, int[] mas, int elem) {
		int mid = (left + right) / 2;
		int result = -2;
		if (mas[left] == elem) {
			result = left;
		}
		if (mas[right] == elem) {
			result = right;
		}
		if (mas[mid] == elem) {
			result = mid;
		}
		if (mid == left || mid == right) {
			result = -1;
		}
		if (mas[mid] < elem && result == -2) {
			left = mid;
			result = divideAndConqer(left, right, mas, elem);
		}
		if (mas[mid] > elem && result == -2) {
			right = mid;
			result = divideAndConqer(left, right, mas, elem);
		}
		return result;
	}
}
