package bridge;

/**
 * @author I.Sakai
 */
public class Sql {

	private SqlImpl impl;

	public Sql(SqlImpl impl) {
		this.impl = impl;
	}

	public String obtainTodayYearMonthDay() {
		return impl.obtainTodayYearMonthDay();
	}

	public String replaceNull(String column, String value) {
		return impl.replaceNull(column, value);
	}
}
