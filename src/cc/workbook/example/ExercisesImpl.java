package cc.workbook.example;

/**
 * ��ϰ��
 */
public abstract class ExercisesImpl implements Exercises {
	/**
	 * ��ϰ����Ŀ��
	 */
	public String title;

	/**
	 * ��ȡ��Ŀ��Ϣ
	 */
	public String getTitle() {
		return "��Ŀ��" + this.title;
	}

	/**
	 * ��𣬲����ش��С��𣺡�����Ĳ���
	 */
	public String answer() {
		return "�����޽�.";
	}

	/**
	 * �𰸣��𣺡�����
	 */
	public String solution() {
		return String.format("%s\n��%s\n", getTitle(), answer());
	}
}
