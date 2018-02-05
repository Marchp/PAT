import java.util.Scanner;
import java.util.TreeSet;

/**
 * �²��� ��Ŀ���� �δ�ʷѧ��˾����ڡ�����ͨ��������һ�������ġ��²��ۡ������ǹʲŵ�ȫ��ν֮ʥ�ˣ��ŵ¼���ν֮���ˣ�
 * ��ʤ��ν֮���ӣ���ʤ��ν֮С�ˡ���ȡ��֮����������ʥ�ˣ����Ӷ���֮�������С�ˣ����������ˡ��� �ָ���һ�������ĵ²ŷ����������˾�������۸���¼ȡ������
 * ��������: �����1�и���3�����������ֱ�Ϊ��N��<=105����������������L��>=60����Ϊ¼ȡ��ͷ����ߣ����·�
 * �Ͳŷ־�������L�Ŀ��������ʸ񱻿���¼ȡ��H��<100����Ϊ����¼ȡ�ߡ����·ֺͲŷ־������ڴ��ߵı�
 * ����Ϊ���ŵ�ȫ���������࿼�����²��ִܷӸߵ������򣻲ŷֲ������·ֵ��ߵ�һ�࿼�����ڡ���ʤ�š���
 * Ҳ���ܷ����򣬵����ڵ�һ�࿼��֮�󣻵²ŷ־�����H�����ǵ·ֲ����ڲŷֵĿ������ڡ��ŵ¼���������
 * �С���ʤ�š��ߣ����ܷ����򣬵����ڵڶ��࿼��֮�������ﵽ�����L�Ŀ���Ҳ���ܷ����򣬵����ڵ���
 * �࿼��֮�����N�У�ÿ�и���һλ��������Ϣ��������׼��֤�š��·֡��ŷ֣�����׼��֤��Ϊ8λ������ �²ŷ�Ϊ����[0,100]�ڵ����������ּ��Կո�ָ���
 * �������: �����1�����ȸ����ﵽ��ͷ����ߵĿ�������M�����M�У�ÿ�а��������ʽ���һλ��������Ϣ������
 * ��������˵���Ĺ���Ӹߵ������򡣵�ĳ�࿼�����ж����ܷ���ͬʱ������·ֽ������У� ���·�Ҳ���У� ��׼��֤�ŵ���������� ��������: 14 60 80
 * 10000001 64 90 10000002 90 60 10000011 85 80 10000003 85 80 10000004 80 85
 * 10000005 82 77 10000006 83 76 10000007 90 78 10000008 75 79 10000009 59 90
 * 10000010 88 45 10000012 80 100 10000013 90 99 10000014 66 60 �������: 12
 * 10000013 90 99 10000012 80 100 10000003 85 80 10000011 85 80 10000004 80 85
 * 10000007 90 78 10000006 83 76 10000005 82 77 10000002 90 60 10000014 66 60
 * 10000008 75 79 10000001 64 90
 *
 * @author Marchp
 * @date 2018/2/6
 */
public class ScoreJudge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int L = sc.nextInt();
		int H = sc.nextInt();

		TreeSet<Stu> both = new TreeSet<Stu>();
		TreeSet<Stu> dc1 = new TreeSet<Stu>();
		TreeSet<Stu> dc2 = new TreeSet<Stu>();
		TreeSet<Stu> dc3 = new TreeSet<Stu>();
		while (n != 0) {
			Stu stu = new Stu(sc.nextInt(), sc.nextInt(), sc.nextInt());
			if (stu.d < L || stu.c < L) {
				n--;
				continue;
			}
			if (stu.d >= H && stu.c >= H)
				both.add(stu);
			else if (stu.d >= H)
				dc1.add(stu);
			else if (stu.d >= stu.c)
				dc2.add(stu);
			else
				dc3.add(stu);
			n--;
		}
		System.out.println(both.size() + dc1.size() + dc2.size() + dc3.size());
		print(both);
		print(dc1);
		print(dc2);
		print(dc3);
		sc.close();

	}

	private static void print(TreeSet<Stu> set) {
		for (Stu s : set)
			System.out.println(s.id + " " + s.d + " " + s.c);
	}

	static class Stu implements Comparable<Stu> {
		int id, d, c, sum;

		public Stu(int id, int d, int c) {
			this.id = id;
			this.d = d;
			this.c = c;
			this.sum = d + c;
		}

		public int compareTo(Stu o) {
			if (this.sum != o.sum)
				return o.sum - this.sum;
			if (this.d != o.d)
				return o.d - this.d;
			return this.id - o.id;
		}

	}

}