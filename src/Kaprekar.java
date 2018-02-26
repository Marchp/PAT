import java.util.Arrays;
import java.util.Scanner;

/*给定任一个各位数字不完全相同的4位正整数，如果我们先把4个数字按非递增排序，再按非递减排序，然后用第1个数字减第2个数字，将得到
一个新的数字。一直重复这样做，我们很快会停在有“数字黑洞”之称的6174，这个神奇的数字也叫Kaprekar常数。
例如，我们从6767开始，将得到
7766 - 6677 = 1089
9810 - 0189 = 9621
9621 - 1269 = 8352
8532 - 2358 = 6174
7641 - 1467 = 6174
... ...
现给定任意4位正整数，请编写程序演示到达黑洞的过程。
输入描述:
输入给出一个(0, 10000)区间内的正整数N。
输出描述:
如果N的4位数字全相等，则在一行内输出“N - N = 0000”；否则将计算的每一步在一行内输出，直到6174作为差出现，输出格式见样例,每行中间没有空行。注意每个数字按4位数格
式输出。
输入例子:
6767
输出例子:
7766 - 6677 = 1089
9810 - 0189 = 9621
9621 - 1269 = 8352
8532 - 2358 = 6174
*/
public class Kaprekar {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Integer number = in.nextInt();
		in.close();
		int[] numberArray = new int[4];
		Integer sum = 0;

		if (number % 1111 == 0) {
			System.out.printf("%04d - %04d = %04d\n", number, number, 0);
		} else {
			while (sum != 6174) {
				int temp = number;
				numberArray[0] = temp / 1000;
				numberArray[1] = (temp / 100) % 10;
				numberArray[2] = (temp / 10) % 10;
				numberArray[3] = temp % 10;
				Arrays.sort(numberArray);
				int little = numberArray[0] * 1000 + numberArray[1] * 100 + numberArray[2] * 10 + numberArray[3];
				int big = numberArray[3] * 1000 + numberArray[2] * 100 + numberArray[1] * 10 + numberArray[0];
				sum = big - little;
				System.out.printf("%04d - %04d = %04d\n", big, little, sum);
				number = sum;
			}
		}
	}
}