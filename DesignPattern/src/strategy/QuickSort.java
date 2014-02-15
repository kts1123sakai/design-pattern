package strategy;

/**
 * クイックソート(昇順)
 * @author I.Sakai
 */
public class QuickSort implements IfSort {

	public int[] sort(int[] datas) {
		return quickSort(datas, 0, datas.length - 1);
	}

	private int[] quickSort(int[] datas, int left, int right) {

		if (left <= right) {
			int p = datas[(left + right) / 2];
			int l = left;
			int r = right;

			while (l <= r) {
				while (datas[l] < p) {
					l++;
				}
				while (datas[r] > p) {
					r--;
				}

				if (l <= r) {
					int tmp = datas[l];
					datas[l] = datas[r];
					datas[r] = tmp;
					l++;
					r--;
				}
			}

			quickSort(datas, left, r);
			quickSort(datas, l, right);
		}

		return datas;
	}
}
