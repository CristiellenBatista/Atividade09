import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double celsius = 5 * (fahrenheit - 32) / 9;
        
        System.out.println("A temperatura em Celsius é: " + celsius + " graus.");
    }
}
