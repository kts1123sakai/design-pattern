package proxy;

/**
 * 管理者クラス
 * @author I.Sakai
 */
public class Administrator implements Question {

	private static Question committee = new Committee();

	@Override
	public String question(int genre, String question) {

		if (Genre.COMMITTEE.getGenreCode() == genre) {

			// 委員会に回答を依頼します
			return committee.question(genre, question);

		} else if (Genre.JAVA.getGenreCode() == genre) {

			// 管理者が回答します
			return "JavaFXです。";

		} else {

			throw new IllegalArgumentException("そのジャンルは未実装です。");
		}
	}
}
