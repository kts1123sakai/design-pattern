package adapter.ext;

import java.math.BigDecimal;

import adapter.Circle;
import adapter.IfCircle;

/**
 * 新しく求められる円に関するインタフェースの実装クラス
 * @author I.Sakai
 */
public class CircleAdapter extends Circle implements IfCircle {

	/** 
	 * Constructor
	 * @param scale 丸めスケール
	 */
	public CircleAdapter(int scale) {
		super(scale);
	}
	
	/**
	 * @see adapter.IfCircle#calcArea(double)
	 */
	public double calcArea(double r) {
		return super.calcArea(BigDecimal.valueOf(r)).doubleValue();
	}

	/**
	 * @see adapter.IfCircle#calcVolume(double)
	 */
	public double calcVolume(double r) {
		return super.calcVolume(BigDecimal.valueOf(r)).doubleValue();
	}
}
