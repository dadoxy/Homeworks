import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class MyMap {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input key value: ");
		int key = in.nextInt();
		System.out.println("Input size of list");
		int size = in.nextInt();
		
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		
		for(int i = 0; i < key; i++){
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j = 0; j < size + i * i; j += i){
				list.add(j);
			}
			map.put(i, list);
		}
		System.out.println(map);
	}

}
