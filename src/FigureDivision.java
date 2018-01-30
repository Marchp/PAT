import java.text.DecimalFormat;
import java.util.Scanner;

public class FigureDivision {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0;
		boolean b1 = false, b2 = false, b3 = false, b4 = false, b5 = false;
		int[] a = new int[n];
		int factor = 1;
		int k = 0;
		String c4 = "";
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			switch (a[i] % 5) {
			case 0:
				if (a[i] % 2 == 0) {
					a1 += a[i];
					b1 = true;
				}
				break;
			case 1:
				a2 += a[i] * factor;
				factor = -factor;
				b2 = true;
				break;
			case 2:
				a3++;
				b3 = true;
				break;
			case 3:
				a4 += a[i];
				k++;
				b4 = true;
				break;
			case 4:
				if (a5 < a[i]) {
					a5 = a[i];
					b5 = true;
				}
				break;
			}
		}
		if (b1)
			System.out.print(a1 + " ");
		else
			System.out.print("N ");
		if (b2)
			System.out.print(a2 + " ");
		else
			System.out.print("N ");
		if (b3)
			System.out.print(a3 + " ");
		else
			System.out.print("N ");
		if (b4) {
			c4 = new DecimalFormat("0.0").format(a4 * 1.0 / k);
			System.out.print(c4 + " ");
		} else
			System.out.print("N ");
		if (b5)
			System.out.print(a5);
		else
			System.out.print("N");
	}
}
