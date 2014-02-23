package facade;

import java.math.BigDecimal;

/**
 * アイテム名を渡すだけで低価法ロジックを実行してくれるFacadeクラス<br>
 * @author I.Sakai
 */
public class SampleFacade {

	public BigDecimal calc(String itemName) {

		// 取得原価
		AcquisitionCost costClass = new AcquisitionCost();
		BigDecimal acquisitionCost = costClass.getCost(itemName);

		// 時価
		MarketValue valueClass = new MarketValue();
		BigDecimal marketValue = valueClass.getValue(itemName);

		if (null == acquisitionCost && null == marketValue) {
			throw new IllegalArgumentException("そのアイテムは、取得原価、時価ともに登録されていません。");
		} else if (null == acquisitionCost || null == marketValue) {
			return (null == acquisitionCost) ? marketValue : acquisitionCost;
		} else {
			LowerOfCostOrMarket lowerClass = new LowerOfCostOrMarket();
			return lowerClass.getPrice(acquisitionCost, marketValue);
		}
	}
}
