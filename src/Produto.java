package src;
import java.util.ArrayList;
import java.util.List;
public class Produto {
    private String nome;
    private double valorUnitario;
    private int quantidade;
    private double valorTotal;
    private List<String> receita = new ArrayList<>();
    public Produto(String nome, double valorUnitario, int quantidade, List<String>receita) {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.receita = receita;
        this.valorTotal = valorUnitario * quantidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public List<String> getReceita() {
        return receita;
    }
    public void setReceita(List<String> receita) {
        this.receita = receita;
    }

    public String mostrarProduto(){
        return "Nome do produto: "+ getNome()+
                "\n Valor: "+ getValorUnitario()+
                "\n Quantidade: "+ getQuantidade()+
                "\n Receita: "+ getReceita();
    }
}