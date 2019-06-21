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
abstract class ArvoreHuff implements Comparable<ArvoreHuff>{
    public final int frequencia;
    
    public ArvoreHuff (int freq){
    this.frequencia = freq;
    }
    
    public int compareTo(ArvoreHuff arv){
    return frequencia - arv.frequencia;     
    }
}
