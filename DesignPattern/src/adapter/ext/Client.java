package adapter.ext;

import java.math.BigDecimal;

import adapter.Circle;
import adapter.IfCircle;

/**
 * 継承を利用したAdapterパターン
 * @author I.Sakai
 */
public class Client {

	public static void main(String[] args) {

		IfCircle circleAdapter = new CircleAdapter(10);
		System.out.println("新しいインタフェース(円の面積): " + circleAdapter.calcArea(6.6666d));
		System.out.println("新しいインタフェース(球の体積): " + circleAdapter.calcVolume(6.6666d));

		Circle circleAdaptee = new Circle(10);
		System.out.println("古いインタフェース(円の面積)	: " + circleAdaptee.calcArea(BigDecimal.valueOf(6.6666d)));
		System.out.println("古いインタフェース(球の体積)	: " + circleAdaptee.calcVolume(BigDecimal.valueOf(6.6666d)));
	}
}
