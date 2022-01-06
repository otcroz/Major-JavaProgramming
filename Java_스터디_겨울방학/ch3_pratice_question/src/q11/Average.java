package q11;

public class Average {
	public static void main(String[] args) { // 명령 프롬프트에서 받은 인수는 String 배열 형으로 저장
		int[] num = new int[args.length];

		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			num[i] = Integer.parseInt(args[i]);
			sum += num[i];
		}

		System.out.println(sum / args.length);

	}
}
