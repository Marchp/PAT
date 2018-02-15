import java.util.Scanner;

/**
 * ����A+B ��Ŀ���� ������A�ġ�DA��Ϊ1λ���������֡�����Ϊ��A������DA��ɵ�������PA�� ���磺����A = 3862767��DA =
 * 6����A�ġ�6���֡�PA��66����ΪA����2��6�� �ָ���A��DA��B��DB�����д�������PA + PB�� ��������:
 * ������һ�������θ���A��DA��B��DB���м��Կո�ָ�������0 < A, B < 1010�� �������: ��һ�������PA + PB��ֵ�� ��������:
 * 3862767 6 13530293 3 �������: 399
 *
 * @author Marchp
 * @date 2018/2/16
 */
public class PartAPlusB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int a = s.nextInt();
		int B = s.nextInt();
		int b = s.nextInt();

		int PA = getPartNumber(A, a);
		int PB = getPartNumber(B, b);
		System.out.println(PA + PB);

	}

	public static int getPartNumber(int num, int D) {
		int P = 0;
		int count = 0;
		while (num > 0) {
			if (num % 10 == D) {
				count++;
			}
			num = num / 10;
		}

		if (count > 0) {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < count; i++) {
				builder.append(D);
			}
			P = Integer.parseInt(builder.toString());
		}
		return P;
	}

}
