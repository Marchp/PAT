import java.util.Arrays;
import java.util.Scanner;

/*������һ����λ���ֲ���ȫ��ͬ��4λ����������������Ȱ�4�����ְ��ǵ��������ٰ��ǵݼ�����Ȼ���õ�1�����ּ���2�����֣����õ�
һ���µ����֡�һֱ�ظ������������Ǻܿ��ͣ���С����ֺڶ���֮�Ƶ�6174��������������Ҳ��Kaprekar������
���磬���Ǵ�6767��ʼ�����õ�
7766 - 6677 = 1089
9810 - 0189 = 9621
9621 - 1269 = 8352
8532 - 2358 = 6174
7641 - 1467 = 6174
... ...
�ָ�������4λ�����������д������ʾ����ڶ��Ĺ��̡�
��������:
�������һ��(0, 10000)�����ڵ�������N��
�������:
���N��4λ����ȫ��ȣ�����һ���������N - N = 0000�������򽫼����ÿһ����һ���������ֱ��6174��Ϊ����֣������ʽ������,ÿ���м�û�п��С�ע��ÿ�����ְ�4λ����
ʽ�����
��������:
6767
�������:
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