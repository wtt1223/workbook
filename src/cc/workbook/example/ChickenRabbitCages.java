package cc.workbook.example;

/**
 * 鸡兔同笼是中国古代的数学名题之一。 大约在1500年前，《孙子算经》中就记载了这个有趣的问题。书中是这样叙述的：
 * 今有雉兔同笼，上有三十五头，下有九十四足，问雉兔各几何？
 * 
 * @author wtt1223
 */
public class ChickenRabbitCages extends ExercisesImpl {
	/**
	 * 头的总数
	 */
	private int headNum;
	/**
	 * 脚的总数
	 */
	private int footNum;

	/**
	 * 构造函数
	 * 
	 * @param headNum 头的总数
	 * @param footNum 脚的总数
	 */
	public ChickenRabbitCages(int headNum, int footNum) {
		super.title = "有若干只鸡兔同在一个笼子里，从上面数，有35个头，从下面数，有94只脚。问笼中各有多少只鸡和兔？";

		this.headNum = headNum;
		this.footNum = footNum;
	}

	/**
	 * 构造函数
	 */
	public ChickenRabbitCages() {
		this(35, 94);
	}

	/**
	 * 解答，并返回答案中“答：”后面的部分
	 */
	@Override
	public String answer() {
		int num = 0;
		StringBuffer buffer = new StringBuffer(String.format("本题共有%d个解，分别为：", num));
		buffer.append(String.format("鸡有%d只，兔有%d只；", 0, 0));
		return buffer.toString();
	}
}
