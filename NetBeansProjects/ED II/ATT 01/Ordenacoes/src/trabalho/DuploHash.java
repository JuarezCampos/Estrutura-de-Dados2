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
public class DuploHash extends Hash {

    //Construtor
    public DuploHash(int tamTabela) {
        super(tamTabela);
    }

    
   
    //Funcao hash auxiliar para tratar colisões
    private int h1(int ChaveID) {
        return ChaveID % tamanhoDaTabela;
    }

    //Funcao hash auxiliar para tratar colisões
    private int h2(int ChaveID) {
        return (5 + ChaveID % 13) % tamanhoDaTabela;
    }

    //Funcao principal hash utilizada
    @Override
    int hash(int ChaveID, int colisao) {
     return (h1(ChaveID) + colisoes * h2(ChaveID)) % tamanhoDaTabela;  
    }
}