import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base do triângulo em cm: ");
        double base = ler.nextDouble();

        System.out.print("Digite a altura do triângulo em cm: ");
        double altura = ler.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area + " cm²");

        
    }
}