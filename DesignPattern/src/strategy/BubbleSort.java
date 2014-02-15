package strategy;

/**
 * バブルソート(昇順)
 * @author I.Sakai
 */
public class BubbleSort implements IfSort {

	public int[] sort(int[] datas) {

		for (int i = 0; i < datas.length - 1; i++) {
			for (int j = 0; j < datas.length - i - 1; j++) {
				if (datas[j] > datas[j + 1]) {
					int temp = datas[j];
					datas[j] = datas[j + 1];
					datas[j + 1] = temp;
				}
			}
		}

		return datas;
	}
}
