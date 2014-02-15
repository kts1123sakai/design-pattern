package proxy;

/**
 * クライアントから管理者への質問インタフェース
 * @author I.Sakai
 * @since 2013/02/23
 */
public interface Question {
	public String question(int genre, String question);
}
