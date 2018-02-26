import java.math.BigInteger;
import java.util.Scanner;

/**
 * A����B ��Ŀ���� ����Ҫ�����A/B������A�ǲ�����1000λ����������B��1λ�������� ����Ҫ�������Q������R��ʹ��A = B * Q + R������
 * ��������: ������1�������θ���A��B���м���1�ո�ָ��� �������: ��1�����������Q��R���м���1�ո�ָ��� ��������:
 * 123456789050987654321 7 �������: 17636684150141093474 3
 *
 * @author Marchp
 * @date 2018/2/19
 */
public class ADividedB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigInteger a = s.nextBigInteger();
		BigInteger b = s.nextBigInteger();

		System.out.println(a.divide(b) + " " + a.remainder(b));

	}

}
