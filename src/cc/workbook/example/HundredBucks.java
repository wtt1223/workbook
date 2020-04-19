package cc.workbook.example;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 我国古代数学家张丘建在《算经》一书中曾提出过著名的“百钱买百鸡”问题，该问题叙述如下：鸡翁一，值钱五；鸡母一，值钱三；鸡雏三，值钱一；百钱买百鸡，则翁、母、雏各几何？
 * 
 * @author wtt1223
 */
public class HundredBucks extends ExercisesImpl {
	/**
	 * 公鸡价格
	 */
	private float cockPrice;
	/**
	 * 母鸡价格
	 */
	private float henPrice;
	/**
	 * 小鸡价格
	 */
	private float chickenPrice;

	/**
	 * 构造函数
	 * 
	 * @param cockPrice    公鸡价格
	 * @param henPrice     母鸡价格
	 * @param chickenPrice 小鸡价格
	 */
	public HundredBucks(float cockPrice, float henPrice, float chickenPrice) {
		super.title = "公鸡一个五块钱，母鸡一个三块钱，小鸡三个一块钱，现在要用一百块钱买一百只鸡，问公鸡、母鸡、小鸡各多少只？";

		this.cockPrice = cockPrice;
		this.henPrice = henPrice;
		this.chickenPrice = chickenPrice;
	}

	/**
	 * 构造函数
	 */
	public HundredBucks() {
		this(5, 3, 0.33f);
	}

	/**
	 * 解答，并返回答案中“答：”后面的部分
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
		StringBuffer buffer = new StringBuffer(String.format("本题共有%d个解，分别为：", list.size()));
		for (Map.Entry<Integer, Integer> entry : list) {
			buffer.append(String.format("公鸡%d只，母鸡%d只，小鸡%d只；", entry.getKey(), entry.getValue(),
					100 - entry.getKey() - entry.getValue()));
		}
		return buffer.toString();
	}
}
