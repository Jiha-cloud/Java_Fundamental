package java_20210507;

public class DescendingDemo {
	public int[] descending(int[] array) {
		int number;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					number = array[j];
					array[j] = array[i];
					array[i] = number;
				}
			}
		}
		return array;
	}
}
