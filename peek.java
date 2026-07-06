import java.util.*;
class peek{
	public static void main(String[] args){
		Stack<Character> s =new Stack<>();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String :");
		String str = sc.nextLine();  //pqqprs
		for (int i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			if (!s.isEmpty()&& s.peek() == ch){
				 s.pop();
			}
			else
			{
				s.push(ch);
				
			}
			
		}
		for (Character ch : s){
			System.out.print(ch);
		}
	}
}
		