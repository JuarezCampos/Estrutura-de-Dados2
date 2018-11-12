/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
//antes pokedex estava estends de Jogador
//agora não mais.
public class Pokedex /*extends Jogador*/ {
    private static  int numPokemons = 0;
    private static  int numGinasio = 0;
    
    //Pokemon pok = new Pokemon();
    
    //pesquisar List em vez de arrayList
    private static final ArrayList <Informacoes> arrayPokemon = new ArrayList();
    private static final ArrayList <Ginasio> arrayGinasio = new ArrayList();

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
    public void setObjetoPokemon(Informacoes pokk){
        Pokedex.numPokemons++;
        Pokedex.arrayPokemon.add(pokk);
        
    }
    /**
     * 
     * @param ind indece do objeto no array Pokemon
     * @return o objeto referente ao ind passado por parametro
     */
    public Informacoes getObjetoPokemon(int ind){
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
            
              Collections.sort(arrayPokemon, (Informacoes o1, Informacoes o2) -> {
                  return o1.getNome().compareTo(o2.getNome());
              });
            /*Collections.sort(arrayPokemon, new Comparator<Pokemon>() {
                @Override
                public int compare(Pokemon o1, Pokemon o2) {
                    return o1.getNomePokemon().compareTo(o2.getNomePokemon());
                }
            });*/   
            for(int aux = 0 ; aux< Pokedex.arrayPokemon.size(); aux++){
                //Pokemon auxPokk = this.arrayPokemon.get(aux);
                //System.out.println("Tamanho do arrayList: "+Pokedex.arrayPokemon.size()+"Posição: "+aux);
                 //Collections.sort(arrayPokemon); ///Ordenando baseado na lista de nome ERRO;
            
                
                pokemon = "| Tipo: "+((InfoPok)Pokedex.arrayPokemon.get(aux)).getTipo()+"| Nome do pokemon: " 
                        +Pokedex.arrayPokemon.get(aux).getNome()+"\n| Sexo: "
                        +Pokedex.arrayPokemon.get(aux).getSexo()+"\n| Habilidade: "
                        +Pokedex.arrayPokemon.get(aux).getHabilidade()+"\n| Fraqueza: "
                        +((InfoPok) Pokedex.arrayPokemon.get(aux)).getFraqueza()+ "\n| Vantagem: "
                        +((InfoPok)Pokedex.arrayPokemon.get(aux)).getVantagem()+"\n| Descrição: "
                        +Pokedex.arrayPokemon.get(aux).getDescricao()+"\n| Altura: "
                        +Pokedex.arrayPokemon.get(aux).getAltura()+"\n| Peso: "
                        +Pokedex.arrayPokemon.get(aux).getAltura()+"\n| Seu id: "
                        +aux+"\n| Id do seu pokemon de origem: "
                        +Pokedex.arrayPokemon.get(aux).getNumIdEvolucao();
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
