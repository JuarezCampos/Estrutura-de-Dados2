/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Pokedex extends Jogador {
    private static  int numPokemons = 0;
    private static  int numGinasio = 0;
    
    //Pokemon pok = new Pokemon();
    
    //pesquisar List em vez de arrayList
    private static ArrayList <Pokemon> arrayPokemon = new ArrayList();
    private static ArrayList <Ginasio> arrayGinasio = new ArrayList();

    /**
     * Adicionando o objeto ginasio no ArrayList e somando a qtd de ginasio
     * @param gin 
     */
    public void setObjetoGinasio(Ginasio gin){
        Pokedex.numGinasio++;
        Pokedex.arrayGinasio.add(gin);
    }
    /**
     * criando o metodo setPokemon, que usará os metodos set's da classe filha
     * 'Pokemon'
     * @param pokk
     */
    public void setObjetoPokemon(Pokemon pokk){
        Pokedex.numPokemons++;
        Pokedex.arrayPokemon.add(pokk);
        
    }
    /**
     * 
     * @param ind indece do objeto no array Pokemon
     * @return o objeto referente ao ind passado por parametro
     */
    public Pokemon getObjetoPokemon(int ind){
     return Pokedex.arrayPokemon.get(ind);
    } 

    /**
     *Imprime todas as informações do array Pokemon
     */
    public void getObjetoPokemonLista(){
        String pokemon;
        if(Pokedex.arrayPokemon.isEmpty()){
            System.out.println("Não há nenhum pokemon registrado na pokedex!");
        }else{
            
            for(int aux = 0 ; aux< Pokedex.arrayPokemon.size(); aux++){
                //Pokemon auxPokk = this.arrayPokemon.get(aux);
                //System.out.println("Tamanho do arrayList: "+Pokedex.arrayPokemon.size()+"Posição: "+aux);
                pokemon = "| Nome do pokemon: " +Pokedex.arrayPokemon.get(aux).getNomePokemon()+ 
                        "\n| Sexo: "+Pokedex.arrayPokemon.get(aux).getSexoPokemon()+
                        "\n| Habilidade: "+Pokedex.arrayPokemon.get(aux).getHabilidade()+"\n| Fraqueza: "+
                        Pokedex.arrayPokemon.get(aux).getFraqueza()+"\n| Descrição: "+
                        Pokedex.arrayPokemon.get(aux).getDescricao()+
                        ".\n| Altura: "+Pokedex.arrayPokemon.get(aux).getAltura()+"\n| Peso: "+
                        Pokedex.arrayPokemon.get(aux).getAltura()+
                        "\n| Seu id: "+/*Pokedex.arrayPokemon.get(aux).getNumIdPokemon()+*/aux+"\n| Id do seu pokemon de origem: "+
                        Pokedex.arrayPokemon.get(aux).getNumIdEvolucao();
                System.out.println(pokemon+"\n ---------- ");


            }
        
        }
        
    }
     /**
     *Imprime todas as informações do array Pokemon
     */
    public void getObjetoGinasioLista(){
        String ginasio;
        if(Pokedex.arrayGinasio.isEmpty()){
            System.out.println("Não há nenhum ginasio registrado na pokedex!");
        }else{
            
            for(int aux = 0 ; aux< Pokedex.arrayGinasio.size(); aux++){
                
                //Pokemon auxPokk = this.arrayPokemon.get(aux);
                //System.out.println("Tamanho do arrayList: "+Pokedex.arrayPokemon.size()+"Posição: "+aux);
                ginasio = " | Nome do Ginasio: "+Pokedex.arrayGinasio.get(aux).getNomeGinasio()+"\n | "
                        + "Nome do mestre de ginasio: "+Pokedex.arrayGinasio.get(aux).getMestreGinasio();
                System.out.println(ginasio);
                ArrayList <Pokemon> auxArray = new ArrayList();
                auxArray = Pokedex.arrayGinasio.get(aux).getPokemons();
                for(int aux1 = 0 ; aux1 < Pokedex.arrayGinasio.get(aux).getPokemons().size() ;aux1++){
                    System.out.println(" | Nome do Pokemon: "+auxArray.get(aux1).getNomePokemon());
                }
                System.out.println("\n ----------");
            }
        
        }
        
    }
    
    /** 
     * @param ind indece do objeto no array Ginasio
     * @return o objeto referente ao ind passado por parametro
     */
    public Ginasio getObjetoGinasio(int ind){
     return Pokedex.arrayGinasio.get(ind);
    } 
    /**
     * adicionando o numero de ginasio que está na pokedex.
     */
    /*public void setNumGinasio(){
        Pokedex.numGinasio++;
    }*/
    /**
     * 
     * @return o numero de pokemons que possui na pokedex.
     */
    public int getNumPokemon(){
        return Pokedex.numPokemons;
    }
    
    /**
     * 
     * @return o numero de ginasio que possui na pokedex.
     */
    public int getNumGinasio(){
        return Pokedex.numGinasio;
    }
    /**
     * atualiza o numero de pokemon
     * @param numId
     * excluindo o pokemon da lista de acordo com o id passado.
     */
    public void excluiPokemon(int numId){
        try{
        arrayPokemon.remove(numId);
        System.out.println("Pokemon deletado com sucesso!");
        Pokedex.numPokemons--;
        }catch(Exception e){
                if(numId+1 > arrayPokemon.size() || numId < 0){
                    System.out.println("Pokemon não encontrado!"); 
                }
                }
    }
    /**
     * exclui o ginásio de acordo com o id passado.
     * @param ind 
     */
  
    public void excluiGinasio(int ind){
        if(ind+1 > arrayGinasio.size() || ind < 0){
                    System.out.println("Ginasio não encontrado!");
        }else{
            arrayGinasio.remove(ind);
            Pokedex.numGinasio--;
            System.out.println("Ginasio deletado com sucesso!");
        }
        
    }
    

}
