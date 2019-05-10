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
public class SondagemLinear extends Hash {

    //Construtor
    public SondagemLinear(int tamTabela) {
        super(tamTabela);
    }

    //Funcao hash utilizada
    @Override
    int hash(int ChaveID, int colisao) {
        return ( ChaveID + colisoes) % (tamanhoDaTabela -1);
    }
}
