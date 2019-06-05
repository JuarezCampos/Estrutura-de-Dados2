/*
 * Trabalho de Aspectos Teoricos da Computacao
  
 * Grupo:
 * Juarez de Paula Campos Junior - 201676022
 * Leonardo Silva da Cunha - 201676019
 * Pedro Henrique Delgado Moura - 201776032
 */

package aspectosTeoricosComp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe com todas as funcionalidadades exigidas da aplicacao.
 */
public class Menu {

	static Scanner leitura = new Scanner(System.in);
	ArrayList<String> tagsDigitadas = new ArrayList<String>();
	ArrayList<String> tagsCarregadas = new ArrayList<String>();
	String cmd = "";
        String cmd2 = "";
	String caminho = "";
        LetraNumero testeLN = new LetraNumero();

	/**
	 * Menu que contem as definicoes de cada comando que o usuario pode utilizar. :f
	 * - Realiza a divisao em tags da string do arquivo informado atraves do metodo:
	 * divisaoEmTagsArq. :l - Carrega um arquivo com definicoes de tags atraves do
	 * metodo: definicoesTags. :o - Especifica o caminho do arquivo de saida para a
	 * divisao em tags atraves do metodo: saidaArquivo. :p - Realiza a divisao em
	 * tags da entrada informada atraves do metodo: divisaoEmTags :q - Sair do
	 * programa. :s - Salvar as tags em um arquivo.
	 */
	public void menu() {

		while (true) {
			entrada();

			switch (this.cmd) {
			case ":f":
				System.out.println("[ERRO] Operacao ainda nao inserida (PARTE 2 DO TRABALHO)");
				break;
			case ":l":
				definicoesDeTag(this.caminho);
				break;
			case ":o":
				System.out.println("[ERRO] Operacao ainda nao inserida (PARTE 2 DO TRABALHO)");
				break;
			case ":p":
				System.out.println("[ERRO] Operacao ainda nao inserida (PARTE 2 DO TRABALHO)");
				break;
			case ":s":
				salvarTags(this.caminho);
				break;
			case ":q":
				System.out.println("[INFO] Encerrando execucao.");
				System.exit(0);
			default:
                              cmd2 =  testeLN.confereString(cmd);
                                System.out.println("cmd" + cmd);
				//adicionaTagMemoria(cmd);
				break;
			}
		}

	}

	private void adicionaTagMemoria(String tag) {
		Regex er = new Regex(tag);
		if (er.validaExpressao()) {
			this.tagsDigitadas.add(tag);
			System.out.println("[INFO] TAG adicionada a memoria.");
		}
	}

	/**
	 * (:s) - Metodo que sera responsavel por salvar as tags definidas pelo usuario
	 * em um arquivo .txt O usuario informa o caminho do arquivo As tags que foram
	 * digitadas e salvas na variavel tagsDigitadas serao salvas no arquivo se forem
	 * validas.
	 */
	private void salvarTags(String caminhoTag) {
		Arquivo arq = new Arquivo();

		if (!this.tagsDigitadas.isEmpty()) {
			for (int i = 0; i < this.tagsDigitadas.size(); i++)
				arq.setExpressao(this.tagsDigitadas.get(i), caminhoTag);
			System.out.println("[INFO] TAGS ADICIONADAS AO ARQUIVO.");
			this.tagsDigitadas.clear();
		} else {
			System.out.println("[ERRO] Nao ha tags a serem inseridas.");
			return;
		}
	}

	/**
	 * (:l) - Metodo que carrega definicoes de tags de um arquivo de escolha do
	 * usuario. O usuario informa o caminho do arquivo que contem as tags desejadas.
	 * Todas as tags contidas no arquivo sao salvas no arraylist tagsCarregadas e
	 * sao testadas posteriormente.
	 */
	private void definicoesDeTag(String caminhoTag) {
		Arquivo arq = new Arquivo();
		if ((this.tagsCarregadas = arq.getExpressao(caminhoTag)) != null) {
			System.out.println("[INFO] TAGS DO ARQUIVO: ");
			for (int i = 0; i < this.tagsCarregadas.size(); i++)
				System.out.println(this.tagsCarregadas.get(i));
		}

	}

	/**
	 * Metodo que o usuario define qual sera o caminho do arquivo que serao salvas
	 * as tags.
	 */
	@SuppressWarnings("unused")
	private String saidaArquivo() {
		return "";
	}

	/**
	 * (:f) - Metodo que realiza a divisao em tags da expressao contida em um
	 * arquivo .txt.
	 */
	@SuppressWarnings("unused")
	private void divisaoEmTagsArq(String caminhoString) {

	}

	/**
	 * (:p) - Metodo que realiza a divisao em tags da expressao que o usuario
	 * digitar.
	 */
	@SuppressWarnings("unused")
	private void divisaoEmTags(String expressao) {

	}

	private boolean entrada() {
		String linha = leitura.nextLine();
		if (linha.isEmpty()) {
			System.out.println("[ERRO] NADA INFORMADO");
			return entrada();
		}

		String[] comando = linha.split(" ");
		this.cmd = "";
		this.caminho = "";

		if (linha.charAt(0) != ' ') {
			if (comando[0].charAt(0) == ':') {
				if (comando.length > 0 && comando.length <= 2) {
					if (comando.length == 1) {
						if (comando[0].equals(":q"))
							this.cmd = comando[0];
						else {
							if (!comando[0].equals(":o") && !comando[0].equals(":s") && !comando[0].equals(":l")
									&& !comando[0].equals(":f") && !comando[0].equals(":p")) {
								System.out.println("[ERRO] COMANDO INVALIDO");
								return entrada();
							} else {
								if(comando[0].equals(":p")) {
									System.out.println("[ERRO] EXPRESSAO NAO INFORMADA");
									return entrada();
								}
								System.out.println("[ERRO] CAMINHO NAO INFORMADO");
								return entrada();
							}
						}
					} else {
						this.cmd = comando[0];
						this.caminho = comando[1];
					}
				} else {
					System.out.println("[ERRO] COMANDO INVALIDO");
					return entrada();
				}
			} else
				this.cmd = linha;
		} else {
			System.out.println("[ERRO] COMANDO INICIADO COM ESPACO");
			return entrada();
		}
		return true;
	}

}
