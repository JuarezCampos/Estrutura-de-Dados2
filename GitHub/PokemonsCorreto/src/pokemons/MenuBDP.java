/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;
import java.util.Scanner;
/**
 *
 * @author pedro
 */


public class MenuBDP {
    /**
     * construtor da classe.
     */
    public MenuBDP(){
        
    }
    /**
     * Tratamento de erro de valor digitado.
     * @param valor
     * @return 
     */
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
    /**
     * Menu do banco de dados de pokemons
     */
    public void menuInicio(){
        Pokedex pokedex = new Pokedex();
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
			
            Scanner auxMenu = new Scanner(System.in);
            menu = erro(auxMenu.next());
            //menu = auxMenu.nextInt();
            
            switch(menu){
                case 0:
                    System.out.println("Finalizando o sistema!");
                    break;
                case 1:
                    System.out.println("\n### Tipos existentes de pokemons! ###");
                    System.out.println("            ================");
                    System.out.println("            |  1 - Agua    |");
                    System.out.println("            |  2 - Fogo    |");
                    System.out.println("            |  3 - Normal  |");
                    System.out.println("            |  4 - Terra   |");
                    System.out.println("            |  5 - Voador  |");
                    System.out.println("            ================\n");
                    int tipoPok;
                    Scanner tipo = new Scanner(System.in);
                    tipoPok = erro(tipo.next());
                    String str;
                    int val;
                    switch(tipoPok){
                        case 1:
                            Agua ag = new Agua();
                            //Setando o nome do pokemon
                            System.out.println("Digite o nome do Pokemon!");
                            Scanner auxStr = new Scanner(System.in);
                            str = auxStr.nextLine();
                            ag.setNome(str);
                            //setando o sexo do pokemon
                            System.out.println("Digite o sexo do Pokemon!");
                            str = auxStr.nextLine();
                            ag.setSexo(str);
                            //setando a habilidade
                            System.out.println("Digite a habilidade do pokemon!");
                            str = auxStr.nextLine();
                            ag.setHabilidade(str);
                            //setando a fraqueza do pokemon
                            System.out.println("Digite a fraqueza do pokemon!");
                            str = auxStr.nextLine();
                            ag.setFraqueza(str);
                            //Setando a vantagem do pokemon
                            System.out.println("Digite a vantagem do pokemon!");
                            str = auxStr.nextLine();
                            ag.setVantagem(str);
                            //setando a descrição do pokemon
                            System.out.println("Digite a descrição do pokemon!");
                            str = auxStr.nextLine();
                            ag.setDescricao(str);
                            //setando a altura do pokemon
                            Scanner auxInt = new Scanner(System.in);
                            System.out.println("Digite a altura do pokemon!");
                            val = erro(auxInt.next());
                            ag.setAltura(val);
                            //setando o peso do pokemon
                            System.out.println("Digite o peso do pokemon!");
                            val = erro(auxInt.next());
                            ag.setPeso(val);
                            //setando a evolução do pokemon
                            System.out.println("O pokemon é uma evolução?\n (1)Sim ou (0)Não");
                            val = erro(auxInt.next());
                            ag.setEvolucao(val);
                            //Setando o id do pokemon pai, se existir
                            if(ag.getEvolucao()!= 0){
                                if(pokedex.getNumPokemon() > 0){
                                    System.out.println("Digite o id(identificador"
                                            + "do pokemon 'pai'!");
                                    val = erro(auxInt.next());
                                    ag.setNumIdEvolucao(val);
                                }else{
                                    System.out.println("Não possui pokemons registrado "
                                            + "na pokedex");
                                }
                            }
                            pokedex.setObjetoPokemon(ag);
                            break;
                        case 2:
                            Fogo fg = new Fogo();
                            //Setando o nome do pokemon
                            System.out.println("Digite o nome do Pokemon!");
                            Scanner auxStrF = new Scanner(System.in);
                            str = auxStrF.nextLine();
                            fg.setNome(str);
                            //setando o sexo do pokemon
                            System.out.println("Digite o sexo do Pokemon!");
                            str = auxStrF.nextLine();
                            fg.setSexo(str);
                            //setando a habilidade
                            System.out.println("Digite a habilidade do pokemon!");
                            str = auxStrF.nextLine();
                            fg.setHabilidade(str);
                            //setando a fraqueza do pokemon
                            System.out.println("Digite a fraqueza do pokemon!");
                            str = auxStrF.nextLine();
                            fg.setFraqueza(str);
                            //Setando a vantagem do pokemon
                            System.out.println("Digite a vantagem do pokemon!");
                            str = auxStrF.nextLine();
                            fg.setVantagem(str);
                            //setando a descrição do pokemon
                            System.out.println("Digite a descrição do pokemon!");
                            str = auxStrF.nextLine();
                            fg.setDescricao(str);
                            //setando a altura do pokemon
                            Scanner auxIntF = new Scanner(System.in);
                            System.out.println("Digite a altura do pokemon!");
                            val = erro(auxIntF.next());
                            fg.setAltura(val);
                            //setando o peso do pokemon
                            System.out.println("Digite o peso do pokemon!");
                            val = erro(auxIntF.next());
                            fg.setPeso(val);
                            //setando a evolução do pokemon
                            System.out.println("O pokemon é uma evolução?\n (1)Sim ou (0)Não");
                            val = erro(auxIntF.next());
                            fg.setEvolucao(val);
                            //Setando o id do pokemon pai, se existir
                            if(fg.getEvolucao()!= 0){
                                if(pokedex.getNumPokemon() > 0){
                                    System.out.println("Digite o id(identificador"
                                            + "do pokemon 'pai'!");
                                    val = erro(auxIntF.next());
                                    fg.setNumIdEvolucao(val);
                                }else{
                                    System.out.println("Não possui pokemons registrado "
                                            + "na pokedex");
                                }
                            }
                            pokedex.setObjetoPokemon(fg);
                            break;
                        case 3:
                            Normal nmr = new Normal();
                            //Setando o nome do pokemon
                            System.out.println("Digite o nome do Pokemon!");
                            Scanner auxStrN = new Scanner(System.in);
                            str = auxStrN.nextLine();
                            nmr.setNome(str);
                            //setando o sexo do pokemon
                            System.out.println("Digite o sexo do Pokemon!");
                            str = auxStrN.nextLine();
                            nmr.setSexo(str);
                            //setando a habilidade
                            System.out.println("Digite a habilidade do pokemon!");
                            str = auxStrN.nextLine();
                            nmr.setHabilidade(str);
                            //setando a fraqueza do pokemon
                            System.out.println("Digite a fraqueza do pokemon!");
                            str = auxStrN.nextLine();
                            nmr.setFraqueza(str);
                            //Setando a vantagem do pokemon
                            System.out.println("Digite a vantagem do pokemon!");
                            str = auxStrN.nextLine();
                            nmr.setVantagem(str);
                            //setando a descrição do pokemon
                            System.out.println("Digite a descrição do pokemon!");
                            str = auxStrN.nextLine();
                            nmr.setDescricao(str);
                            //setando a altura do pokemon
                            Scanner auxIntN = new Scanner(System.in);
                            System.out.println("Digite a altura do pokemon!");
                            val = erro(auxIntN.next());
                            nmr.setAltura(val);
                            //setando o peso do pokemon
                            System.out.println("Digite o peso do pokemon!");
                            val = erro(auxIntN.next());
                            nmr.setPeso(val);
                            //setando a evolução do pokemon
                            System.out.println("O pokemon é uma evolução?\n (1)Sim ou (0)Não");
                            val = erro(auxIntN.next());
                            nmr.setEvolucao(val);
                            //Setando o id do pokemon pai, se existir
                            if(nmr.getEvolucao()!= 0){
                                if(pokedex.getNumPokemon() > 0){
                                    System.out.println("Digite o id(identificador"
                                            + "do pokemon 'pai'!");
                                    val = erro(auxIntN.next());
                                    nmr.setNumIdEvolucao(val);
                                }else{
                                    System.out.println("Não possui pokemons registrado "
                                            + "na pokedex");
                                }
                            }
                            pokedex.setObjetoPokemon(nmr);
                            break;
                        case 4:
                            Terra tr = new Terra();
                            //Setando o nome do pokemon
                            System.out.println("Digite o nome do Pokemon!");
                            Scanner auxStrT = new Scanner(System.in);
                            str = auxStrT.nextLine();
                            tr.setNome(str);
                            //setando o sexo do pokemon
                            System.out.println("Digite o sexo do Pokemon!");
                            str = auxStrT.nextLine();
                            tr.setSexo(str);
                            //setando a habilidade
                            System.out.println("Digite a habilidade do pokemon!");
                            str = auxStrT.nextLine();
                            tr.setHabilidade(str);
                            //setando a fraqueza do pokemon
                            System.out.println("Digite a fraqueza do pokemon!");
                            str = auxStrT.nextLine();
                            tr.setFraqueza(str);
                            //Setando a vantagem do pokemon
                            System.out.println("Digite a vantagem do pokemon!");
                            str = auxStrT.nextLine();
                            tr.setVantagem(str);
                            //setando a descrição do pokemon
                            System.out.println("Digite a descrição do pokemon!");
                            str = auxStrT.nextLine();
                            tr.setDescricao(str);
                            //setando a altura do pokemon
                            Scanner auxIntT = new Scanner(System.in);
                            System.out.println("Digite a altura do pokemon!");
                            val = erro(auxIntT.next());
                            tr.setAltura(val);
                            //setando o peso do pokemon
                            System.out.println("Digite o peso do pokemon!");
                            val = erro(auxIntT.next());
                            tr.setPeso(val);
                            //setando a evolução do pokemon
                            System.out.println("O pokemon é uma evolução?\n (1)Sim ou (0)Não");
                            val = erro(auxIntT.next());
                            tr.setEvolucao(val);
                            //Setando o id do pokemon pai, se existir
                            if(tr.getEvolucao()!= 0){
                                if(pokedex.getNumPokemon() > 0){
                                    System.out.println("Digite o id(identificador"
                                            + "do pokemon 'pai'!");
                                    val = erro(auxIntT.next());
                                    tr.setNumIdEvolucao(val);
                                }else{
                                    System.out.println("Não possui pokemons registrado "
                                            + "na pokedex");
                                }
                            }
                            pokedex.setObjetoPokemon(tr);
                            break;
                        case 5:
                            Voador vd = new Voador();
                            //Setando o nome do pokemon
                            System.out.println("Digite o nome do Pokemon!");
                            Scanner auxStrV = new Scanner(System.in);
                            str = auxStrV.nextLine();
                            vd.setNome(str);
                            //setando o sexo do pokemon
                            System.out.println("Digite o sexo do Pokemon!");
                            str = auxStrV.nextLine();
                            vd.setSexo(str);
                            //setando a habilidade
                            System.out.println("Digite a habilidade do pokemon!");
                            str = auxStrV.nextLine();
                            vd.setHabilidade(str);
                            //setando a fraqueza do pokemon
                            System.out.println("Digite a fraqueza do pokemon!");
                            str = auxStrV.nextLine();
                            vd.setFraqueza(str);
                            //Setando a vantagem do pokemon
                            System.out.println("Digite a vantagem do pokemon!");
                            str = auxStrV.nextLine();
                            vd.setVantagem(str);
                            //setando a descrição do pokemon
                            System.out.println("Digite a descrição do pokemon!");
                            str = auxStrV.nextLine();
                            vd.setDescricao(str);
                            //setando a altura do pokemon
                            Scanner auxIntV = new Scanner(System.in);
                            System.out.println("Digite a altura do pokemon!");
                            val = erro(auxIntV.next());
                            vd.setAltura(val);
                            //setando o peso do pokemon
                            System.out.println("Digite o peso do pokemon!");
                            val = erro(auxIntV.next());
                            vd.setPeso(val);
                            //setando a evolução do pokemon
                            System.out.println("O pokemon é uma evolução?\n (1)Sim ou (0)Não");
                            val = erro(auxIntV.next());
                            vd.setEvolucao(val);
                            //Setando o id do pokemon pai, se existir
                            if(vd.getEvolucao()!= 0){
                                if(pokedex.getNumPokemon() > 0){
                                    System.out.println("Digite o id(identificador"
                                            + "do pokemon 'pai'!");
                                    val = erro(auxIntV.next());
                                    vd.setNumIdEvolucao(val);
                                }else{
                                    System.out.println("Não possui pokemons registrado "
                                            + "na pokedex");
                                }
                            }
                            pokedex.setObjetoPokemon(vd);
                            break;
                        default:
                            System.out.println("Tipo de pokemon informado não existe!");
                    }
                    break;
                case 2:
                    pokedex.getObjetoPokemonLista();
                    break;
                case 3:
                    if(pokedex.getNumPokemon() != 0){
                        int auxInd;
                        System.out.println("Digite o id do pokemon");
                        Scanner indDelete = new Scanner(System.in);
                        auxInd = erro(indDelete.next());
                        pokedex.excluiPokemon(auxInd);
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
        }while(menu != 0);
    }
        
    
}
