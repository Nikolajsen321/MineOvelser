package Sorting.src.sortering;

public class InsertionSortering {

	public static void insertioneSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int currentElement = list[i];
			int j = i;
			boolean found = false;
			while (!found && j > 0) {
				if (currentElement >= list[j - 1]) {
					found = true;
				} else {
					list[j] = list[j - 1];
					j--;
				}
			}
			list[j] = currentElement;
		}
	}

}
