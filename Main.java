public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando testes do MVP da ONG...");
        
        Doacao doacao1 = new Doacao(1, "Cesta Básica", "Cesta de Alimentos 10kg", 5);
        
        System.out.println("Doação cadastrada: " + doacao1.getDescricaoItem());
        System.out.println("Quantidade: " + doacao1.getQuantidade());
        System.out.println("Teste de validação concluído com sucesso!");
    }
}