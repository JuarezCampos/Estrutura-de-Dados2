/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacoes;

import java.util.Scanner;

/**
 *
 * @author Juarez
 */
public class Ordenacoes {

    /**
     * @param args the command line arguments
     */
    public Ordenacoes() {
    }

    public static void mergeSort(int vet[], int e, int d) {

        if (e < d) {
            int meio = (e + d) / 2;

            // Ordena primeira e segunda metades
            mergeSort(vet, e, meio);
            mergeSort(vet, meio + 1, d);
            intercala(vet, e, meio, d);
        }

    }

    public static void intercala(int vet[], int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];
        // L -> left; R -> right;

        // Copia elementos do vetor respectivamente para L[] e R[]
        for (i = 0; i < n1; i++) {
            L[i] = vet[l + i];
        }
        for (j = 0; j < n2; j++) {
            R[j] = vet[m + 1 + j];
        }

        // Intercala os vetores L e R de volta para o vet[]
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                vet[k] = L[i];
                i++;
            } else {
                vet[k] = R[j];
                j++;
            }
            k++;
        }

        // Caso haja algum, copia os demais elementos de L[]
        while (i < n1) {
            vet[k] = L[i];
            i++;
            k++;
        }

        // Caso haja algum, copia os demais elementos de R[]
        while (j < n2) {
            vet[k] = R[j];
            j++;
            k++;
        }
    }

    public static void quickSortP(int vet[], int esq, int dir) {
        int pivo;

        if (dir - esq <= 0) {

        } else {

            pivo = vet[dir];
            int particao = partirIt(vet, esq, dir, pivo);
            quickSortP(vet, esq, (particao - 1));
            quickSortP(vet, (particao + 1), dir);

        }
    }

    public static int partirIt(int vet[], int esq, int dir, int pivo) {
        int pontEsq = esq - 1;   //antes do primeiro elemento
        int pontDir = dir;    //depois do pivor
        while (true) {
            while (vet[++pontEsq] < pivo) {
                //nada
            }
            while (pontDir > 0 && vet[--pontDir] > pivo) {
                //nada
            }
            if (pontEsq >= pontDir) {
                break; //se os ponteiros se cruzarem, partição feita
            } else {
                troca(pontEsq, pontDir);  //não cruzado, então trocar elementos
            }

        }
        swap(vet, pontEsq, dir); //restaura o pivor
        return pontEsq;     //volta com a posicao do pivor
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void insertionSort(int vet[], int n) {
        int aux, i, j;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j > 0; j--) ///j sempre compara os numeros anteriores ate chegar em j=0
            {
                if (vet[j] < vet[j - 1]) ///verifico se a posicao que eu estou e menor que a anterior
                {

                    //troca(vet[j],vet[j-1]);
                    aux = vet[j];
                    vet[j] = vet[j - 1];        ///TROCAS
                    vet[j - 1] = aux;
                } else {
                    break;
                }

            }
        }

    }

    public static void selectionSort(int vet[], int n) {
        int menor, aux;
        for (int i = 0; i < n - 1; i++) ///verifico todo o vetor;
        {
            menor = i;  ///fixo o menor valor como o primeiro indice do Vetor(No inicio), e de pois a cada interacao de i;
            for (int j = i + 1; j < n; j++) ///apos fixar o primeiro valor vejo sempre 1 a frente dele (i);
            {
                if (vet[j] < vet[menor]) {
                    menor = j;          ///comparo e entao troco o indice do menor valor pelo de j(j < menor);
                }
            }

            //troca(vet[i],vet[menor]);
            aux = vet[i];
            vet[i] = vet[menor];        ///TROCAS
            vet[menor] = aux;
        }
    }

    public static void bubbleSort(int vet[], int n) {
        int aux, i, j;
        for (i = 0; i < n; i++) ///percorre o vetor n vezes para verificar se esta ordenado;
        {
            for (j = 0; j < n - 1; j++) ///verifica os PARES se o valor de (j+1) e maior que j e faz a troca sempre de PAR em PAR;
            {
                if (vet[j] > vet[j + 1]) {
                    // troca(vet[j], vet[j+1]);
                    aux = vet[j];
                    vet[j] = vet[j + 1];       ///TROCAS
                    vet[j + 1] = aux;
                }
            }
        }
    }

    public static void constroiArvore(int vet[], int posicao, int tamVet) {
        int indFilho1 = 2 * posicao + 1;
        int indFilho2 = indFilho1 + 1;

        if (indFilho1 < tamVet) {

            if (indFilho2 < tamVet) {
                /**
                 * se estou dentro do vetor testo o filho que e maior
                 */
                if (vet[indFilho1] < vet[indFilho2]) {
                    indFilho1 = indFilho2;
                }
            }

            /**
             * comparo filho1 com o pai dele
             */
            if (vet[indFilho1] > vet[posicao]) {
                int aux = vet[indFilho1];
                vet[indFilho1] = vet[posicao];
                vet[posicao] = aux;

                /**
                 * remontagem da arvore depois da troca do filho>pai
                 */
                constroiArvore(vet, indFilho1, tamVet);
            }

        }
    }

    public static void HeapSort(int vet[], int tamVet) {
        int indice, troca;
        for (indice = tamVet / 2; indice >= 0; indice--) {
            constroiArvore(vet, indice, tamVet);
            /**
             * monta a arvore pela primeira vez
             */
        }
        while (tamVet > 0) {
            troca = vet[0];
            vet[0] = vet[tamVet - 1];
            vet[tamVet - 1] = troca;
            constroiArvore(vet, 0, --tamVet);
        }
    }

    private static void troca(int a, int b) {
        int aux = a;
        a = b;
        b = a;
    }

    Scanner leitura = new Scanner(System.in);

    public static void imprime(int vet[]) {

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        // TODO code application logic here
        int[] vets = {3, 6, 8, 9, 1};
        imprime(vets);
        int n = vets.length;
        //mergeSort(vets, 0, n-1);
        //bubbleSort(vets, n);
        //insertionSort(vets, n);
        //quickSortP(vets, 0, n-1);
        //selectionSort(vets, n);
        HeapSort(vets, n);
        imprime(vets);

    }

}
