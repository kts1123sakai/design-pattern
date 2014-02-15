package adapter;

import java.math.BigDecimal;

/**
 * 円に関するクラス(厳密な計算を行う)
 * @author I.Sakai
 */
public class Circle {

	/** 円周率 */
	private static final BigDecimal PI = new BigDecimal("3.14");

	private int scale;

	/**
	 * Constructor
	 * @param scale 丸めスケール
	 */
	public Circle(int scale) {
		this.scale = scale;
	}

	/**
	 * 円の面積を算出.<br>
	 * πr^2<br>
	 * @param r 円の半径
	 * @return 円の面積
	 */
	public BigDecimal calcArea(BigDecimal r) {
		BigDecimal temp = PI.multiply(r).multiply(r);
		return temp.setScale(scale, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * 球の体積を算出.<br>
	 * (4/3)πr^3<br>
	 * @param r 円の半径
	 * @return 円の体積
	 */
	public BigDecimal calcVolume(BigDecimal r) {

		// 定数部算出
		BigDecimal constant = new BigDecimal("4").divide(new BigDecimal("3"), scale, BigDecimal.ROUND_HALF_UP);

		// 変数部算出
		BigDecimal variable = PI.multiply(r).multiply(r).multiply(r);

		// 定数部と変数部を乗算
		BigDecimal temp = constant.multiply(variable);

		// 丸めスケールを指定した値を返す
		return temp.setScale(scale, BigDecimal.ROUND_HALF_UP);
	}
}

