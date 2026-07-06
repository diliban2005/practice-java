import java.util.*;
class palinstack{
	public static void main(String[] args){
		Stack <Character> s =new Stack<>();
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		for(int i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if (s.isEmpty() && ch == s.peek()){
			s.pop();
			}
			else{
					s.push(ch);
				}
		}
			int num=str.length()-1;
		for(Character ch : s){
			if(str.charAt(num) != ch){
				num--;
		}
        		
			
		}
		if(num==0){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	
}
			
			
}