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
public class NoHuff extends ArvoreHuff{
    
    public final ArvoreHuff direita, esquerda; //sub-arvores
    public NoHuff(ArvoreHuff l, ArvoreHuff r) {
        super(l.frequencia + r.frequencia);
        direita = r;
        esquerda = l;
    }
    
}
