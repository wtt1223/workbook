package cc.workbook.example;

public class MultiTable {
	public void print() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				/*
				 * if(i==j) { System.out.println(String.format("%d ¡Á %d = %d", j, i, i * j)); }
				 * else { System.out.print(String.format("%d ¡Á %d = %-4d", j, i, i * j)); }
				 */
				System.out.print(String.format("%d ¡Á %d = %-4d", j, i, i * j));
			}
			System.out.println();
		}
	}
}