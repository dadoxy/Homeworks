package Homework11;

public class TaskOne {
	
	public static int getMin(int a, int b) {
		if (a < b){
			return a;
		}else
			return b;
		
	}
	public static int getMin2(int a, int b, int c) {
		if (a < getMin(b,c)){
			return a;
		}else
			return getMin(b,c);
	}

	public static void main(String[] args) {
		System.out.println(getMin(4, 7));
		System.out.println(getMin2(6, 34, 7));

	}

}
