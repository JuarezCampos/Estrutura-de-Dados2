/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.io.IOException;
import trabalho.MedirTempo;

/**
 *
 * @author pedro
 */
public class Trabalho { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /**
         * inicializa o objeto medir tempo de execução
         */
        //MedirTempo medir = new MedirTempo();
        //medir.setTempoInicial(System.nanoTime());
        /**
         * Inicializa o objeto de retornar valores do arquivo csv
         */
               /*

        RetornaValores ret = new RetornaValores();
        int [] vet;
        medir.setTempoInicial(System.nanoTime());
        //vet = ret.getVet(500,0);
        //medir.getTempoFinal(System.nanoTime());
        Ordenacoes ordena = new Ordenacoes();
        //int n = vet.length;
        /**
         * pega os numeros de interações no arquivo de entrada e repete 5 vezes para
         * cada valor de n
         */
        /*
        int numDeN = ret.getEntrada(0);
        for(int i = 1 ; i <= numDeN ; i++){
            for(int j = 0 ; j < 5 ; j++){
                System.out.println(ret.getEntrada(i));
                vet = ret.getVet(ret.getEntrada(i),0);
                int n = vet.length;
                System.out.println("MergeSort");
                medir.setTempoInicial(System.nanoTime());
                ordena.mergeSort(vet, 0, n-1);
                medir.getTempoFinal(System.nanoTime());
                //ordena.imprimeLinha(vet, ret);
                
            }
            
           
        }
        */
        /**
         * mergeSort
         */
        //System.out.println("MergeSort");
        //medir.setTempoInicial(System.nanoTime());
        //ordena.mergeSort(vet, 0, n-1);
        //medir.getTempoFinal(System.nanoTime());
        //ordena.imprime(vet);
        //ordena.imprimeLinha(vet, ret);
        /**
         * Lê outras linhas para o bubbleSort
         */
        //System.out.println("BubbleSort");
        //ordena.bubbleSort(vet, n);
        //ordena.imprime(vet);
        /**
         * Lê outras linhas para insertionSort
         */
        //System.out.println("InsertionSort");
        //ordena.insertionSort(vet, n);
        //ordena.imprime(vet);
        /**
         * Lê outras linhas para quickSort
         * corrigir
         */
        //System.out.println("QuickSort Com pivo");
        //ordena.quickSortP(vet, 0, n-1);
        //ordena.imprime(vet);
        
        //System.out.println("QuickSort Mediana de 3");
        //ordena.recQuickSort(vet, 0, n-1);
        //ordena.imprime(vet);
        
        //System.out.println("QuickSort usando insertionSort");
        //ordena.recQuickSortInsertion(vet, 0, n-1);
        //ordena.imprime(vet);
        /**
         * Lê outras linhas para selectionSort
         */
        //System.out.println("SelectionSort");
        //ordena.selectionSort(vet, n);
        //ordena.imprime(vet);
        /**
         * Lê outras linhas para heapSort
         */
        //System.out.println("HeapSort");
        //ordena.HeapSort(vet, n);
        //ordena.imprime(vet);

        // TODO code application logic here
        
         System.out.println("Sondagem Linear");
        SondagemLinear h1teste = new SondagemLinear(5);
         h1teste.insere(0, -7);
         h1teste.insere(1, -3);
         h1teste.insere(2, 3);
         h1teste.insere(3, 1);
         h1teste.insere(4, 8);
         
         h1teste.imprimir();
         
         System.out.println("");
         System.out.println("DuploHash");
         
         DuploHash dhasht = new DuploHash(5);
         dhasht.insere(0, -7);
         dhasht.insere(1, -3);
         dhasht.insere(2, 3);
         dhasht.insere(3, 1);
         dhasht.insere(4, 8);
         
         dhasht.imprimir();
         
         int teste = dhasht.Busca(1);
         System.out.println("\n " + "O valor da busca de chave 1 " + teste);
         
    }
    
}
