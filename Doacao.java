public class Doacao {
    private int id;
    private String tipo;          // Ex: "Cesta Básica", "Livro"
    private String descricaoItem; // Ex: "Cesta de Alimentos 10kg", "Livro Viagem ao centro da terra"
    private int quantidade;

    public Doacao(int id, String tipo, String descricaoItem, int quantidade) {
        this.id = id;
        this.tipo = tipo;
        this.descricaoItem = descricaoItem;
        setQuantidade(quantidade); // Usa validação
    }

    // Validação simples para garantir que a quantidade seja positiva
    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 1; // Padrão mínimo
        }
    }

    // Getters
    public int getId() { return id; }
    public String getTipo() { return tipo; }
    public String getDescricaoItem() { return descricaoItem; }
    public int getQuantidade() { return quantidade; }
}