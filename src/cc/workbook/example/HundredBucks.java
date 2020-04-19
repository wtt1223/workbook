package cc.workbook.example;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>();
		for (int i = 0; i <= Math.floor(100 / cockPrice); i++) {
			for (int j = 0; j <= Math.floor(100 / henPrice); j++) {
				if (Math.ceil(cockPrice * i + henPrice * j + chickenPrice * (100 - i - j)) != 100
						|| (100 - i - j) % 3 != 0) {
					continue;
				}
				list.add(new AbstractMap.SimpleEntry<Integer, Integer>(i, j));
			}
		}
		StringBuffer buffer = new StringBuffer(String.format("���⹲��%d���⣬�ֱ�Ϊ��", list.size()));
		for (Map.Entry<Integer, Integer> entry : list) {
			buffer.append(String.format("����%dֻ��ĸ��%dֻ��С��%dֻ��", entry.getKey(), entry.getValue(),
					100 - entry.getKey() - entry.getValue()));
		}
		return buffer.toString();
	}
}
