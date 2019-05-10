/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class RetornaValores {
    private ArrayList <String> linha = new ArrayList();
    /**
     * Função lê n linhas do arquivo pré-definido.
     * Cada linha lida, é retirado a ',' que separa cada campo e armazena no 
     * ArrayList de string
     * @param n 
     */
    private void getValores(int n) {
        linha.clear();
        RandomAccessFile cont = null;
        try{
            cont = new RandomAccessFile("C:\\Users\\Juarez\\Documents\\NetBeansProjects\\ED II\\ATT 01\\Ordenacoes\\src\\trabalho\\ratings.csv","r");
            Random aleatorio = new Random();
            long tam = cont.length();
            System.out.println("Tamanho do arquivo: "+tam);
            String linha;
            byte [] arrayBytes = new byte[9900];
            while( n > 0){
                cont.seek(aleatorio.nextInt((int)tam));
                cont.read(arrayBytes);
                linha = new String(arrayBytes,StandardCharsets.UTF_8);
                String[] arrayNLinhas = linha.split("\n");
                /*
                eu acho que não precisa, verificar depois.
                */
                //String[] array = arrayNLinhas[1].split(",");
                String strAux = arrayNLinhas[1];
                /*
                essa parte tbm
                */
                //for(int i = 0 ; i < array.length ; i++){
                //    strAux += array[i] + " ";
                        
                //}
                this.linha.add(strAux);
                n--;
                
            }
            /**
             * Julgar se é necessário
             */
            /*
            System.out.println("ArrayLista abaixo");
            for(int i = 0; i < this.linha.size(); i++){
                System.out.println(this.linha.get(i));
            }*/
            
            
        }catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!"+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index não existente!"+e.getMessage());
        }catch(IOException e){
            System.out.println("Erro IO!"+e.getMessage());
        }finally{
                    if(cont != null){
                        try{
                            cont.close();
                        }catch(IOException e){
                            System.out.println("Erro IO!"+e.getMessage());
                        }
                    }
                    
                }
        
    }
    /**
     * Função chama a primeira função que lê o arquivo passando a quantidade de 
     * linhas que serão lidas e retorna um vetor de inteiro da coluna informada.
     * @param n é o número de linhas a ser lidas.
     * @param col é a coluna que será retornada para o programa principal.
     * @return retorna um vetor de inteiro.
     */
    public int [] getVet(int n,int col){
        this.getValores(n);
        int [] val = new int[n];
        for(int i = 0 ; i < this.linha.size() ; i++){
            String[] array = this.linha.get(i).split(",");
            for(int j = 0 ; j < array.length ; j++){
                if(j == col){
                    try{
                        val[i] = Integer.parseInt(array[j]);
                    }catch(NumberFormatException e){
                        double aux = Double.parseDouble(array[j]);
                        System.out.println("Double: "+aux);
                        val[i] = (int)aux;
                    }
                    
                }
            }
        }
        
        return val;
    }
    /**
     * Função que tem como objetivo imprimir a linha já ordenada.
     * @param ret O objeto usado para ler o arquivo
     * @param vet vetor já ordenado.
     */
    void imprimeLinha(RetornaValores ret, int [] vet){
        System.out.println("Linhas abaixo");
            for(int i = 0; i < vet.length; i++){
                for(int k = 0 ; k < ret.linha.size();k++){
                    String[] array = ret.linha.get(k).split(",");
                    for(int j = 0 ; j < array.length ; j++){
                        int aux;
                        try{
                            aux = Integer.parseInt(array[j]);
                        }catch(NumberFormatException e){
                            double aux1 = Double.parseDouble(array[j]);
                            aux = (int)aux1;
                        }
                        if(aux == vet[i]){
                            System.out.println(ret.linha.get(k));
                        }
                    }
                }
            }
    }
    
    public int getEntrada(int repeticao){
        String varQtd = "0";
        try{
            int contAux = 0;
            FileReader entrada = new FileReader("C:\\Users\\Juarez\\Documents\\NetBeansProjects\\ED II\\ATT 01\\Ordenacoes\\src\\trabalho\\entrada.txt");
            BufferedReader lerEntrada = new BufferedReader(entrada);
            String linha = lerEntrada.readLine();
            while(linha != null){
                if(contAux == repeticao){
                   varQtd = linha; 
                }
                linha = lerEntrada.readLine();
                contAux++;
            }
            entrada.close();
        }catch(IOException e){
            System.out.println("Erro ao abrir arquivo de entrada");
        }
        return Integer.parseInt(varQtd);
    }
}
