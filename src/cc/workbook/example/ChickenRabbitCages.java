package cc.workbook.example;

/**
 * ����ͬ�����й��Ŵ�����ѧ����֮һ�� ��Լ��1500��ǰ���������㾭���оͼ����������Ȥ�����⡣���������������ģ�
 * ��������ͬ����������ʮ��ͷ�����о�ʮ���㣬�����ø����Σ�
 * 
 * @author wtt1223
 */
public class ChickenRabbitCages extends ExercisesImpl {
	/**
	 * ͷ������
	 */
	private int headNum;
	/**
	 * �ŵ�����
	 */
	private int footNum;

	/**
	 * ���캯��
	 * 
	 * @param headNum ͷ������
	 * @param footNum �ŵ�����
	 */
	public ChickenRabbitCages(int headNum, int footNum) {
		super.title = "������ֻ����ͬ��һ�������������������35��ͷ��������������94ֻ�š������и��ж���ֻ�����ã�";

		this.headNum = headNum;
		this.footNum = footNum;
	}

	/**
	 * ���캯��
	 */
	public ChickenRabbitCages() {
		this(35, 94);
	}

	/**
	 * ��𣬲����ش��С��𣺡�����Ĳ���
	 */
	@Override
	public String answer() {
		int num = 0;
		StringBuffer buffer = new StringBuffer(String.format("���⹲��%d���⣬�ֱ�Ϊ��", num));
		buffer.append(String.format("����%dֻ������%dֻ��", 0, 0));
		return buffer.toString();
	}
}
