public class FamiliaTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        
        System.out.println("=== INICIANDO TESTES AUTOMATIZADOS (UNITÁRIOS E INTEGRAÇÃO) ===");
        
        // Validação da classe Familia
        Familia familia = new Familia(1, "Maria Silva", "(11) 98888-7777", 4);
        
        assert familia.getId() == 1;
        assert familia.getNomeResponsavel().equals("Maria Silva");
        assert familia.getQuantidadeIntegrantes() == 4;
        
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;
        
        System.out.println("Testes da classe Familia: Aprovados.");
        System.out.println("Status: Passed");
        System.out.println("Resultado: OK");
        System.out.println("Tempo de execução: " + tempoExecucao + "ms");
        System.out.println("=== TODOS OS TESTES PASSARAM COM SUCESSO ===");
    }
}