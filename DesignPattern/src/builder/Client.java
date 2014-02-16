package builder;

/**
 * 実行クラスサンプル<br>
 * @author I.Sakai
 */
public class Client {

	public static void main(String[] args) {
		String[] selectFields = { "XXX_TBL.AAA", "XXX_TBL.BBB", "YYY_TBL.CCC" };

		OracleSqlBuilder builder = new OracleSqlBuilder();
		System.out.println(builder
				.select(selectFields)
				.from("XXX_TBL")
					.innerJoin("YYY_TBL")
					.on("XXX_TBL.F_KEY").equal("YYY_TBL.KEY")
				.where()
					.f("XXX_TBL.1").equal("'1'")
					.and("XXX_TBL.2").notEqual("'2'")
					.or("YYY_TBL.3").notEqual("3")
				.build());
	}
}
