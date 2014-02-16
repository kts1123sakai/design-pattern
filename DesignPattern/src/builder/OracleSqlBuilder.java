package builder;

/**
 * Oracle対応SQL生成　実装クラス<br>
 * @author I.Sakai
 */
public class OracleSqlBuilder implements SqlBuilder {

	private static final String SELECT_FIELDS_SEPARATOR = ", ";

	private String sql;

	/**
	 * Constructor
	 */
	public OracleSqlBuilder() {
		this.sql = (new String());
	}

	@Override
	public OracleSqlBuilder select(String[] fields) {

		// 引数チェック
		validNullOrBlank(fields);

		// フィールド分割
		StringBuilder sb = new StringBuilder("SELECT ");
		for (String field : fields) {
			sb.append(field).append(SELECT_FIELDS_SEPARATOR);
		}

		// 不要箇所削除
		sb.delete(sb.length() - SELECT_FIELDS_SEPARATOR.length(), sb.length());
		sb.append(" ");

		sql += sb.toString();
		return this;
	}

	@Override
	public OracleSqlBuilder from(String table) {
		validNullOrBlank(table);
		sql += ("FROM " + table + " ");
		return this;
	}

	@Override
	public OracleSqlBuilder innerJoin(String table) {
		validNullOrBlank(table);
		sql += ("INNER JOIN " + table + " ");
		return this;
	}

	@Override
	public OracleSqlBuilder on(String condition) {
		validNullOrBlank(condition);
		sql += ("ON " + condition + " ");
		return this;
	}

	@Override
	public OracleSqlBuilder f(String field) {
		validNullOrBlank(field);
		sql += (field + " ");
		return this;
	}

	@Override
	public OracleSqlBuilder and(String field) {
		validNullOrBlank(field);
		sql += ("AND " + field + " ");
		return this;
	}

	@Override
	public OracleSqlBuilder or(String field) {
		validNullOrBlank(field);
		sql += ("OR " + field + " ");
		return this;
	}

	@Override
	public OracleSqlBuilder equal(String field) {
		validNullOrBlank(field);
		sql += ("= " + field + " ");
		return this;
	}

	@Override
	public OracleSqlBuilder notEqual(String field) {
		validNullOrBlank(field);
		sql += ("<> " + field + " ");
		return this;
	}

	@Override
	public OracleSqlBuilder where() {
		sql += "WHERE ";
		return this;
	}

	@Override
	public String build() {
		// ここで変数sqlの値をチェックするような処理を追加することで、エラーを発生させることも出来ます。
		return sql;
	}

	// ***** private *****
	/**
	 * validNullOrBlank<br>
	 * @param value String
	 */
	private void validNullOrBlank(String value) {
		if (null == value || 0 == value.length()) {
			throw new IllegalArgumentException("Argument is null or blank. [" + value + "]");
		}
	}

	/**
	 * validNullOrBlank<br>
	 * @param values String[]
	 */
	private void validNullOrBlank(String[] values) {
		if (null == values || 0 == values.length) {
			throw new IllegalArgumentException("Argument is null or blank. [" + values + "]");
		}
		for (String value : values) {
			validNullOrBlank(value);
		}
	}

	// getter
	public String getSql() {
		return sql;
	}
}
