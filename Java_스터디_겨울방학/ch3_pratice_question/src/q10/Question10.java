package q10;

public class Question10 {
	public static void main(String[] args) {
		int[][] num = new int[4][4];
		
		int count = 0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				int ran = (int)(Math.random()*10+1);
				num[i][j] = ran;
				count++;
				if(count>=12) {
					break;
				}
			}
		}
		
		int[] print = new int[16]; // 출력한 배열의 값읆 모음
		count = 0;
		for(int i=0;i<4;i++){
			int index1 = (int)(Math.random()*4);
			int index2 = (int)(Math.random()*4);
			int res = num[index1][index2];
			
			for(int c=0;c<count;c++) { //출력 배열에 동일 값이 있는 지 확인
				if (print[i] == res)
					break;
				else {
						System.out.println(res + " ");
						print[count++] = res;
				}
			}
		}
	}
}
