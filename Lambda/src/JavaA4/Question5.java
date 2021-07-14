package JavaA4;

public class Question5 {
	 static String firstLetterWord(String s) {
			String result = " ";
			boolean a = true;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) == ' ') {
					a = true;
				}
				else if (s.charAt(i) !=- ' ' && a == true) {
					result += (s.charAt(i));
					a = false;
					
				}
			}
			return result;
		}
	public static void main(String[] args) {
		String s = "In My Life Cricket Is My First Love";
		System.out.println(firstLetterWord(s));
		

	}

}


	


