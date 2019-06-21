/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmann;

/**
 *
 * @author Juarez
 */
public class FolhaHuff extends ArvoreHuff {
    
    public final char caractere; //letra do nó folha;
    public FolhaHuff(int freq, char val) {
        super(freq);
        caractere = val;
    }
    
}
