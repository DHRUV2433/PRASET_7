//This program is run by Dhruv Vekariya(21CE152)
public class Practical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1,10,23,18,19,50,0,14,89};
		System.out.println("Unsorted Array : ");
		for (Integer b : a) {
			System.out.println(b);
		}
		System.out.println("Sorted Array : ");
		for (Integer c : sort(a)) {
			System.out.println(c);
		}
		System.out.println("This program is run by Dhruv Vekariya(21CE152)");
	}
	static <T extends Comparable<T>> T[] sort(T[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int max = 0;
			for (int j = 1; j <= i; j++) {
				if (array[j].compareTo(array[max]) > 0) {
					max = j;
				}
			}
			T temp = array[max];
			array[max] = array[i];
			array[i] = temp;
		}
		return array;
	}
}