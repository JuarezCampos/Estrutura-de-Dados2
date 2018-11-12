/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class PokemonTrabalho {
    public static int erro(String valor){
        int valorInt;
        try{
            
            valorInt  = Integer.parseInt(valor);
            
            
        }catch(NumberFormatException e){
           System.out.println("Comando inválido");
           Scanner teste = new Scanner(System.in); 
           valorInt = erro(teste.next());
        }
        return valorInt;
    }
    public static void gravarDados(String dado){
        File dados = new File("InformacoesPok.txt");
        try {
            FileWriter dadosPok = new FileWriter(dados);
            dadosPok.write(dado+"\n");
            dadosPok.flush();
        } catch (IOException ex) {
            System.out.println("Erro ao salvar arquivo!");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuBDP menu = new MenuBDP();
        menu.menuInicio();
        //Inicio do menu antigo
        /*
        Jogador jg = new Jogador();
        Pokemon pokPrincipal = new Pokemon();
        int menu;
        do{
            //System.out.println("0 - para sair ; 1 - para adicionar um novo pokemon"
                    //+ " ; 2 - para listar BD da pokedex\n3 - para deletar pokemon");
                        System.out.println("\n### Sistema de informações de pokemons! - Pokedex ###");
			System.out.println("                  =============================");
			System.out.println("                  |   1 - Adicionar pokemon   |");
			System.out.println("                  |   2 - Listar BD pokemons  |");
			System.out.println("                  |   3 - Deletar pokemon     |");
			System.out.println("                  |   4 - Adicionar Ginasio   |");
			System.out.println("                  |   5 - Listar BD Ginasio   |");
			System.out.println("                  |   6 - Deletar Ginasio     |");
			System.out.println("                  |   0 - Sair                |");
			System.out.println("                  =============================\n");
			//System.out.print("\n");
        
            Scanner auxMenu = new Scanner(System.in);
            menu = erro(auxMenu.next());
            //menu = auxMenu.nextInt();
            
            switch(menu){
                case 0:
                    System.out.println("Finalizando o sistema!");
                    break;
                case 1:
                    Pokemon pokk = new Pokemon();
                    String auxString;
                    int auxNum;
                    //boolean auxBool;
                    //Set nome pokemon
                    System.out.println("Digite o nome do pokemon: ");
                    Scanner nomePok = new Scanner(System.in);
                    auxString = nomePok.nextLine();
                    pokk.setNomePokemon(auxString);
                    //set sexo pokemon
                    System.out.println("Digite o sexo do pokemon: ");
                    Scanner sexoPok = new Scanner(System.in);
                    auxString = sexoPok.nextLine();
                    pokk.setSexoPokemon(auxString);
                    //set habilidade pokemon
                    System.out.println("Digite a habilidade do pokemon: ");
                    Scanner habilidadePok = new Scanner(System.in);
                    auxString = habilidadePok.nextLine();
                    pokk.setHabilidade(auxString);
                    //set fraqueza pokemon
                    System.out.println("Digite a fraqueza do pokemon: ");
                    Scanner fraquezaPok = new Scanner(System.in);
                    auxString = fraquezaPok.nextLine();
                    pokk.setFraqueza(auxString);
                    //set descrição pokemon
                    System.out.println("Digite descricao do pokemon: ");
                    Scanner descricaoPok = new Scanner(System.in);
                    auxString = descricaoPok.nextLine();
                    pokk.setDescricao(auxString);
                    //set altura pokemon
                    System.out.println("Digite a altura do pokemon: ");
                    Scanner alturaPok = new Scanner(System.in);
                    auxNum = erro(alturaPok.next());
                    pokk.setAltura(auxNum);
                    //set peso pokemon
                    System.out.println("Digite o peso do pokemon: ");
                    Scanner pesoPok = new Scanner(System.in);
                    auxNum = erro(pesoPok.next());
                    pokk.setPeso(auxNum);
                    //set idNum pokemon
                    //pokk.setNumId();
                    //set evolucao pokemon
                    System.out.println("O pokemon é uma evolução? Sim(1) ou Não(0)");
                    Scanner evolucaoPok = new Scanner(System.in);
                    auxNum = erro(evolucaoPok.next());
                    pokk.setEvolucao(auxNum);
                    //set numIdEvolução pokemon
                    if(pokk.getEvolucao() == 1){
                        if(pokk.getNumPokemon() != 0){
                            System.out.println("Digite id(identificador) do pokemon 'pai'");
                            Scanner idPok = new Scanner(System.in);
                            auxNum = erro(idPok.next());
                            pokk.setNumIdEvolucao(auxNum);
                        }else{
                            System.out.println("Não possui pokemons na pokedex!!");
                        }
                        
                    }
                    pokPrincipal.setObjetoPokemon(pokk);
                    
                    break;
                case 2:
                    pokPrincipal.getObjetoPokemonLista();
                    break;
                case 3:
                    if(pokPrincipal.getNumPokemon() != 0){
                        int auxInd;
                        System.out.println("Digite o id do pokemon");
                        Scanner indDelete = new Scanner(System.in);
                        auxInd = erro(indDelete.next());
                        pokPrincipal.excluiPokemon(auxInd);
                    }else{
                        System.out.println("Não possui pokemons na pokedex!!");
                    }
                    break;
                case 4:
                    Ginasio gin = new Ginasio();
                    gin.menu();
                    break;
                case 5:
                    Ginasio gin1 = new Ginasio();
                    gin1.getObjetoGinasioLista();
                    break;
                case 6:
                    Ginasio gin2 = new Ginasio();
                    if(gin2.getNumGinasio() != 0){
                        int intAux = 0;
                        System.out.println("Digite o id do ginasio!");
                        Scanner idGinasio = new Scanner(System.in);
                        intAux = erro(idGinasio.next());
                        gin2.excluiGinasio(intAux);
                        
                    }
                    break;
                default:
                    System.out.println("Comando não encontrado!");
                    
            }
            /*pokk.setAltura(1);
            pokk.setDescricao("Descrição teste");
            pokk.setEvolucao(false);
            pokk.setFraqueza("fraqueza teste");
            pokk.setHabilidade("habilidade teste");
            pokk.setNomePokemon("nome teste");
            pokk.setSexoPokemon("sexo teste");
            pokk.setNumId();
            pokk.setNumIdEvolucao(0);
            pokk.setObjetoPokemon(pokk);
            pokk.getObjetoPokemon();
            menu++;*/
        //}while(menu != 0);
        //fim do menu antigo
}

}
