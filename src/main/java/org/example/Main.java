package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System. in);
        System.out.println("Introduce una cadena de 3 caracteres, te diremos si es consecutiva o no en la tabla de caracteres ASCII ");
        String caracteres = teclado.nextLine();
        char uno = caracteres.charAt(0);
        int decim1 = (int) uno;
        char dos = caracteres.charAt(1);
        int decim2 = (int) dos;
        char tres = caracteres.charAt(2);
        int decim3 = (int) tres;
        if (decim1+1==decim2 & decim2+1==decim3){
            System.out.println("Los caracteres " +caracteres +" son consecutivos");
        }
        else {
            System.out.println("Los caracteres " +caracteres+ " no son consecutivos");
        }
    }
}