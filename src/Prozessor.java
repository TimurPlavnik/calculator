import java.util.Scanner;

public class Prozessor {
    public static double calculate_sum(){
        Scanner main_scanner = new Scanner(System.in);
        double first_number, second_number, answer;
        System.out.println("Enter first number: ");
        first_number = main_scanner.nextDouble();
        System.out.println("Enter second number: ");
        second_number = main_scanner.nextDouble();
        answer = first_number+second_number;
        return answer;
    }

    public static double calculate_sub(){
        Scanner main_scanner = new Scanner(System.in);
        double first_number, second_number, answer;
        System.out.println("Enter first number: ");
        first_number = main_scanner.nextDouble();
        System.out.println("Enter second number: ");
        second_number = main_scanner.nextDouble();
        answer = first_number-second_number;
        return answer;
    }


    public static double calculate_div(){
        Scanner main_scanner = new Scanner(System.in);
        double first_number, second_number, answer;
        System.out.println("Enter first number: ");
        first_number = main_scanner.nextDouble();
        System.out.println("Enter second number: ");
        second_number = main_scanner.nextDouble();
        answer = first_number/second_number;
        return answer;
    }

    public static double calculate_mul(){
        Scanner main_scanner = new Scanner(System.in);
        double first_number, second_number, answer;
        System.out.println("Enter first number: ");
        first_number = main_scanner.nextDouble();
        System.out.println("Enter second number: ");
        second_number = main_scanner.nextDouble();
        answer = first_number*second_number;
        return answer;
    }
}
