package bridge;

/**
 * @author I.Sakai
 */
public class SqlMySqlImpl extends SqlImpl {

	@Override
	public String obtainTodayYearMonthDay() {
		return "DATE_FORMAT(now(),'%Y年%m月%d日')";
	}

	@Override
	public String replaceNull(String column, String value) {
		return "IFNULL(" + column + ", " + value + ")";
	}

}
