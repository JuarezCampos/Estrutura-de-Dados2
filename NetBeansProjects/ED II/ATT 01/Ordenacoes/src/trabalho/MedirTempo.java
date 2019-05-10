/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;



/**
 *
 * @author pedro
 */
public class MedirTempo {
    private long tempoInicial, tempoFinal;
    
    public void setTempoInicial(long tempoInicialAux){
        this.tempoInicial = tempoInicialAux;
    }
    
    public double getTempoFinal(long tempoFinalAux){
        this.tempoFinal = tempoFinalAux - this.tempoInicial;
        System.out.println("Tempo de Execução: "+(double)this.tempoFinal/1000000000);
        return ((double)this.tempoFinal/1000000000);
    }
}
