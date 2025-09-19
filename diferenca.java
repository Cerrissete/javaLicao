import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = ler.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = ler.nextDouble();

        double diferenca = num1 - num2;

        System.out.println("A diferença entre os dois números é: " + diferenca);

        
    }
}