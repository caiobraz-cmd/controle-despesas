import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistema de Controle de Despesas ===");
            System.out.println("1 - Entrar Despesa");
            System.out.println("2 - Anotar Pagamento");
            System.out.println("3 - Listar Despesas em Aberto");
            System.out.println("4 - Listar Despesas Pagas");
            System.out.println("5 - Gerenciar Tipo de Despesa");
            System.out.println("6 - Gerenciar Usuários");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcaoDigitada = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcaoDigitada) {
                case 1 -> System.out.println("Ao escolher esta opção o usuário ira passar as informações sobre a despesa e cadastra-la");
                case 2 -> System.out.println("Na função de anotar pagamento o usuário irá informar qual despesa foi paga e a data do pagamento");
                case 3 -> System.out.println("Puxa um arraylist de despesas e lista as que estão em aberto");
                case 4 -> System.out.println("Através do arraylist de despesas lista as que já foram pagas");
                case 5 -> System.out.println("Abre um menu permitindo que o usuário crie um novo tipo de despesa, edite ou exclua um tipo existente");
                case 6 -> System.out.println("Abre um menu permitindo que o usuário crie um novo usuário, edite ou exclua um usuário existente");
                case 7 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
