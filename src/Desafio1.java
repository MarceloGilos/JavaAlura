import java.util.Random;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        System.out.println("Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.");
        Scanner scanner = new Scanner(System.in);
        int numberRandom = new Random().nextInt(100);
        int acertou = 0;
        int numberPlayer;
        System.out.println("********************************");
        System.out.println("*                              *");
        System.out.println("*   Tente descobrir o numero   *");
        System.out.println("*                              *");
        System.out.println("********************************");

        while(acertou != 1 ){
            System.out.println("Digite o numero:");
            numberPlayer = scanner.nextInt();
            if(numberPlayer == numberRandom){
                acertou = 1;
                System.out.println("!!!!!!!PARABÉNS VOCÊ ACERTOU O NUMERO!!!!!!");
            }else if(numberPlayer > numberRandom){
                System.out.println("O numero é maior!!!");
            }else if(numberPlayer < numberRandom){
                System.out.println("O numero é menor!!!");
            };
        };
        scanner.close();
    };
}
