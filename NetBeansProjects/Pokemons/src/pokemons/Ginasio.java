/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Juarez
 */
//estender de informações//sobrecrga de construtorres
public class Ginasio extends Pokedex {

//private static ArrayList <Ginasio> arrayGinasio = new ArrayList();
private String nomeGinasio, mestreGinasio;
private ArrayList <Pokemon> arrayPokemons = new ArrayList();

    
    //public static int contador =0;

    /*public void setObjetoGinasio(Ginasio gin){
        super.setNumGinasio();
        Ginasio.arrayGinasio.add(gin);
        
    }*/

    /*public static ArrayList<Ginasio> getArrayGinasio() {
        return arrayGinasio;
    }*/
    /**
     *
     * @return nome do mestre do ginasio
     */
    public String getMestreGinasio() {
        return this.mestreGinasio;
    }
    /**
     * 
     * @return retorna array de pokemons do ginasio
     */
    public ArrayList getPokemons() {
        return this.arrayPokemons;
    }
    /**
     * 
     * @return o nome do ginasio
     */
    public String getNomeGinasio() {
        return this.nomeGinasio;
    }

    /*public static void setArrayGinasio(ArrayList<Ginasio> arrayGinasio) {
        Ginasio.arrayGinasio = arrayGinasio;
    }*/

    public void setMestreGinasio(String mestreGinasio) {
        this.mestreGinasio = mestreGinasio;
    }

    public void setNomeGinasio(String nomeGinasio) {
        this.nomeGinasio = nomeGinasio;
    }

    public void setPokemons(Pokemon pokemons) {
        arrayPokemons.add(pokemons);
    }
    
    /*public static void contar(){
        contador++;
    }*/
    
    
    
    
       /**
        * função menu para adicionar ginasio
        */
	public void menu() { // menu principal
            Scanner leituraOpcao= new Scanner(System.in); 
            int opcao = 0;
		do {
			System.out.println("Deseja cadastrar um Ginásio?");
			System.out.println("\n                -------------------------");
			System.out.println("                  |     0 - Não          |");
			System.out.println("                  |     1 - Sim           |");
			System.out.println("                  -----------------------\n");
			opcao = leituraOpcao.nextInt();
			System.out.print("\n");
			switch (opcao) {
			case 0:
				System.out.println("Finalizando...");
                                break;
			case 1:
			String auxString;
                        int auxInt = 0;
                        Ginasio ginAux = new Ginasio();
			//setando nome GinÃ¡sio
                        Scanner nomeGin = new Scanner(System.in);
			System.out.println("Digite o nome do Ginásio: ");
			auxString = nomeGin.nextLine();
                        ginAux.setNomeGinasio(auxString);
                        //--
			//arrayGinasio.get(contador).setNomeGinasio(auxString);
			//setando nome Mestre
                        Scanner nomeMestre = new Scanner(System.in);
			System.out.println("Digite o nome do Mestre Ginásio: ");
			auxString = nomeMestre.nextLine();
                        ginAux.setMestreGinasio(auxString);
                        //--
                        //arrayGinasio.get(contador).setMestreGinasio(auxString);
                        Scanner adcPokemon = new Scanner(System.in);
                        System.out.println("Digite 1 - p/ adicionar pokemon.\n"
                                + "Digite 0 - p/ nao adicionar pokemon. ");
                        auxInt = adcPokemon.nextInt();
			//setandoPokemons
                        if(auxInt == 1){
                            Scanner idPokemon = new Scanner(System.in);
                            System.out.println("Digite o id do pokemon");
                            System.out.println("Digite -1 p/ sair!");
                            auxInt = idPokemon.nextInt();
                            int sair = 0;
                            
                            while(sair != -1){
                                if(auxInt <= ginAux.getNumPokemon()){
                                    ginAux.setPokemons(ginAux.getObjetoPokemon(auxInt));
                                    System.out.println("Digite outro id!\n"
                                            + "ou digite -1 p/ sair");
                                    
                                    auxInt = idPokemon.nextInt();
                                    if(auxInt == -1){
                                        sair = auxInt;
                                    }
                                }else{
                                    System.out.println("Digite um id valido!\n"
                                            + "ou digite -1 p/ sair");
                                    auxInt = idPokemon.nextInt();
                                    if(auxInt == -1){
                                        sair = auxInt;
                                    }
                                }
                            }
                        }
                        //setandoGinasio
                        ginAux.setObjetoGinasio(ginAux);
                        break;
			default:
				System.out.println("Opção está inválida!");
				//tratamento do erro (chamar/executar).
				break;
			}
		} while (opcao != 0);
                
            }
}
