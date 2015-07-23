import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;


public class NumberList {

	public static void main(String[] args) {
		
		LinkedList<Number> nums = new LinkedList<Number>();
		
		for(int i = 0; i < 11; i++){
			Random rand = new Random();
			nums.add(rand.nextInt(10) + 1);
		}
		ListIterator<Number> li = nums.listIterator();
		
		while(li.hasNext()){
			Number temp = li.next();
			Number temp1 = li.next();
			System.out.println(temp.intValue() + temp1.intValue());
		}
	}

}
