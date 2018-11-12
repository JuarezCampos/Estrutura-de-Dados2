/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;

/**
 *
 * @author Juarez
 */
public class Agua extends Informacoes implements InfoPok{
    private String vantagem;
    private String fraqueza;
    private String tipo;
    /**
     * Construtor da classe.
     */
    public Agua(){
        
    }
    /**
     * Set a fraqueza do pokemon
     * @param fraqueza 
     */
    @Override
    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }
    /**
     * 
     * @return A vantagemm do pokemon
     */
    @Override
    public String getVantagem() {
        return this.vantagem;
    }
    /**
     * Seta a vantagem do pokemon
     * @param vantagem 
     */
    @Override
    public void setVantagem(String vantagem) {
        this.vantagem = vantagem;
    }
    /**
     * 
     * @return a fraqueza do pokemon
     */
    @Override
    public String getFraqueza() {
        return this.fraqueza;
    }
    /**
     * Seta o tipo do pokemon
     */
    @Override
    public void setTipo(){
        this.tipo = "Agua";
    }
    /**
     * 
     * @return O tipo do pokemon
     */
    @Override
    public String getTipo(){
        return this.tipo;
    }
    
    
   
}
