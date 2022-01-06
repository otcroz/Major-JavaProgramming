package q9;

public class Question9 {
	public static void main(String[] args) {
		int[][] num = new int[4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				int ran = (int)(Math.random()*10+1);
				num[i][j] = ran;
			}
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
}
