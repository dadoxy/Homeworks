import java.util.Arrays;

public class UniqueStackInt {

	private int[] array;

	public UniqueStackInt() {

		this.array = new int[0];
	}

	public void push(int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				System.out.println("Error");
			} else {
				array = Arrays.copyOf(array, array.length + 1);
				array[array.length - 1] = value;
			}
		}
	}

	public int pop() {
		int temp = array[array.length - 1];
		array = Arrays.copyOf(array, array.length - 1);
		return temp;
	}

	public boolean isIncreasing() {
		boolean temp = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < array[i + 1]) {
				temp = true;
			} else
				temp = false;
		}
		return temp;
	}
}
