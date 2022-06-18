package projetofifo;

import java.util.LinkedList;
import java.util.Scanner;


public class ProjetoFifo {

    public static LinkedList<formato_lote> lista  = new LinkedList<formato_lote>();
  
    public static void main(String[] args) {
        
        int terminou = 0;
        int cont_dia = 1;
        
        while(terminou==0){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira o tipo de transação:");
        System.out.print("Ex.: Comprar X ações a R$ Y cada no dia 1/Vender X ações a R$ Y cada no dia ");
        System.out.println(cont_dia);
        String transacao = ler.nextLine();
        String[] partes_transacao = transacao.split(" ");
        float valor;
        String  valor1;
        String  valor2;
        int quantidade = Integer.parseInt(partes_transacao[1]);
        valor1 = partes_transacao[4];
        valor2 = partes_transacao[5];
        
        
        if(partes_transacao[0].equals("Comprar") || partes_transacao[0].equals("comprar")){
            //int quantidade = Integer.parseInt(partes_transacao[1]);
            
            
            if(valor1.equals("R$") || valor1.equals("r$") ||valor1.equals("rs") || valor1.equals("RS")){
                
                valor = Float.parseFloat(valor2);
                formato_lote objeto = new formato_lote(valor,quantidade);
                lista.addFirst(objeto);
                //Float Valor= Metodos.lista.get(0).getValor();
                
            }else{
            
                valor = Float.parseFloat(valor1);
                formato_lote objeto = new formato_lote(valor,quantidade);
                lista.addFirst(objeto);
                
            }
            
            //System.out.println(valor);
        }else if(partes_transacao[0].equals("Vender") || partes_transacao[0].equals("vender")){
            int cont = 0;
            float value1 = 0;
            terminou=1;
            float value[] = new float[100];
            float valor_final = 0;
            
             if(valor1.equals("R$") || valor1.equals("r$") ||valor1.equals("rs") || valor1.equals("RS")){
                
                 valor = Float.parseFloat(valor2);
                 
                 for(int i=lista.size()-1; i>=0;i--){
                     if(cont+lista.get(i).getQuantidade()<=quantidade){
                        value1 = valor - lista.get(i).getValor();
                        value[i] = value1 * lista.get(i).getQuantidade();
                        cont = cont + lista.get(i).getQuantidade();
                     }else{
                        quantidade = quantidade - cont;
                        value1 = valor - lista.get(i).getValor();
                        value[i] = value1 * quantidade;
                     } 
                 }
                 
                 for(int i=0; i<lista.size();i++){
                    
                    valor_final = valor_final + value[i];
                    
                 }
                
                if(valor_final>0){
                    
                    System.out.println("\n\n         RESULTADO");
                    System.out.print("\nVocê obteve um lucro de R$ ");
                    System.out.println(valor_final);
                    
                }else if(valor_final == 0){
                    
                    System.out.println("\n\n         RESULTADO");
                    System.out.println("\nVocê não obteve ganhos nem perdas");
                    
                }else if(valor_final<0){
                    
                    System.out.println("\n\n         RESULTADO");
                    System.out.println("\nVocê obteve uma perda de R$ ");
                    System.out.println(valor_final);
                    
                }
                
            }else{
               
               valor = Float.parseFloat(valor1);
                 
                 for(int i=lista.size()-1; i>=0;i--){
                     if(cont+lista.get(i).getQuantidade()<=quantidade){
                        value1 = valor - lista.get(i).getValor();
                        value[i] = value1 * lista.get(i).getQuantidade();
                        cont = cont + lista.get(i).getQuantidade();
                     }else{
                        quantidade = quantidade - cont;
                        value1 = valor - lista.get(i).getValor();
                        value[i] = value1 * quantidade;
                     } 
                 }
                 
                 for(int i=0; i<lista.size();i++){
                    
                    valor_final = valor_final + value[i];
                    
                 }
                
                if(valor_final>0){
                    
                    System.out.println("\n\n         RESULTADO");
                    System.out.print("\nVocê obteve um lucro de R$ ");
                    System.out.println(valor_final);
                    
                }else if(valor_final == 0){
                     
                    System.out.println("\n\n         RESULTADO");
                    System.out.println("\nVocê não obteve ganhos nem perdas");
                    
                }else if(valor_final<0){
                    System.out.println("\n\n         RESULTADO");
                    System.out.println("\nVocê obteve uma perda de R$ ");
                    System.out.println(valor_final);
                    
                }
            }
  
        }
        cont_dia++;
        }
    }
    
}
