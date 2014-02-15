package bridge;

/**
 * 機能拡張したクラス
 * @author I.Sakai
 */
public class ExtSql extends Sql {
	
	/** 
	 * Constructor<br>
	 * ここで親クラスに抽象クラスを渡す<br>
	 * @param impl
	 */
	public ExtSql(SqlImpl impl) {
		super(impl);
	}
	
	public String add(String column, String value) {
		return obtainTodayYearMonthDay() + " ADD " + replaceNull(column, value);
	}
}
