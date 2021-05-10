package java_20210507;

public class AscendingDemo {
	public int[] ascending(int[] array) {
		int number;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					number = array[j];
					array[j] = array[i];
					array[i] = number;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		AscendingDemo a = new AscendingDemo();
		int[] test = { 10, 15, 20, 19, 17 };
		int[] testAscending = a.ascending(test);
		for (int i = 0; i < test.length; i++) {
			System.out.printf("%d \n", testAscending[i]);
		}
	}
}
