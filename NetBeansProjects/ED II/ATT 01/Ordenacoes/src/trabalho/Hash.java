/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.Random;

/**
 *
 * @author Juarez
 */
public abstract class Hash {

    public int tamanhoDaTabela;
    public int[] tabelaHash;
    public int[] chaveID;
    public int [] valores;
    private int cont = 0;
    int colisoes = 0;
    int comparacoes;
    Random aleatorio = new Random();

    public Hash() {
    }

    /**
     * Crio a tabelaHash de acordo com o tamanho da tabela definido e inicio
     * todos o indices como -1;
     *
     * @param tamTabela
     */
    public Hash(int tamTabela) {
        if (tamTabela >= 1) {
            tamanhoDaTabela = tamTabela;
            chaveID = new int[tamanhoDaTabela];
            valores = new int[tamanhoDaTabela];
            tabelaHash = new int[tamanhoDaTabela];
            for (int i = 0; i < tamanhoDaTabela; i++) {//define todos os elementos como -1
                tabelaHash[i] = (-1);
            }
        } else {
            System.out.println("Erro tamanho da tabela inválido");
        }
    }

    public static boolean isPrime(int number) {
        number = Math.abs(number);
        if (number % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Função Hash, deve ser reescrita nas classes filhas
    abstract int hash(int ChaveID, int colisao);

    /**
     * tento inserir a chave na tabela hash quando a posicao foi = -1; caso nao
     * dê eu conto essa colisão e chama a funcao que vai sobrescrever ela no
     * caso sondagens ou hashduplo
     *
     * @param insere
     */
    //Insere a chave na tabela hash, se possivel
    public void insere(int chave, int Values) {
        int indice;
        boolean aux = isPrime(chave);

        if (aux == true);
        indice = hash((chave), cont);
        if (tabelaHash[indice] == -1) {
            tabelaHash[indice] = Values;
        } else {
            colisoes++;
            if (aux == false);
            indice = hash((chave % 3), colisoes);
            if (tabelaHash[indice] == -1) {
                tabelaHash[indice] = Values;
            }
        }
        comparacoes++;
        
        valores[cont] = Values;
        chaveID[cont] = chave;
        cont++;
    }
    
    
    public int Busca(int chave) {
        int indice;
        
        boolean aux = isPrime(chave);
        for (int j = 0; j < tamanhoDaTabela; j++) {//j conta o numero de colisões realizadas
            
            if (aux == true){  // se chave é primo
            indice = hash(chave, j);//busca o valor do indice da tabela
            if (tabelaHash[indice] == -1) {//se a tabela no indice estiver vazia, o Tweet nao esta presente
                comparacoes++;
                break;
            } else if (tabelaHash[indice] == valores[chave]) {//se for encontrado,retorna o TweetID
                comparacoes++;
                return tabelaHash[indice];
            }
            } else{
                indice = hash(chave%3, j);//busca o valor do indice da tabela
            if (tabelaHash[indice] == -1) {//se a tabela no indice estiver vazia, o Tweet nao esta presente
                comparacoes++;
            } else if (tabelaHash[indice] == valores[(chave)]) {//se for encontrado,retorna o TweetID
                comparacoes++;
                return tabelaHash[indice];
                
            }
            }
        }
        System.out.println("Chave não encontrada.");//se a busca for completada, e o tweet nao encontrado, retorna -1
        return -1;
    }

    public void imprimir() {

        for (int i = 0; i < tabelaHash.length; i++) {
            if (tabelaHash[i] != -1) {
                System.out.println("Valor da Tabela Hash posicao " + i + " " + tabelaHash[i]);;
            }

        }
        System.out.println("Numero de colisoes " + colisoes);
        System.out.println("Numero de comparacoes " + comparacoes);

    }
}
