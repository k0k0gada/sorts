package uprajneniqOtKnijkata;

public class CountingSortDemo {
	public static void main(String[] args) {
		int[] arr = { 13, 33, 15, 23, 3, };
		countingSort(arr);
		System.out.println("sorted");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int[] arr2 = { 2, 3, 4, 2, 1, 2, 3, 2, 2, 3, 4, 2, 5, 2 };
		countingSort2(arr2);
		System.out.println("\nsorted2");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

	static void countingSort(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		int[] arrHelp = new int[(max - min) + 1];
		for (int i = 0; i < arr.length; i++) {
			arrHelp[arr[i] - min]++;
		}
		int ind = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arrHelp[ind] == 0) {// ako nqma nito edno takova 4islo
				ind++;// otivame na sledva6toto
				i--;// mahame edno i,za6otto gore 6te se uveli4i
				continue;
			}
			for (int j = 0; j < arrHelp[ind]; j++) {// ako ima takiva 4isla
				arr[i] = ind + min;// arr[i] vzima cifrata
				i++;// i se uveli4ava
			}
			ind++;
			i--;// i go namalqvam 6oto i gore 6te se uveli4i
		}
	}

	static void countingSort2(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		int[] arrHelp = new int[(max - min) + 1];
		for (int i = 0; i < arr.length; i++) {
			arrHelp[arr[i] - min]++;
		}
		int ind = 0;
		for (int i = 0; i < arrHelp.length; i++) {
			int counter = arrHelp[i];
			for (int j = 0; j < counter; j++) {
				arr[ind] = (i+min);
				ind++;

			}
		}
	}
}
