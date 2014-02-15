package proxy;

/**
 * Proxyパターン(クライアント＝質問者)
 * @author I.Sakai
 */
public class Client {

	public static void main(String[] args) {
		
		Administrator sakai = new Administrator();
		
		System.out.println(
				sakai.question(Genre.COMMITTEE.getGenreCode(), "審査はいつですか？")
		);
		
		System.out.println(
		sakai.question(Genre.JAVA.getGenreCode(), 
				"Java SE 7 Update 2以降に標準搭載 されているRIAのGUIライブラリの名称は？")
		);
	}
}
