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
public class Informacoes {
    private String nome, sexo, habilidade, descricao;
    private int altura, peso, numIdEvolucao = -1, evolucao = 0;
    /**
     * Construtor da classe.
     */
    public Informacoes() {
    }
    /**
     * 
     * @return O nome do pokemon
     */
    public String getNome() {
        return this.nome;
    }
    /**
     * seta o nome do pokemon
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * 
     * @return O sexo do pokemon
     */
    public String getSexo() {
        return this.sexo;
    }
    /**
     * Seta o sexo do pokemon
     * @param sexo 
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
     * 
     * @return A habilidade do pokemon
     */
    public String getHabilidade() {
        return this.habilidade;
    }
    /**
     * Seta a habilidade do pokemon
     * @param habilidade 
     */
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
    /**
     * 
     * @return A descrição do pokemon
     */
    public String getDescricao() {
        return this.descricao;
    }
    /**
     * Seta a descrição do pokemon
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    /**
     * 
     * @return A altura do pokemon
     */
    public int getAltura() {
        return this.altura;
    }
    /**
     * Seta a altura do pokemon
     * @param altura 
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    /**
     * 
     * @return O peso do pokemon
     */
    public int getPeso() {
        return this.peso;
    }
    /**
     * Seta o peso do pokemon
     * @param peso 
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    /**
     * 
     * @return O id do pokemon que o originou.
     */
    public int getNumIdEvolucao() {
        return this.numIdEvolucao;
    }
    /**
     * Setando o id do pokemon que o originou.
     * @param numIdEvolucao 
     */
    public void setNumIdEvolucao(int numIdEvolucao) {
        //Instancia Pokedex para verificar se o id passado está dentro da faixa
        //existente de pokemons registrados na pokedex.
        Pokedex pokAux = new Pokedex();
        if(numIdEvolucao > pokAux.getNumPokemon() || numIdEvolucao < 0){
                System.out.println("Id não válido!");
            }else{
                System.out.println("Numero de pokemons: "+pokAux.getNumPokemon());
                this.numIdEvolucao = numIdEvolucao;
                //analisar se vale a pena pedir para o usuário digitar o id de novo
                //e passar esse novo id como referencia a essa função ou se realmente
                //encerra sem pedir para corrigir
            }
    }
    /**
     * 
     * @return Se o pokemon que está sendo setado é uma evolução ou não.
     */
    public int getEvolucao() {
        return this.evolucao;
    }
    /**
     * Seta um valor para assinalar se o pokemon que está sendo setado é uma evolução ou não
     * @param evolucao 
     */
    public void setEvolucao(int evolucao) {
        this.evolucao = evolucao;
    }

    public Informacoes(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Informacoes(String nome, String sexo, String habilidade, String descricao, int altura, int peso) {
        this.nome = nome;
        this.sexo = sexo;
        this.habilidade = habilidade;
        this.descricao = descricao;
        this.altura = altura;
        this.peso = peso;
    }
}
