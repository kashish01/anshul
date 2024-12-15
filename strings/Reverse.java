package strings;

public class Reverse {

	public static void main(String[] args) {
		
		String str = "chamahc";
		
		String rev = "";
		
		
		System.out.println(str.length());
		
		for(int i=str.length()-1;i>=0;i--){
			char c = str.charAt(i);
			rev = rev+c;
		}
		
		System.out.println(rev);
		System.out.println(str);
		
		
		
	}
	
}
