import java.util.*;
class hello{
	public static void main(String[] args){
		Stack<Character> s =new Stack<>();
		Scanner sc= new Scanner(System.in);
		String str = "He3l2lo";
		for (int i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			if (ch == 'H' || ch == 'e' || ch == 'l' || ch == 'o'){
				s.push(ch);
			}
		}
		for(Character ch:s)
			{
				System.out.print(ch);
			}
	}
}
		