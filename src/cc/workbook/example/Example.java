package cc.workbook.example;

/**
 * ��ϰ��
 * 
 * @author wtt1223
 */
public class Example {
	/**
	 * �����
	 */
	public static void main(String[] args) {
		Exercises exercises = new HundredBucks();
		System.out.println(exercises.solution());

		exercises = new ChickenRabbitCages();
		System.out.println(exercises.solution());
	}

}
