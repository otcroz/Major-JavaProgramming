package q11;

public class Average {
	public static void main(String[] args) { // ��� ������Ʈ���� ���� �μ��� String �迭 ������ ����
		int[] num = new int[args.length];

		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			num[i] = Integer.parseInt(args[i]);
			sum += num[i];
		}

		System.out.println(sum / args.length);

	}
}
