package adapter.ijyo;

import java.math.BigDecimal;

import adapter.Circle;
import adapter.IfCircle;

/**
 * 新しく求められる円に関するインタフェースの実装クラス
 * @author I.Sakai
 */
public class CircleAdapter implements IfCircle {

	// Oldクラス
	private Circle circle;

	/**
	 * Constructor
	 * @param scale 丸めスケール
	 */
	public CircleAdapter(int scale) {
		// Oldクラスのインスタンス生成
		circle = new Circle(scale);
	}

	public double calcArea(double r) {
		return circle.calcArea(BigDecimal.valueOf(r)).doubleValue();
	}

	/**
	 * @see adapter.IfCircle#calcVolume(double)
	 */
	public double calcVolume(double r) {
		return circle.calcVolume(BigDecimal.valueOf(r)).doubleValue();
	}
}
