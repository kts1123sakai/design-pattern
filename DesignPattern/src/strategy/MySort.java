package strategy;

/**
 * ifSortオブジェクトへの参照を保持するコンテキスト
 * @author I.Sakai
 */
public class MySort {

	IfSort ifSort;

	public MySort(IfSort ifSort) {
		this.ifSort = ifSort;
	}

	public int[] sort(int[] datas) {
		return ifSort.sort(datas);
	}
}
