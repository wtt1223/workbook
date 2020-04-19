package cc.workbook.example;

import java.util.ArrayList;
import java.util.List;

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
		super.title = String.format("������ֻ����ͬ��һ�������������������%d��ͷ��������������%dֻ�š������и��ж���ֻ�����ã�", headNum, footNum);

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
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= headNum; i++) {
			if (2 * i + (headNum - i) * 4 != footNum) {
				continue;
			}
			list.add(i);
		}

		StringBuffer buffer = new StringBuffer(String.format("���⹲��%d���⣬�ֱ�Ϊ��", list.size()));
		for (int num : list) {
			buffer.append(String.format("����%dֻ������%dֻ��", num, headNum - num));
		}

		return buffer.toString();
	}
}
