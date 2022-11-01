package SRC4;

public class Produto {
    private String nome;
    private double valor;
    private int quantidade;
    private Produto produto;

    public Produto(String nome, double valor, int quantidade, Listaencadeada lista_next, Listaencadeada lista_preview, Produto produto) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.produto = produto;
    }
    
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
