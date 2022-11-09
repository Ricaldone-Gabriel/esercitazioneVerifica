/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazioneverifica;
import java.util.Scanner;
/**
 *
 * @author gabriel.ricaldone
 */
public class EsercitazioneVerifica {
    /* I.I.S. “Maxwell” – Nichelino
Classe 4° B Info

Esercitazione di Laboratorio di Informatica

Sviluppare un&#39;applicazione JAVA con interfaccia su console che risolva il seguente problema:
Creare un menu che permetta all’utente di:
- inserire 10 stringhe; v
- contare le vocali di ciascuna stringa;
- contare le doppie (esclusi gli spazi) di ciascuna stringa.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] stringhe = new String[10];
        String temp;
        Scanner in = new Scanner(System.in);
        int contVocali = 0,contDoppie = 0,contSpazi = 0;
        for (int i = 0; i < 10; i++) {
            stringhe[i] = in.nextLine();
            stringhe[i] = stringhe[i].toLowerCase();
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < stringhe[i].length(); j++) {
                if (stringhe[i].charAt(j) == 'a' || stringhe[i].charAt(j) == 'e' || stringhe[i].charAt(j) == 'i' || stringhe[i].charAt(j) == 'o' || stringhe[i].charAt(j) == 'u') {
                    contVocali++;
                }
            }
            System.out.println("Nella frase: " + i + "\n\tCi sono " + contVocali + " vocali.");
            contVocali = 0;
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < stringhe[i].length()-1; j++) {
                if(stringhe[i].charAt(j) == stringhe[i].charAt(j+1) && stringhe[i].charAt(j) != ' ') {
                    contSpazi++;
                }
                if(stringhe[i].charAt(j) != stringhe[i].charAt(j+1)) {
                    if (contSpazi == 1) {
                        contDoppie++;
                    }
                    contSpazi = 0;
                }
            }
            System.out.println("Nella frase: " + i + "\n\tCi sono " + contDoppie + " doppie.");
            contDoppie = 0;
        }
    }
}
