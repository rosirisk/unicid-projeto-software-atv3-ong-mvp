import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        System.out.println("Iniciando testes do MVP da ONG...");

        do {
            // Simulando o cadastro de doação no almoxarifado
            System.out.println("\n--- Módulo de Almoxarifado ---");
            System.out.print("Digite o código do item: ");
            int codigo = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            System.out.print("Digite o nome/tipo da doação (ex: Cesta Básica): ");
            String tipo = scanner.nextLine();

            System.out.print("Digite a descrição (ex: Cesta de Alimentos 10kg): ");
            String descricao = scanner.nextLine();

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            // Instanciando a doação com os dados informados
            Doacao doacao = new Doacao(codigo, tipo, descricao, quantidade);

            System.out.println("\nDoação cadastrada: " + doacao.getDescricaoItem());
            System.out.println("Quantidade: " + doacao.getQuantidade());
            System.out.println("Teste de validação concluído com sucesso!");

            // Pergunta se deseja continuar cadastrando ou voltar ao dashboard
            System.out.print("\nDeseja cadastrar mais doações? (s/n): ");
            continuar = scanner.nextLine().trim();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nEncerrando fluxo do almoxarifado...");
        System.out.println("Retornando ao Dashboard principal (Opções: Cadastrar Família, Doação, Entregar)...");
        
        scanner.close();
    }
}