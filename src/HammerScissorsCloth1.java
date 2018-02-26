import java.util.Scanner;

public class HammerScissorsCloth1 {
	public static void main(String[] args) {
		int num = 0;// 总局数
		String a = "";// 代表甲的值
		String b = "";// 代表乙的值
		int win = 0;// win times
		int tie = 0;// tie times
		int lost = 0;// lost times
		int c_win = 0;
		int j_win = 0;
		int b_win = 0;
		int c_lost = 0;
		int j_lost = 0;
		int b_lost = 0;

		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		for (int i = 0; i < num; i++) {
			a = in.next();
			b = in.next();
			if (a.equals(b)) {
				tie++;
			} else {
				if (a.equals("C")) {
					if (b.equals("J")) {
						win++;
						c_win++;
					}
					if (b.equals("B")) {
						lost++;
						c_lost++;
					}
				}
				if (a.equals("J")) {
					if (b.equals("C")) {
						lost++;
						j_lost++;
					}
					if (b.equals("B")) {
						win++;
						j_win++;
					}
				}
				if (a.equals("B")) {
					if (b.equals("C")) {
						win++;
						b_win++;
					}
					if (b.equals("J")) {
						lost++;
						b_lost++;
					}
				}
			}

		}

		System.out.println(win + " " + tie + " " + lost);
		System.out.println(lost + " " + tie + " " + win);

		if (c_win > b_win && c_win > j_win) {
			System.out.print("C ");
		} else if (b_win > c_win && b_win > j_win) {
			System.out.print("B ");
		} else if (j_win > c_win && j_win > b_win) {
			System.out.print("J ");
		} else {
			if (b_win == c_win || b_win == j_win || (b_win == c_win && b_win == j_win)) {
				System.out.print("B ");
			} else if (c_win == j_win) {
				System.out.print("C ");
			}
		}

		if (c_lost > b_lost && c_lost > j_lost) {
			System.out.print("B");
		} else if (b_lost > c_lost && b_lost > j_lost) {
			System.out.print("J");
		} else if (j_lost > c_lost && j_lost > b_lost) {
			System.out.print("C");
		} else {
			if (c_lost == b_lost || c_lost == j_lost || (c_lost == b_lost && c_lost == j_lost)) {
				System.out.print("B");
			} else if (j_lost == b_lost) {
				System.out.print("C");
			}
		}
	}

}
