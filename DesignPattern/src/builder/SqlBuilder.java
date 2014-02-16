package builder;

/**
 * 
 * SQL生成インタフェース<br>
 * @author I.Sakai
 */
public interface SqlBuilder {

	public SqlBuilder select(String[] fields);

	public SqlBuilder from(String table);
	public SqlBuilder innerJoin(String table);
	public SqlBuilder on(String condition);
	
	public SqlBuilder f(String field);
	public SqlBuilder and(String field);
	public SqlBuilder or(String field);
	
	public SqlBuilder equal(String field);
	public SqlBuilder notEqual(String field);

	public SqlBuilder where();
	
	public String build();

}
