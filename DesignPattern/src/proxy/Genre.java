package proxy;

/**
 * ジャンルを示す列挙型
 * @author I.Sakai
 */
public enum Genre {

	COMMITTEE(1), JAVA(2);

	private int genreCode;

	private Genre(int genreCode) {
		this.genreCode = genreCode;
	}

	public int getGenreCode() {
		return genreCode;
	}
}
