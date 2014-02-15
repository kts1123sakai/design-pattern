package proxy;

/**
 * 委員会クラス
 * @author I.Sakai
 */
public class Committee implements Question {

	@Override
	public String question(int genre, String question) {

		if (Genre.COMMITTEE.getGenreCode() == genre) {

			return "○年○月に審査が行われる予定になっています。";

		} else {

			throw new IllegalArgumentException("担当委員会にお問い合わせください。");
		}
	}

}
