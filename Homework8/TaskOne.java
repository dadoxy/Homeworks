package Homework8;

public class TaskOne {

	public static void main(String[] args) {
		String nib = "";
		String bin = ("11001100");
		int num = (8);
		int b = bin.length();
		char c = bin.charAt(0);
		
		if (c == '1' && num == b) {
			
			for (int i = 0; i < b; i++) {
				char d = bin.charAt(i);
				
				if (d == '1') {
					nib += 0;

				} else {
					nib += 1;

				}
			}
			
			String kompl = "";
			char s = nib.charAt(b - 1);
			
			if (s == '0') {
				for (int i = 0; i < b; i++) {
					s = nib.charAt(i);
					if (i == b - 1)
						kompl += '1';
					else
						kompl += s;

				}
				System.out.print(kompl);
			} else if (s == '1') {
				int counter = 0;
				
				for (int i = b - 1; i >= 0; i--) {

					s = nib.charAt(i);
					
					if (s == '1') {
						kompl += '0';
						counter++;
					} else {
						kompl += '1';
						counter++;
					}
					int g = counter - 1;
					
					if (kompl.charAt(g) == '1') {
						counter = i - 1;
						break;
					}
				}
				
				if (counter < b) {
					for (int i = counter; i >= 0; i--) {
						s = nib.charAt(i);
						kompl += s;
					}
				}
				String novi = "";
				
				for (int i = b - 1; i >= 0; i--) {
					char p = kompl.charAt(i);
					novi += p;
				}
				System.out.println(novi);
			}

		} else
			System.out.println(bin);

	}

}
