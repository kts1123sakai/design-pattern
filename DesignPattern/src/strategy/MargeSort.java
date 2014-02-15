package strategy;

/**
 * マージソート(昇順)
 * @author I.Sakai
 */
public class MargeSort implements IfSort {

	public int[] sort(int[] datas) {

		if (datas.length > 1) {
			int m = datas.length / 2;
			int n = datas.length - m;
			int[] a1 = new int[m];
			int[] a2 = new int[n];
			for (int i = 0; i < m; i++) {
				a1[i] = datas[i];
			}
			for (int i = 0; i < n; i++) {
				a2[i] = datas[m + i];
			}
			sort(a1);
			sort(a2);
			merge(a1, a2, datas);
		}

		return datas;
	}

	private void merge(int[] a1, int[] a2, int[] a) {
		int i = 0, j = 0;
		while (i < a1.length || j < a2.length) {
			if (j >= a2.length || (i < a1.length && a1[i] < a2[j])) {
				a[i + j] = a1[i];
				i++;
			} else {
				a[i + j] = a2[j];
				j++;
			}
		}
	}
}
