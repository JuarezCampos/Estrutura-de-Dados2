/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmann;

import java.util.PriorityQueue;

/**
 *
 * @author Juarez
 */
public class Huffmann {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String teste = "bananada eh da banana";
        int[] charFreq = new int[256];
        for (char c : teste.toCharArray()) {
            charFreq[c]++;
        }

        
        ArvoreHuff arv = constroiArv(charFreq);
        
        //Resultado das quantidades e codigos de compactacao
        System.out.println("TABELA DE CODIGOS");
        System.out.println("SIMBOLO\tQUANTIDADE\tHUFMANN CODIGO");
        escreveCodigo(arv, new StringBuffer());
        
        //compatar txt
        String codifica = codifica(arv, teste);
        //Mostra txt compatado
        System.out.println("\n TEXTO COMPACTADO");
        System.out.println(codifica);
        
        //decodifica texto
        System.out.println("\n\n TEXTO DECODIFICADO");
        System.out.println(decodifica(arv, codifica));
         
    }

    public static ArvoreHuff constroiArv(int[] charFreq) {
        //Criando um fila de prioridade, a fila eh criada pela ordem de freq do texto
        PriorityQueue<ArvoreHuff> arvore = new PriorityQueue<ArvoreHuff>();
        //Folhas da arv para as letras
        for (int i = 0; i < charFreq.length; i++) {
            if (charFreq[i] > 0) {
                arvore.offer(new FolhaHuff(charFreq[i], (char) i));

            }
        }
        ///percorre todos elementos da fila CRIANDO ARV BIN DE CIMA PRA BAIXO
        while (arvore.size() > 1) {
            //pegamos 2 nos com menor freq
            ArvoreHuff a = arvore.poll();   //retonra o prox da fila ou NULL;
            ArvoreHuff b = arvore.poll();   //retonra o prox da fila ou NULL;
            //cria nos de arvore binaria
            arvore.offer(new NoHuff(a, b));
        }
        //retorno primeiro no da arv
        return arvore.poll();
    }

    public static String codifica(ArvoreHuff arv, String codifica) {
        assert arv != null;

        String textoCodificado = "";
        for (char c : codifica.toCharArray()) {
            textoCodificado += (getCodes(arv, new StringBuffer(), c));
        }
        return textoCodificado; //Retorno texto codificado

    }

    public static String getCodes(ArvoreHuff arv, StringBuffer prefixo, char A) {
        assert arv != null;
        if (arv instanceof FolhaHuff) {
            FolhaHuff folha = (FolhaHuff) arv;
            // retorna texto compactado pra letra
            if (folha.caractere == A) {
                return prefixo.toString();
            }
        } else if (arv instanceof NoHuff) {
            NoHuff nos = (NoHuff) arv;
            //percorrendo a esq da arv
            prefixo.append('0');
            String esq = getCodes(nos.esquerda, prefixo, A);
            prefixo.deleteCharAt(prefixo.length() - 1);

            //percorrendo a dir da arv
            prefixo.append('1');
            String dir = getCodes(nos.direita, prefixo, A);
            prefixo.deleteCharAt(prefixo.length() - 1);

            if (esq == null) {
                return dir;
            } else {
                return esq;
            }
        }
        return null;
    }

    public static void escreveCodigo(ArvoreHuff arvore, StringBuffer prefixo) {
        assert arvore != null;

        if (arvore instanceof FolhaHuff) {
            FolhaHuff folha = (FolhaHuff) arvore;
            // imprime a lista na tela
            System.out.println(folha.caractere + "\t" + folha.frequencia + "\t\t" + prefixo);
        } else if (arvore instanceof NoHuff) {
            NoHuff nos = (NoHuff) arvore;
            prefixo.append('0');
            escreveCodigo(nos.esquerda, prefixo);
            prefixo.deleteCharAt(prefixo.length() - 1);

            //percorrendo a dir da arv
            prefixo.append('1');
            escreveCodigo(nos.direita, prefixo);
            prefixo.deleteCharAt(prefixo.length() - 1);
        }

    }

    public static String decodifica(ArvoreHuff arv, String codificada) {
        assert arv != null;
        String textoDecodificado = "";
        NoHuff nos = (NoHuff) arv;
        for (char codigo : codificada.toCharArray()) {
            if (codigo == '0') { //se eh 0 eh para a esq da arv
                if (nos.esquerda instanceof FolhaHuff) {
                    textoDecodificado += ((FolhaHuff) nos.esquerda).caractere; //retorna valor do no folha do lado esq
                    nos = (NoHuff) arv; //retorna a raiz da arvore;
                } else {
                    nos = (NoHuff) nos.esquerda; //continua a percorrer a arv
                }
            } else if (codigo == '1') {
                if (nos.direita instanceof FolhaHuff) {
                    textoDecodificado += ((FolhaHuff) nos.direita).caractere; //retorna valor do no folha do lado direito
                    nos = (NoHuff) arv; //retorna a raiz da arvore;
                } else {
                    nos = (NoHuff) nos.direita; //continua a percorrer a arv      

                }

            }
        } // sai do laco
        return textoDecodificado;
    }

}
