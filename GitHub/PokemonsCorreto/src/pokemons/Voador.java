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
public class Voador extends Informacoes implements InfoPok{
    private String vantagem;
    private String fraqueza;
    private String tipo;
    /**
     * Construtor da classe.
     */
    public Voador(){
        
    }
    /**
     * seta a fraqueza do pokemon
     * @param fraqueza 
     */
    @Override
    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }
    /**
     * 
     * @return retorna a vantagem do pokemon
     */
    @Override
    public String getVantagem() {
        return this.vantagem;
    }
    /**
     * seta a vantagem do pokemon
     * @param vantagem 
     */
    @Override
    public void setVantagem(String vantagem) {
        this.vantagem = "Terra";
    }
    /**
     * 
     * @return A fraqueza do pokemon
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
        this.tipo = "Voador";
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
