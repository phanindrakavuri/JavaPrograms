package examples;

public class StringReverse {

	public static void main(String[] args) {
		
		//using StringBuffer and StringBuilder
		String input = "mindq";

		StringBuilder input1 = new StringBuilder();

		input1.append(input);

		input1 = input1.reverse();

		System.out.println(input1);

		StringBuffer a = new StringBuffer("Java programming is fun");
		System.out.println(a.reverse());

		StringBuilder sb = new StringBuilder("qwerty");
		System.out.println(sb.reverse());

		
		//using reverse iteration
		String s = "shiva";

		String rev = "";

		char ch[] = s.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);

	}
}
