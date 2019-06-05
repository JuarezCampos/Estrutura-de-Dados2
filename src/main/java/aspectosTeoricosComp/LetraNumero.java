/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspectosTeoricosComp;

import java.util.Arrays;

/**
 *
 * @author Juarez
 */
public class LetraNumero {

    public String confereString(String str) {
       /* 
       String retorno = "z";
        int indice = -1;
        if (str.contains("\\*")) {
            retorno = str.replaceAll("\\*", "*");
        } else if (str.contains("\\\\")) {
            retorno = str.replaceAll("\\\\", "\\");
        } else if (str.contains("\\+")) {
           retorno = str.replaceAll("\\\\+", "+");
            System.out.println("retorno"+ retorno);
        } else if (str.contains("\\.")) {
           retorno = str.replaceAll("\\.", ".");
        } else if (str.contains("\\l")) {
           retorno = str.replaceAll("\\l", "?");
        } else if (str.contains("\\n")) {
           str.replaceAll("\\n", "\n");
        }
*/
        char[] aux = str.toCharArray();
        
        for (int i = 0; i < str.length(); i++) {
            if (((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) || ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))) {
                aux[i] = str.charAt(i);
            } else if (str.charAt(i) == '*' || str.charAt(i) == '\\' || str.charAt(i) == '+' || str.charAt(i) == '.' || str.charAt(i) == '?') {
                aux[i] = str.charAt(i);
            }
            else if(str.charAt(i) == '*' || str.charAt(i) == '\\' || str.charAt(i) == '+' || str.charAt(i) == '.' || str.charAt(i) == '?'){
             aux[i] = ' ';
            }

        }
      return  str = Arrays.toString(aux);
          }
}
