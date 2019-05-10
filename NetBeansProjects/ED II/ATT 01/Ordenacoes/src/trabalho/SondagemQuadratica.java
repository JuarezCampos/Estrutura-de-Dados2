/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author Juarez
 */
public class SondagemQuadratica extends Hash {
    
    //Construtor
    public SondagemQuadratica(int tamTabela){
        
     super(tamTabela);   
    }
    
    //Funcao hash utilizada
    @Override
    int hash(int ChaveID, int colisao) {
         return (int) (ChaveID + colisoes + Math.pow(colisoes, 2)) % tamanhoDaTabela;
    }
    
    
}
