
class GStack<T>{
	int tos;
	Object [] stck;
	
	public GStack() {
		tos = 0;
		stck = new Object[10];
	}
	
	public void push(T item) {
		if (tos == 10)
			return;
		stck[tos] = item;
		tos++;
	}
	
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)stck[tos];
	}
}

public class ex7_9 {
	public static void main(String[] args) {
		// type이 String
		GStack<String> stringStack = new GStack<String>();
		
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int i=0;i<3;i++) {
			System.out.println(stringStack.pop());
		}
		
		GStack<Integer> stringStack2 = new GStack<Integer>();
		
		stringStack2.push(1);
		stringStack2.push(2);
		stringStack2.push(3);
		
		for(int i=0;i<3;i++) {
			System.out.println(stringStack2.pop());
		}
	}
}
