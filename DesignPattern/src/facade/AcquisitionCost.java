package facade;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 取得原価<br>
 * @author I.Sakai
 */
public class AcquisitionCost {

	private static Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
	static {
		map.put("AAA", BigDecimal.valueOf(111L));
		map.put("BBB", BigDecimal.valueOf(222L));
		map.put("CCC", BigDecimal.valueOf(333L));
	}

	public BigDecimal getCost(String itemName) {
		if (null == itemName || 0 == itemName.length()) {
			return null;
		}
		return map.get(itemName);
	}
}
