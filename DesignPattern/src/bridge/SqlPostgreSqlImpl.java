package bridge;

/**
 * @author I.Sakai
 */
public class SqlPostgreSqlImpl extends SqlImpl {

	@Override
	public String obtainTodayYearMonthDay() {
		return "SELECT TO_CHAR(current_timestamp, 'yyyy/mm/dd')";
	}

	@Override
	public String replaceNull(String column, String value) {
		return "COALESCE(" + column + ", " + value + ")";
	}
}
