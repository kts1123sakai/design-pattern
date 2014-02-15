package strategy;

/**
 * @author I.Sakai
 */
public class Client {

	public static void main(String[] args) {

		// ソート対象配列
		int[] numbers = { 5, 7, 2, 6, 1, 3, 9, 4, 8 };

		// バブルソート
		System.out.println("バブルソート");

		MySort bubble = new MySort(new BubbleSort());
		int[] bubbleAnswer = bubble.sort(numbers);

		for (int num : bubbleAnswer) {
			System.out.print(num + "\t");
		}

		// マージソート
		System.out.println("\nマージソート");

		MySort marge = new MySort(new MargeSort());
		int[] margeAnswer = marge.sort(numbers);

		for (int num : margeAnswer) {
			System.out.print(num + "\t");
		}

		// クイックソート
		System.out.println("\nクイックソート");

		MySort quick = new MySort(new QuickSort());
		int[] quickAnswer = quick.sort(numbers);

		for (int num : quickAnswer) {
			System.out.print(num + "\t");
		}
	}
}
