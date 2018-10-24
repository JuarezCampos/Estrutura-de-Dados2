/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;

/**
 *
 * @author pedro
 */
//estender de informações//sobrecrga de construtorres
public class Pokemon extends Pokedex{
    
    private String nomePokemon, sexoPokemon, habilidade, fraqueza, descricao;
    private int altura, peso, numIdEvolucao = -1, evolucao = 0/*, auxNumId = -1*/;
    //private static int numId = -1;
    
    
    /**
     *classe que tem por finalidade chamar a classe pai 
     */
    /*@Override
    public void setPokemon(){
        super.setPokemon();;
    }*/
    /** 
     * setando o nome do pokemon
     * @param nomePokemon
     */
    public void setNomePokemon(String nomePokemon){
        this.nomePokemon = nomePokemon;
    }
    /**
     * setando o sexo do pokemon
     * @param sexoPokemon 
     */
    public void setSexoPokemon(String sexoPokemon){
        this.sexoPokemon = sexoPokemon;
    }
    /**
     * setando a habilidade do pokemon
     * @param habilidade 
     */
    public void setHabilidade(String habilidade){
        this.habilidade = habilidade;
    }
    /**
     * setando a fraqueza do pokemon
     * @param fraqueza 
     */
    public void setFraqueza(String fraqueza){
        this.fraqueza = fraqueza;
    }
    /**
     * setando a descrição que o pokemon possui
     * @param descricao 
     */
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    /**
     * setando a altura que o pokemon possui
     * @param altura 
     */
    public void setAltura(int altura){
        this.altura = altura;
    }
    /**
     * setando o peso que o pokemon possui
     * @param peso 
     */
    public void setPeso(int peso){
        this.peso = peso;
    }
    /**
     * setando o id de identificação do pokemon
     * @param numId
     */
    /*public void setNumId(){
        Pokemon.numId++;
        this.auxNumId = Pokemon.numId;
    }*/
    /**
     * setando o id do pokemon que esse pokemon evoluiu. 
     * @param numIdEvolucao 
     */
    public void setNumIdEvolucao(int numIdEvolucao){
            if(numIdEvolucao > getNumPokemon() || numIdEvolucao < 0){
                System.out.println("Id não válido!");
            }else{
                System.out.println("Numero de pokemons: "+getNumPokemon());
                this.numIdEvolucao = numIdEvolucao;
                //analisar se vale a pena pedir para o usuário digitar o id de novo
                //e passar esse novo id como referencia a essa função ou se realmente
                //encerra sem pedir para corrigir
            }
    }
    /**
     * classe com objetivo de verificar se o pokemon que será setado, é uma
     * evolução ou não.
     * @param evolucao 
     */
    public void setEvolucao(int evolucao){
        this.evolucao = evolucao;
    }
    /**
     * 
     * @return se o pokemon é uma evolução ou não.
     */
    public int getEvolucao(){
        return this.evolucao;
    }
    
    public String getNomePokemon(){
        return this.nomePokemon;
    }
    
    public String getSexoPokemon(){
        return this.sexoPokemon;
    }
    
    public String getHabilidade(){
        return this.habilidade;
    }
    
    public String getFraqueza(){
        return this.fraqueza;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public int getAltura(){
        return this.altura;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    /*public int getNumIdPokemon(){
        return this.auxNumId;
        
    }*/
    
    public int getNumIdEvolucao(){
        return this.numIdEvolucao;
    }

    
    /**
     * exclui pokemon
     */
    /*@Override
    public void excluiPokemon(int numId) {
        //...
    }*/
}
