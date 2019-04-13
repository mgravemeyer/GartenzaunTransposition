class GartenzaunTransposition {

	static String text = "dieserText";

	public static void main(String[] args) {
		
		gartenzaunTransposition(text);

	}

	static void gartenzaunTransposition(String input) {

		String one = "";
		String two = "";

		for (int x = 0; x < text.length(); x++) {
			one += text.charAt(x);
			x += 1;
			System.out.println(one);
		}
		for (int y = 1; y < text.length(); y++) {
			two += text.charAt(y);
			y += 1;
			System.out.println(two);
		}
		System.out.println("Hallo");

		String output = one + two;

		System.out.println(output);
	}

}