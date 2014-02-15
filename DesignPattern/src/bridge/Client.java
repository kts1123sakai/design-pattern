package bridge;

/**
 * Bridgeパターン
 * @author I.Sakai
 */
public class Client {

	public static void main(String[] args) {

		SqlMySqlImpl mySql = new SqlMySqlImpl();
		SqlOracleImpl oracle = new SqlOracleImpl();
		SqlPostgreSqlImpl postgreSql = new SqlPostgreSqlImpl();

		System.out.println("***** 今日の日付を求めるSELECT文 *****");
		System.out.println("MySQL		: " + mySql.obtainTodayYearMonthDay());
		System.out.println("ORACLE		: " + oracle.obtainTodayYearMonthDay());
		System.out.println("PostgreSQL	: " + postgreSql.obtainTodayYearMonthDay());

		System.out.println("\n***** Nullの場合に置換するSQL *****");
		System.out.println("MySQL		: " + mySql.replaceNull("DESIGN_PATTERN", "2"));
		System.out.println("ORACLE		: " + oracle.replaceNull("DESIGN_PATTERN", "2"));
		System.out.println("PostgreSQL	: " + postgreSql.replaceNull("DESIGN_PATTERN", "2"));

		System.out.println("\n***** 機能拡張したクラス *****");
		ExtSql ext = new ExtSql(mySql);
		System.out.println("MySQL		: " + ext.add("DESIGN_PATTERN", "2"));

		ext = new ExtSql(oracle);
		System.out.println("ORACLE		: " + ext.add("DESIGN_PATTERN", "2"));

		ext = new ExtSql(postgreSql);
		System.out.println("PostgreSQL	: " + ext.add("DESIGN_PATTERN", "2"));
	}
}
