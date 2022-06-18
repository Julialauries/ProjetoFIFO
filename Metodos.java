package projetofifo;

import java.util.LinkedList;


public class Metodos {

    public Metodos() {
        
        
    }
    
    public static LinkedList<formato_lote> lista  = new LinkedList<formato_lote>();
    
    
    public static void armazenarLote(float valor, int quantidade) {
        
        formato_lote objeto = new formato_lote(valor,quantidade);
        
        lista.addFirst(objeto);
        
        
	}
}
