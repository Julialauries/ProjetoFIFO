package projetofifo;


public class formato_lote {

    public formato_lote() {
    }
    
    
    private float valor;
    private int quantidade;

    public formato_lote(float valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
