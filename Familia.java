public class Familia {
    private int id;
    private String nomeResponsavel;
    private String telefone;
    private int quantidadeIntegrantes;

    public Familia(int id, String nomeResponsavel, String telefone, int quantidadeIntegrantes) {
        this.id = id;
        this.nomeResponsavel = nomeResponsavel;
        this.telefone = telefone;
        this.quantidadeIntegrantes = quantidadeIntegrantes;
    }

    public int getId() { return id; }
    public String getNomeResponsavel() { return nomeResponsavel; }
    public String getTelefone() { return telefone; }
    public int getQuantidadeIntegrantes() { return quantidadeIntegrantes; }
}