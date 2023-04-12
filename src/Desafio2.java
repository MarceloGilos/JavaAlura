import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int sair = 0;
        String menu;
        while(sair == 0){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Escolha 1 numero do menu ai");
            menu = scanner.nextLine();
            switch(menu){
                case "1":
                System.out.println(String.format("O seu saldo atual é de : R$ %.2f", saldo));
                scanner.nextLine();
                break;
                case "2":
                System.out.println("Quanto você transferiu para sua conta?");
                String valorEntrada = scanner.nextLine();
                valorEntrada.replaceAll(",", ".");
                saldo += Double.parseDouble(valorEntrada);
                System.out.println("***Valor adicionado com sucesso***");
                scanner.nextLine();
                break;
                case "3":
                System.out.println("Quanto você gostaria de retirar?");
                String valorSaida = scanner.nextLine();
                valorSaida.replaceAll(",", ".");
                saldo -= Double.parseDouble(valorSaida);
                System.out.println("***Valor transferido com sucesso***");
                scanner.nextLine();
                break;
                case "4":
                System.out.println("**Obrigado por usar o Banco Meu primeiro JAVA***");
                sair = 1;
                break;
                default:
                System.out.println("Valor passado invalido, por favor escolha uma das opções validas.");
                scanner.nextLine();
                break;
            }
        };
        
    }
}
