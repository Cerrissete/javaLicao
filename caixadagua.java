import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a altura da caixa em cm: ");
        double altura = ler.nextDouble();

        System.out.print("Digite a largura da caixa em cm: ");
        double largura = ler.nextDouble();

        System.out.print("Digite a profundidade da caixa em cm: ");
        double profundidade = ler.nextDouble();

        double volume = altura * largura * profundidade;

        System.out.println("O volume da caixa d'água é: " + volume );

        
    }
}