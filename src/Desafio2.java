import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int sair = 0;
        String menu;
        String nome;
        String conta;

        System.out.print("""
                ************************************
                Bem vindo ao banco JAVA!
                Iremos fazer seu cadastro
                ************************************
                Nome:""");
        nome = scanner.nextLine();

        System.out.print("Qual o tipo de conta (Corrente ou Poupança?):");

        conta = scanner.nextLine();

        while(sair == 0){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println(String.format("""
                **************************************
                Dados Iniciais Cliente

                Nome: %s
                Tipo de conta: %s
                Saldo: %.2f
                **************************************
                1-Veja seu Saldo
                2-Receba um valor
                3-Retire um valor
                4-Sair
            """,nome,conta,saldo));
            menu = scanner.nextLine();
            switch(menu){
                case "1":
                System.out.println(String.format("O seu saldo atual é de : R$ %.2f", saldo));
                scanner.nextLine();
                System.out.println("Pressione Enter para continuar.");
                break;
                case "2":
                System.out.println("Quanto você transferiu para sua conta?");
                String valorEntrada = scanner.nextLine();
                valorEntrada.replaceAll(",", ".");
                saldo += Double.parseDouble(valorEntrada);
                System.out.println("***Valor adicionado com sucesso***");
                System.out.println("Pressione Enter para continuar.");
                scanner.nextLine();
                break;
                case "3":
                System.out.println("Quanto você gostaria de retirar?");
                String valorSaida = scanner.nextLine();
                valorSaida.replaceAll(",", ".");
                saldo -= Double.parseDouble(valorSaida);
                System.out.println("***Valor transferido com sucesso***");
                scanner.nextLine();
                System.out.println("Pressione Enter para continuar.");
                break;
                case "4":
                System.out.println("**Obrigado por usar o Banco Meu primeiro JAVA***");
                sair = 1;
                break;
                default:
                System.out.println("Valor passado invalido, por favor escolha uma das opções validas.");
                scanner.nextLine();
                System.out.println("Pressione Enter para continuar.");
                break;
            }
        };
        scanner.close();
        
    }
}
