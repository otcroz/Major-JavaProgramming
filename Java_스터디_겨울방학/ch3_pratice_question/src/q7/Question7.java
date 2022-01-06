package q7;

public class Question7 {
	public static void main(String[] args) {
		int[] num = new int[10];
		
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int i=0;i<num.length;i++) {
			int ran = (int) (Math.random() * 10 + 1);
			num[i] = ran;
			System.out.print(ran + " ");
		}
		System.out.println();
		
		
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			sum += num[i];
		}
		int avg = sum / num.length;
		System.out.println("Æò±ÕÀº " + avg);

		
	}
}
