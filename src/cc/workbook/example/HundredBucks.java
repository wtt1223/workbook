package cc.workbook.example;

/**
 * �ҹ��Ŵ���ѧ�������ڡ��㾭��һ����������������ġ���Ǯ��ټ������⣬�������������£�����һ��ֵǮ�壻��ĸһ��ֵǮ������������ֵǮһ����Ǯ��ټ������̡�ĸ���������Σ�
 * 
 * @author wtt1223
 */
public class HundredBucks extends ExercisesImpl {
	/**
	 * �����۸�
	 */
	private float cockPrice;
	/**
	 * ĸ���۸�
	 */
	private float henPrice;
	/**
	 * С���۸�
	 */
	private float chickenPrice;

	/**
	 * ���캯��
	 * 
	 * @param cockPrice    �����۸�
	 * @param henPrice     ĸ���۸�
	 * @param chickenPrice С���۸�
	 */
	public HundredBucks(float cockPrice, float henPrice, float chickenPrice) {
		super.title = "����һ�����Ǯ��ĸ��һ������Ǯ��С������һ��Ǯ������Ҫ��һ�ٿ�Ǯ��һ��ֻ�����ʹ�����ĸ����С��������ֻ��";

		this.cockPrice = cockPrice;
		this.henPrice = henPrice;
		this.chickenPrice = chickenPrice;
	}

	/**
	 * ���캯��
	 */
	public HundredBucks() {
		this(5, 3, 0.33f);
	}

	/**
	 * ��𣬲����ش��С��𣺡�����Ĳ���
	 */
	@Override
	public String answer() {
		int num = 0;
		StringBuffer buffer = new StringBuffer(String.format("���⹲��%d���⣬�ֱ�Ϊ��", num));
		buffer.append(String.format("����%dֻ��ĸ��%dֻ��С��%dֻ��", 0, 0, 0));
		return buffer.toString();
	}
}
