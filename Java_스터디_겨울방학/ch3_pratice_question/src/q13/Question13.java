package q13;

public class Question13 {
	public static void main(String[] args) {
		for (int n = 1; n < 100; n++) {
			String num = String.valueOf(n);
			boolean isNum = false;
			String count ="";
			
			for(int i=0;i<num.length();i++) {
				int numAt = num.charAt(i);
				
				if((numAt == '3') || (numAt == '6') || (numAt == '9')) {
					count+="¦";
					isNum = true;
				}
			}
			
			if(!isNum) {
				System.out.println(n);
			}
			else {
				System.out.println(count);
			}
		}
	}
}
