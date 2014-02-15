package bridge;

/**
 * @author I.Sakai
 */
public abstract class SqlImpl {
	public abstract String obtainTodayYearMonthDay();
	public abstract String replaceNull(String column, String value);
}
