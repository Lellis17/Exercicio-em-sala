import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println(" Entre com a velocidade media:");
            int velocidade = ler.nextInt();
        System.out.println(" Entre com o tempo gasto:");
            int tempo = ler.nextInt();
        System.out.println("Entre com a capacidade de km por litro:");
            int capacidade = ler.nextInt();
            int distancia  = velocidade*tempo;
            int combustivel = distancia/capacidade;

        System.out.println("gasto de combustivel:"+ combustivel + "litro por km:");





    }
}
