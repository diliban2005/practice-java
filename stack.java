import java.util.Stack; 

public class stack{
    public static void main(String[] args) {
        Stack<String> cards = new Stack<>();
        cards.push("1");
        cards.push("2");
        cards.push("3"); 
        System.out.println("Top Card: " + cards.peek()); 
        String removedCard = cards.pop(); 
        System.out.println("Removed: " + removedCard); 
        System.out.println("Is stack empty " + cards.empty());
    }
}
