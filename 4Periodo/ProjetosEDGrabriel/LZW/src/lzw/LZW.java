/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lzw;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Juarez
 */
public class LZW {

    public static void main(String[] args) throws IOException {

        comprime("teste.txt");
        descomprime("compressArq.dat");

    }
    
/**
 * Seleciono o arquivo no qual esta meus dados, passo como parametro da funcao e depois para a compressao,
 * crio a estrutura de dicionario juntamente dos valores da string atual e atualiazo os dados a medida que incremento os dados
 * da string passada pelo arquivo.
 * @param nomearq 
 */ 
    
    private static void comprime(String nomearq) {
        int atual, cont;    // proximo caractere de entrada e o proximo a ser gerado
        String[] dicionario = new String[65536];

        for (cont = 0; cont < 256; cont++) {
            dicionario[cont] = "" + (char) cont;
        }
        try {
            FileReader reader = new FileReader(nomearq);    // crio a estrutura de dados para ler o arquivo de entrada
            FileOutputStream saidaArq = new FileOutputStream("compressArq.dat");    // informo qual o tipo/nome do arquivo de saida
            DataOutputStream dataArqSaida = new DataOutputStream(saidaArq); 
            String str = "";
            int last = 0;
            while ((atual = reader.read()) != -1) { // verifico se a string verificada esta no dicionario 
                str += "" + (char) atual;
                boolean adiciona = true;
                for (int i = 0; i < cont; i++) {
                    if (dicionario[i].equals(str)) {   //caso encontra a str no dicionario sim incrementa atual 
                        adiciona = false;               
                        last = i;
                    }
                }
                if (adiciona) {
                    dataArqSaida.writeByte((byte) (last / 256));
                    dataArqSaida.writeByte((byte) (last % 256));
                    dataArqSaida.writeByte((byte) atual);
                    if (cont >= 65536) {
                        cont = 0;
                    }
                    dicionario[cont] = str;
                    cont++;
                    str = "";
                    last = 0;
                }
            }
            dataArqSaida.writeByte((byte) -1);
            reader.close();
            dataArqSaida.close();
            saidaArq.close();
            System.out.println("Arquivo de texto comprimido para compressArq.dat");
        } catch (FileNotFoundException fnfE) {
            System.out.println("Arquivo nao encontrado.");
        } catch (IOException IOE) {
            System.out.println("Excecao IO.");
        }
    }
    
    /**
 * Seleciono o arquivo no qual esta meus dados, passo como parametro da funcao e depois para a descompressao,
 * crio a estrutura de dicionario a medida que verifico a posicao de cada caractere e seu valor correspondende e faco a igualdade com o
 * dicionario, pois os valores sao atualizados sempre que ha novas letras a serem buscadas
 * @param arqDescompressao 
 */ 
    private static void descomprime(String arqDescompressao) {
        byte[] b = new byte[3];
        int cont;
        int[] indice = new int[65536];
        String[] dicionario = new String[65536];
        for (cont = 0; cont < 256; cont++) {
            dicionario[cont] = "" + (char) cont;
        }
        try {
            FileInputStream tr = new FileInputStream(arqDescompressao);
            DataInputStream reader = new DataInputStream(tr);
            FileWriter dataArqSaida = new FileWriter("saidaDecompress.txt");

            while ((b[0] = reader.readByte()) != -1) {
                b[1] = reader.readByte();
                b[2] = reader.readByte();
                int t1 = (int) ((b[0] * 256) + b[1]);
                int t2 = (int) b[2];
                if (cont >= 65536) {
                    cont = 0;
                }
                dicionario[cont] = "" + dicionario[t1] + "" + dicionario[t2];
                cont++;
                dataArqSaida.write(dicionario[t1]);
                dataArqSaida.write(dicionario[t2]);
            }
            reader.close();
            dataArqSaida.close();
            tr.close();
            System.out.println("Arquivo de texto decomprimido para saidaDecompress.txt");
        } catch (FileNotFoundException fnfE) {
            System.out.println("Arquivo nao encontrado.");
        } catch (IOException IOE) {
            System.out.println("Excecao IO.");
        }
    }
}
