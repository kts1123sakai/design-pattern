package facade;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 時価<br>
 * @author I.Sakai
 */
public class MarketValue {

	private static Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
	static {
		map.put("AAA", BigDecimal.valueOf(999L));
		map.put("BBB", BigDecimal.valueOf(888L));
		map.put("CCC", BigDecimal.valueOf(777L));
	}

	public BigDecimal getValue(String itemName) {
		if (null == itemName || 0 == itemName.length()) {
			return null;
		}
		return map.get(itemName);
	}
}
