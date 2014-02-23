package facade;

import java.math.BigDecimal;

/**
 * 低価法<br>
 * @author I.Sakai
 */
public class LowerOfCostOrMarket {

	/**
	 * 低価法: 取得原価と時価を比較し、低い方を採用する資産評価<br>
	 * @param acquisitionCost 取得原価
	 * @param marketValue 時価
	 * @return BigDecimal
	 */
	public BigDecimal getPrice(BigDecimal acquisitionCost, BigDecimal marketValue) {
		return (0 > acquisitionCost.compareTo(marketValue) ? acquisitionCost : marketValue);
	}
}
