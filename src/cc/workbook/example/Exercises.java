package cc.workbook.example;

/**
 * 练习题
 * 
 * @author wtt1223
 */
public interface Exercises {
	/**
	 * 获取题目信息
	 */
	String getTitle();

	/**
	 * 解答，并返回答案中“答：”后面的部分
	 */
	String answer();

	/**
	 * 答案（答：……）
	 */
	String solution();
}