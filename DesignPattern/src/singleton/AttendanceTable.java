package singleton;

/**
 * 出欠表
 * @author I.Sakai
 */
public class AttendanceTable {

	private static AttendanceTable instance = new AttendanceTable(); //★自身のインスタンスを生成

	private String name;
	private boolean isPresence; // true:出席 false:欠席

	/**
	 * Constructor
	 */
	private AttendanceTable() {
		// ★privateコンストラクタにすることで、インスタンスの生成を阻止する
	}

	// ★唯一のインスタンスを返す
	public static AttendanceTable getInstance() {
		return instance;
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPresence() {
		return isPresence;
	}

	public void setPresence(boolean isPresence) {
		this.isPresence = isPresence;
	}
}
