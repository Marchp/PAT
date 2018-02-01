import java.util.Scanner;

public class DateTime {
	private final static String[] DAY = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		String str3 = in.nextLine();
		String str4 = in.nextLine();
		int len1 = Math.min(str1.length(), str2.length());
		int len2 = Math.min(str3.length(), str4.length());
		boolean flag = true;
		for (int i = 0; i < len1; i++) {
			char c = str1.charAt(i);
			if (flag && c >= 'A' && c <= 'G') {
				if (c == str2.charAt(i)) {
					flag = !flag;
					System.out.print(DAY[c - 65] + " ");
				}
			} else if (!flag && c == str2.charAt(i)) {
				if (c >= '0' && c <= '9') {
					System.out.print("0" + c + ":");
					break;
				} else if (c >= 'A' && c <= 'N') {
					System.out.print((c - 55) + ":");
					break;
				}
			}
		}
		for (int i = 0; i < len2; i++) {
			char c = str3.charAt(i);
			if (c >= 'a' && c <= 'z' && c == str4.charAt(i)) {
				if (i < 10)
					System.out.print("0" + i);
				else
					System.out.print(i);
				break;
			}
		}
		in.close();
	}
}
