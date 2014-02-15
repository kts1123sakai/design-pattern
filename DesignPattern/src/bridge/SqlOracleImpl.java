package bridge;

/**
 * @author I.Sakai
 */
public class SqlOracleImpl extends SqlImpl {

	@Override
	public String obtainTodayYearMonthDay() {
		return "SELECT TO_CHAR(hire_date,'yyyy/mm/dd') FROM dual";
	}

	@Override
	public String replaceNull(String column, String value) {
		return "NVL(" + column + ", " + value + ")";
	}

}
