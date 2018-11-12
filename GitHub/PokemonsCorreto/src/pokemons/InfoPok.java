
package pokemons;

/**
 *
 * @author pedro
 */
public interface InfoPok {
    /**
     * Seta a fraqueza do pokemon
     * @param fraqueza 
     */
    public void setFraqueza(String fraqueza);
    /**
     * Seta as vantagens do pokemon
     * @param vantagem 
     */
    public void setVantagem(String vantagem);
    /**
     * 
     * @return As fraquezas do pokemon
     */
    public String getFraqueza();
    /**
     * 
     * @return As vantagens do pokemon
     */
    public String getVantagem();
    /**
     * Seta o tipo do pokemon
     */
    public void setTipo();
    /**
     * 
     * @return O tipo do pokemon
     */
    public String getTipo(); 
    
    
}
