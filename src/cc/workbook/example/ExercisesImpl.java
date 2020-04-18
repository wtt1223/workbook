package cc.workbook.example;

/**
 * 练习题
 */
public abstract class ExercisesImpl implements Exercises {
	/**
	 * 练习题题目：
	 */
	public String title;

	/**
	 * 获取题目信息
	 */
	public String getTitle() {
		return "题目：" + this.title;
	}

	/**
	 * 解答，并返回答案中“答：”后面的部分
	 */
	public String answer() {
		return "本题无解.";
	}

	/**
	 * 答案（答：……）
	 */
	public String solution() {
		return String.format("%d\n答：%s\n\n", getTitle(), answer());
	}
}
