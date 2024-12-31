import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner main_scanner = new Scanner(System.in);
        String input;
        
        double answer;
        boolean working = true;
        do{
            input = main_scanner.next();
            switch (input) {
                case "sum" -> {                
                    answer = Prozessor.calculate_sum();
                    System.out.println(answer);
                }
                case "sub" -> {                
                    answer = Prozessor.calculate_sub();
                    System.out.println(answer);
                }
                case "mul" -> {                
                    answer = Prozessor.calculate_mul();
                    System.out.println(answer);
                }
                case "div" -> {                
                    answer = Prozessor.calculate_div();
                    System.out.println(answer);
                }
                case "quit" -> {
                    working = false;
                    main_scanner.close();
                }
                default -> {                    
                    System.out.println("Enter another command");
                }
            }
        }while(working);
        
    }
}
